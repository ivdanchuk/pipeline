pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven-3.8.4"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/ivdanchuk/pipeline.git'
				

                bat "mvn clean package"
            }

        }
    }
}
