pipeline {
    agent any
    
    tools {
        gradle 'Gradle'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio desde GitHub
                git branch: 'free-range-testers-feature', url: 'git@github.com:Nymshera/selenium-test.git'

            }
        }
        stage('Build') {
            steps {
                // Compilar el proyecto con Gradle
                sh 'gradle test -Dcucumber.filter.tags="@Sections"' 
            }
        }
    }
}

