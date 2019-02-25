job('JobV1') {
    scm {
        git('https://github.com/clementgrrgs/ESTIAM-DevOpTP3.git','V1')
    }
    triggers {
        githubPush()
    }
    steps {
	 docker(docker-compose up)
	 dockerBuildAndPublish {
            repositoryName('clementgrrgs/ESTIAM-DevOpTP3')
	 }       
    }
}
