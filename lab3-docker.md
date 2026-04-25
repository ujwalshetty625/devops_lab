# LAB 3: Docker + Docker Compose

## Build Image
docker build -t flask-app .

## Run Container
docker run -p 5000:5000 flask-app

## Test
http://localhost:5000  

## Push to Docker Hub
docker login  
docker tag flask-app username/flask-app  
docker push username/flask-app  

## Docker Compose Run
docker-compose up --build  

## Folder Structure
app1/  
app2/  
docker-compose.yml  

## Common Errors
- port in use → stop container  
- module not found → check requirements.txt  
- docker not running → start Docker Desktop  

## Viva Lines
Docker = container platform  
Container = isolated environment  
Dockerfile = build instructions  
Docker Compose = multi-container tool  