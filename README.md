# ELEVATE_LABES 🚀

This project is a simple Node.js application to learn and demonstrate how **CI/CD automation** works using **GitHub Actions** and **DockerHub**.

##  What's Inside

- A basic **Node.js app** (`nodejs-demo-app`)
- **Dockerfile** to containerize the app
- **GitHub Actions workflow** (`.github/workflows/main.yml`) to automate:
  - Docker login
  - Docker build
  - Docker push to DockerHub

##  CI/CD Workflow Overview

Every time you push code to GitHub:

1. **GitHub Actions** runs automatically.
2. It logs in to DockerHub using your secrets.
3. Builds a Docker image of the app.
4. Pushes that image to your DockerHub repository.

>  No manual work needed — it all happens automatically!

##  DockerHub Link

Once the pipeline runs successfully, your Docker image will be available at:

**`https://hub.docker.com/r/<your-username>/nodejs-demo-app`**

(Replace `<your-username>` with your DockerHub username.)

##  How to Use or Contribute

1. Clone this repo:
   ```bash
   git clone https://github.com/sanjayhar/ELEVATE_LABES.git

2. Go to the Node.js app folder:

```
cd ELEVATE_LABES/DAY-1/nodejs-demo-app

```
3. Run the app locally:

```
npm install
npm start

```
4. Or pull the Docker image (if pushed):

```
docker pull sanjayharish/nodejs-demo-app
docker run -p 3000:3000 sanjayharish/nodejs-demo-app

```

### Project Goals
Understand Docker and containerization.

Learn how to automate deployments with GitHub Actions.

Practice building a real-world DevOps pipeline.
