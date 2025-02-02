# 네트워크 생성
docker network create redis-network

# Redis 컨테이너 실행
docker run --name fintech-redis \
-p 6379:6379 \
--network redis-network \
-d redis:latest