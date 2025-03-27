#!/bin/bash

# Переменные
COMPOSE_FILE="docker-compose.yml"  # Укажите путь к вашему docker-compose.yml
PROJECT_NAME="apartment"          # Укажите имя вашего проекта (опционально)

# Шаг 1: Остановить и удалить контейнеры, сети и тома
echo "Остановка и удаление контейнеров, сетей и томов..."
docker compose -f $COMPOSE_FILE -p $PROJECT_NAME down -v --rmi all

# Шаг 2: Удалить "висячие" образы (опционально)
echo "Удаление висячих образов..."
docker image prune -f

# Шаг 3: Перезапуск Docker Compose
echo "Перезапуск Docker Compose..."
docker compose -f $COMPOSE_FILE -p $PROJECT_NAME up -d

# Шаг 4: Проверка статуса контейнеров
echo "Проверка статуса контейнеров..."
docker compose -f $COMPOSE_FILE -p $PROJECT_NAME ps

echo "Готово!"