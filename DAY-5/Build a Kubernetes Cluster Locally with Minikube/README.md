#  Kubernetes Minikube

##  Objective
This project demonstrates how to **deploy and manage applications in Kubernetes** locally using **Minikube, kubectl, and Docker**.

By completing this, you'll understand:
- How to set up a Kubernetes cluster locally
- How to create and apply deployment & service manifests
- How to expose an application
- How to scale deployments
- How to view resource details and logs

---

##  Tools Used
- **Minikube** – to run Kubernetes locally
- **kubectl** – to interact with the Kubernetes API
- **Docker** – container runtime for Minikube

---


##  Prerequisites

Make sure you have the following installed:
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [Minikube](https://minikube.sigs.k8s.io/docs/start/)
- [kubectl](https://kubernetes.io/docs/tasks/tools/)


Verify installations:

```bash
docker --version
minikube version
kubectl version --client
```

 ## Steps to Run the Project

## 1️ Start Minikube

Start a local Kubernetes cluster using Docker driver:

```
minikube start --driver=docker
```


Verify the cluster:

```
kubectl cluster-info
kubectl get nodes
```


 Expected Output:

NAME      -     STATUS    -    ROLES     -          AGE  -     VERSION

minikube   -    Ready        control-plane   -    2m    -    v1.31.0



## 2️ Create and Apply Deployment

Create deployment.yaml


Apply deployment:
```
kubectl apply -f deployment.yaml
```

Check pods:

```
kubectl get pods
```

## 3️ Create and Apply Service

Create service.yaml

Apply service:
```
kubectl apply -f service.yaml
```

Check services:
```
kubectl get svc
```
## 4️ Access the Application

Option 1 – Using Minikube IP + NodePort

```
minikube ip
# Example output: 192.168.49.2

kubectl get svc nginx-service
# Example output: 80:31518/TCP

# Access in browser:
http://192.168.49.2:31518
```

Option 2 – Using Port Forwarding (Preffered)

kubectl port-forward service/nginx-service 8080:80

Open browser at:
```
http://localhost:8080
```

## 5️ Scale the Deployment

```
kubectl scale deployment nginx-deployment --replicas=4
kubectl get pods
```


## 6️  Describe Deployment & View Logs

```
kubectl describe deployment nginx-deployment
kubectl logs <pod-name>
```
