pipeline {   
    agent any 

    tools {
        maven 'maven'
    }

    stages {

        stage("Build Jar") { 
            steps {
                echo "Building the application..."
                sh "mvn clean package"
            }
        }

        stage("Build & Push Docker Image") {
            steps {
                echo "Building the Docker image..."

                sh "docker build -t tayyab001/java_app:jma2.0 ."

                withCredentials([
                    usernamePassword(
                        credentialsId: 'docker-hub',
                        usernameVariable: 'USER',
                        passwordVariable: 'PASS'
                    )
                ]) {
                    sh 'echo $PASS | docker login -u $USER --password-stdin'
                    sh 'docker push tayyab001/java_app:jma2.0'
                }
            }
        }

        stage("Deploy") {
            steps {
                echo "Deploying the application..."
            }
        }
    }
}
