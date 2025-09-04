### 🚀 CI/CD Pipeline with GitHub Actions & Docker

This project demonstrates a complete CI/CD pipeline using:

GitHub Actions → CI/CD automation

Docker & Docker Hub → containerization & image registry

Nginx → serving a static website

(Optional) Minikube → run containers on local Kubernetes

### 📂 Project Structure
ci-cd-docker-pipeline/
│── index.html              # Static website
│── style.css               # Styling
│── Dockerfile              # Build Docker image
│── docker-compose.yml      # Run container locally
│── README.md               # Project documentation

### ⚙️ CI/CD Workflow

The GitHub Actions workflow (.github/workflows/ci-cd.yml) does the following:

Checkout Code → Pulls latest code from repo.

Login to DockerHub → Authenticates with Docker Hub using secrets.

Build Docker Image → Creates image from Dockerfile.

Push Image → Uploads image to Docker Hub.

### 🐳 Run Locally
Using Docker
```
docker pull <your-dockerhub-username>/ci-cd-static-site:latest
docker run -d -p 8080:80 <your-dockerhub-username>/ci-cd-static-site:latest
```

Then open 👉 http://localhost:8080

### Using Docker Compose
```
docker-compose up -d
```

### 🔑 GitHub Secrets Setup

In your repo → Settings → Secrets → Actions:

DOCKERHUB_USERNAME → Your Docker Hub username

DOCKERHUB_TOKEN → Docker Hub Access Token

### ✅ Deliverables

GitHub Repo with workflows and Docker setup

Docker Image on Docker Hub

CI/CD Workflow Results (GitHub Actions logs)

Screenshot of the deployed app running locally
