# LAB 4: Kubernetes

## Start Cluster

minikube start --driver=docker  

---

## Check Nodes

kubectl get nodes  

---

## NGINX Pod

kubectl run nginx-pod --image=nginx  
kubectl get pods  

---

## Expose Pod

kubectl expose pod nginx-pod --type=NodePort --port=80  

---

## Access

minikube service nginx-pod  

---

## Flask Deployment

kubectl create deployment flask-deploy --image=username/flask-app  

---

## Expose Deployment

kubectl expose deployment flask-deploy --type=NodePort --port=5000  

---

## Access

minikube service flask-deploy  
