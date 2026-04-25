# LAB 4: Kubernetes (Minikube)

## Start Cluster
minikube start --driver=docker  

## Check Nodes
kubectl get nodes  

## Create Pod
kubectl run nginx-pod --image=nginx  

## Check Pods
kubectl get pods  

## Expose Pod
kubectl expose pod nginx-pod --type=NodePort --port=80  

## Access
minikube service nginx-pod  

## Deploy Flask App
kubectl create deployment flask-deploy --image=username/flask-app  

## Expose Deployment
kubectl expose deployment flask-deploy --type=NodePort --port=5000  

## Access App
minikube service flask-deploy  

## Debug Commands
kubectl get all  
kubectl describe pod <pod-name>  
kubectl logs <pod-name>  

## Common Errors
- image not found → wrong Docker Hub name  
- pod not running → check logs  
- service not opening → use minikube service  

## Viva Lines
Kubernetes = orchestration tool  
Pod = smallest unit  
Deployment = manages pods  
Service = exposes app  