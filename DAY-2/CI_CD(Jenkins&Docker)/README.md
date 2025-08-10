## Create a  Jenkins Pipeline for CI/CD

Objective: Set up a basic Jenkins pipeline to automate the process of building and deploying an application.

Tools: Jenkins, Docker

Deliverables: A Jenkins pipeline file (Jenkinfile) to build and deploy an app.


### Steps to Create a  Jenkins Pipeline for CI/CD

### 1. Crate a EC2 Instances in AWS.
### 2. Copy the Public IP & open terminal
   ```
   ssh -i path to the keypair.pem ubuntu@*******
   ```
### 3. Run the below commands to install Java and Jenkins

  Install Java

```
  sudo apt update
  sudo apt install openjdk-17-jre
```

  Verify Java is Installed

  ```
  java -version
  ```

  Now, you can proceed with installing Jenkins

```
  curl -fsSL https://pkg.jenkins.io/debian/jenkins.io-2023.key | sudo tee \
    /usr/share/keyrings/jenkins-keyring.asc > /dev/null
  echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
    https://pkg.jenkins.io/debian binary/ | sudo tee \
    /etc/apt/sources.list.d/jenkins.list > /dev/null
  sudo apt-get update
  sudo apt-get install jenkins

```
  
**Note: ** By default, Jenkins will not be accessible to the external world due to the inbound traffic restriction by AWS. Open port 8080 in the inbound traffic rules as show below.

EC2 > Instances > Click on

In the bottom tabs -> Click on Security

Security groups

Add inbound traffic rules as shown in the image (you can just allow TCP 8080 as well, in my case, I allowed All traffic).

Login to Jenkins using the below URL:

http://:8080 [You can get the ec2-instance-public-ip-address from your AWS EC2 console page]

Note: If you are not interested in allowing All Traffic to your EC2 instance 1. Delete the inbound traffic rule for your instance 2. Edit the inbound traffic rule to only allow custom TCP port 8080

After you login to Jenkins, - Run the command to copy the Jenkins Admin Password - sudo cat /var/lib/jenkins/secrets/initialAdminPassword - Enter the Administrator password

 ### 4. Install the Docker Pipeline plugin in Jenkins:
   
Log in to Jenkins.

Go to Manage Jenkins > Manage Plugins.

In the Available tab, search for "Docker Pipeline".

Select the plugin and click the Install button.

Restart Jenkins after the plugin is installed.


  ### 5. Docker Slave Configuration
  
Run the below command to Install Docker


```
      sudo apt update
      sudo apt install docker.io
```

Grant Jenkins user and Ubuntu user permission to docker deamon.

      
```
    sudo su - 
    usermod -aG docker jenkins
    usermod -aG docker ubuntu
    systemctl restart docker
```

Once you are done with the above steps, it is better to restart Jenkins.

http://<ec2-instance-public-ip>:8080/restart
The docker agent configuration is now successful.



### 6. Create a CI_pipeline and CD_pipeline in Jenkins srperately

write a Script in the CI_pipeline and CD_pipeline seperately

and then -> Apply 

BUILD NOW
