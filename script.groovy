def buildApp(){
  echo 'building the appliation'
}
def testApp(){
  echo 'testing the appliation'
}
def deployApp(){
  echo 'deploying the appliation'
  echo "deploying version ${params.version}"
}
return this 
