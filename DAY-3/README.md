## USE TERRAFORM TO BUILD DOCKER IMAGE AND PUSH THE IMAGE TO DOCKER HUB

1. Create a New Repository in DockerHub

2. Open VScode & Create a Folder
   1. create a build_docker_images.sh file
  
       configure your docker_id & docker-repo

   3. create a DockerFile
      
   5. create a terraform file (ec2.tf)

      1. configure aws provider with proper credentials
      2. configure ingress
      3. configure Launch EC2 instance
      4. ssh into the ec2 instance
      5. from your computer to the ec2 instance
      6. copy the dockerfile from your computer to the ec2 instance
      7. copy the build_docker_image.sh from your computer to the ec2 instance
      8. set permissions and run the build_docker_image.sh file
     
3. Open terminal in VScode

   ```
   terraform init
   ```

   ```
   terraform plan
   ```

   ```
   terraform apply
   ```

   ```
   terraform destory
   ```
