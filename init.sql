CREATE TABLE IF NOT EXISTS public.city (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS public.apartment_address (
    id SERIAL PRIMARY KEY,
    city_id INTEGER NOT NULL,
    street VARCHAR(100) NOT NULL,
    house VARCHAR(10) NOT NULL,
    flat VARCHAR(10) NOT NULL,
    CONSTRAINT fk_city FOREIGN KEY (city_id) REFERENCES city(id) ON DELETE RESTRICT,
    CONSTRAINT unique_address UNIQUE (city_id, street, house, flat)
);

CREATE INDEX idx_apartment_address_city_id ON apartment_address (city_id);

INSERT INTO public.city (name) VALUES
('Вологда'),
('Москва'),
('Санкт-Петербург');

CREATE TABLE IF NOT EXISTS public.item_categories (
    id SERIAL PRIMARY KEY,
    category VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS public.items (
    id SERIAL PRIMARY KEY,
    category_id INTEGER NOT NULL,
    item_name TEXT NOT NULL UNIQUE,
    CONSTRAINT fk_categories FOREIGN KEY (category_id) REFERENCES item_categories(id) ON DELETE RESTRICT
);

CREATE INDEX idx_items_category_id ON items (category_id);
