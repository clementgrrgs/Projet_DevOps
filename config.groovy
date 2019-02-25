job('groovy-job') {
    scm {
        git('https://github.com/clementgrrgs/ESTIAM-DevOpTP3.git')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {       
    }
}
