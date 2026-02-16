pipeline {   
    agent any 

   /* tools {
        maven 'maven'
    }*/

    stages {

        stage("test") { 
            steps {
                echo "testing the application from branch $BRANCH_NAME"
            }
        }
    
        stage("building") {
            when{
                expression {
                    BRANCH_NAME == "main"
                }
            }
            steps {
                    
                echo "Building the application.."
                

              /*  sh "docker build -t tayyab001/java_app:jma2.0 ."

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
            } */
        }

        stage("Deploy") {
            when {
                expression{
                    BRANCH_NAME == "main"
                }
            }
            steps {
                echo "Deploying the application..."
            }
        }
    }
}
