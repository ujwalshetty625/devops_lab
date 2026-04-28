# LAB 3: Docker

## Flask App

app.py

    from flask import Flask

    app = Flask(__name__)

    @app.route('/')
    def home():
        return "Hello from Dockerized Flask App!"

    if __name__ == '__main__':
        app.run(host='0.0.0.0', port=5000)

---

requirements.txt

    flask

---

Dockerfile

    FROM python:3.9-slim

    WORKDIR /app

    COPY requirements.txt .
    RUN pip install -r requirements.txt

    COPY . .

    EXPOSE 5000

    CMD ["python", "app.py"]

---

## Commands

docker build -t flask-app .  
docker run -p 5000:5000 flask-app  

---

## Push to Docker Hub

docker login  
docker tag flask-app username/flask-app  
docker push username/flask-app  

---

## Multi-Container

docker-compose.yml

    version: "3.9"
    services:
      app1:
        build: ./app1
        ports:
          - "5000:5000"

      app2:
        build: ./app2
        depends_on:
          - app1

---

## Run

docker-compose up --build
