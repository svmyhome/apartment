-- Проверка и создание базы данных apartment, если она не существует
DO
$$
    BEGIN
        IF NOT EXISTS (SELECT 1 FROM pg_database WHERE datname = 'apartment') THEN
            CREATE DATABASE apartment;
        END IF;
    END
$$;

-- Подключение к базе данных apartment
\c apartment;

-- Создание таблицы city
CREATE TABLE IF NOT EXISTS public.account
(
    id   SERIAL PRIMARY KEY,
    account VARCHAR(100) NOT NULL UNIQUE,
    balance DECIMAL(10, 2) NOT NULL
);

-- Создание таблицы city
CREATE TABLE IF NOT EXISTS public.city
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

-- Создание таблицы apartment_address
CREATE TABLE IF NOT EXISTS public.apartment_address
(
    id          SERIAL PRIMARY KEY,
    account_id  INTEGER      NOT NULL,
    city_id     INTEGER      NOT NULL,
    street      VARCHAR(100) NOT NULL,
    house       VARCHAR(10)  NOT NULL,
    flat_number VARCHAR(10)  NOT NULL,
    CONSTRAINT fk_city FOREIGN KEY (city_id) REFERENCES city (id) ON DELETE RESTRICT,
    CONSTRAINT fk_account FOREIGN KEY (account_id) REFERENCES account (id) ON DELETE RESTRICT,
    CONSTRAINT unique_address UNIQUE (city_id, street, house, flat_number)
);

-- Создание таблицы rooms
CREATE TABLE IF NOT EXISTS public.rooms
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(25) NOT NULL UNIQUE
);

-- Создание индекса для apartment_address
CREATE INDEX idx_apartment_address_city_id ON apartment_address (city_id);

-- Создание таблицы item_categories
CREATE TABLE IF NOT EXISTS public.item_categories
(
    id       SERIAL PRIMARY KEY,
    category VARCHAR(100) NOT NULL UNIQUE
);

-- Создание таблицы items
CREATE TABLE IF NOT EXISTS public.items
(
    id          SERIAL PRIMARY KEY,
    category_id INTEGER NOT NULL,
    item_name   TEXT    NOT NULL UNIQUE,
    CONSTRAINT fk_categories FOREIGN KEY (category_id) REFERENCES item_categories (id) ON DELETE RESTRICT
);

-- Создание индекса для items
CREATE INDEX idx_items_category_id ON items (category_id);

-- Создание таблицы apartment_stuff
CREATE TABLE IF NOT EXISTS public.apartment_stuff
(
    id      SERIAL PRIMARY KEY,
    flat_id INTEGER NOT NULL,
    room_id INTEGER NOT NULL,
    item_id INTEGER NOT NULL,
    CONSTRAINT fk_flat FOREIGN KEY (flat_id) REFERENCES apartment_address (id) ON DELETE RESTRICT,
    CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES rooms (id) ON DELETE RESTRICT,
    CONSTRAINT fk_item FOREIGN KEY (item_id) REFERENCES items (id) ON DELETE RESTRICT
);


-- Вставка начальных данных в таблицу city
INSERT INTO public.city (name)
VALUES ('Вологда'),
       ('Москва'),
       ('Санкт-Петербург')
ON CONFLICT (name) DO NOTHING;
-- Игнорировать, если данные уже существуют

-- Вставка начальных данных в таблицу rooms
INSERT INTO public.rooms (name)
VALUES ('Коридор'),
       ('Сан узел'),
       ('Спальня'),
       ('Гостиная')
ON CONFLICT (name) DO NOTHING;
-- Игнорировать, если данные уже существуют