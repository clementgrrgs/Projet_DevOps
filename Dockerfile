FROM ubuntu:18.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update -y && apt-get upgrade -y

RUN mkdir project

COPY /Project ../var/www/html
RUN cd ./Project
RUN docker-compose up

