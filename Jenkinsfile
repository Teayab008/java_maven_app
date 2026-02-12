def gv
pipeline {   
    agent any 
   parameters {
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
        }
    
        stage("build1") { 
          steps {
                script {
                    gv.buildApp()
                }
            }
        }
  
         stage("test1") {
                  when {
                      expression{
                        params.executeTests
                      }
                }
                 steps {
 script {
                    gv.testApp()
                }
            }
        }

         stage("deploy1") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }  
        }               
    }

