//def gv
pipeline {   
    agent any 
    tools {
        maven 'maven-3.9'
    }
  /* parameters {
       //string (name: 'version', defaultValue: '', description: 'version to deploy on prod')
       choice (name: 'version', choices:['1.1.0','1.2.0','1.3.0'], description: '')
       booleanParam(name: 'executeTests', defaultValue: false, description:'' )
   } 
    stages {
        stage("init"){
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }  */
    
        stage("build jar ") { 
          steps {
                script {
                    echo "building the applications..."
                    sh "mvn package..."
                }
            }
        }
  
         stage("building image") {
                 steps {
 script { 
     echo "building the docker image "
     withCredentials([usernamePass(credentialsId: 'docker-hub' , usernameVariable: 'USER' , passwordVariable: 'PASS')]){
         sh 'docker build -t tayyab001/java_app:jma2.0 .'
         sh 'echo $PASS | docker login -u $USER --password-stdin'
         sh 'docker push tayyab001/java_app:jma2.0'
     } 
                }
            }
        }
 
         stage("deploy1") {
            steps {
                script {
                  echo "deploying the application..."
                }
            }
        }  
        }               
    }

