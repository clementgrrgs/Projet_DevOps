# Projet_DevOps
ESTIAM projet DevOps


Pour lancer ce projet créer une instance Jenkins avec la commande :

sudo docker container run -p 8080:8080 -v jenkins_home:/var/jenkins_home --name jenkins --rm jenkins/jenkins:lts

Dans Jenkins créer un job qui démarre avec le fichier groovy présent dans ce répository:
Gestion de code source: 
    Git
    Repository URL : https://github.com/clementgrrgs/Projet_DevOps
    Branch Specifier : V1

Build: 
    Look on Filesystem
    DSL Scripts : config.groovy
