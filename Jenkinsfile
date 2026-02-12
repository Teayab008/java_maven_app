pipeline {   
    agent any 
   parameters {
       //string (name: 'version', defaultValue: '', description: 'version to deploy on prod')
       choice (name: 'version', choices:['1.1.0','1.2.0','1.3.0'], description: '')
       booleanParam(name: 'executeTests', defaultValue: true, description:'' )
   }
    stages {
    
        stage("build1") { 
            steps {
                echo 'building the applications ......'
            }
        }
  
         stage("test1") {
            steps {
                when {
                    expression{
                        params.executeTests
                    }
                }
               echo 'testing the applications ......'
            }
        }

         stage("deploy1") {
            steps {
               echo 'deploying the applications ......'
                echo "deploying version ${params.version}"
            }
        }  
        }               
    }

