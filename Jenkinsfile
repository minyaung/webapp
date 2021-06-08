pipeline {	 
   agent any	 
   stages {     	 
      stage("Compile") {          	 
         steps {               	 
            sh "mvn compile"          	 
         }     	 
      }     	 
      stage("Unit test") {          	 
         steps {               	 
            sh "mvn test"          	 
         }     	 
      }	 
      stage("Package") {          	 
         steps {               	 
            sh "mvn package"          	 
         }     	 
      }	 
   }
}
