pipeline {
    agent any   
    stages {
        stage('Fetch Code') {
            steps {
                git 'https://github.com/Gurudath-S/devops2.git'
            }
        }
         
        stage('Build and Test') {
            steps {
                bat 'mvn clean install'
            }
        }
        
        stage('Deploy to Tomcat') {
            steps {
                bat '"C:\Users\abhi\Downloads\apache-tomcat-9.0.73\bin\shutdown.bat" -port 8080'
                bat 'copy target/devops2.war "C:\\Users\\abhi\\Downloads\\apache-tomcat-9.0.73\\webapps\\"'
                bat '"C:\Users\abhi\Downloads\apache-tomcat-9.0.73\bin\\startup.bat"'
            }
        }
    }
}
