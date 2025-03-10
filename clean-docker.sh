#!/bin/bash

# Удалить все контейнеры
docker rm -f $(docker ps -aq) 2>/dev/null

# Удалить все образы
docker rmi -f $(docker images -aq) 2>/dev/null

# Удалить все тома
docker volume rm $(docker volume ls -q) 2>/dev/null

# Удалить все сети
docker network rm $(docker network ls -q) 2>/dev/null

echo "Docker очищен!"