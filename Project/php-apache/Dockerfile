
FROM php:7.2.1-apache
RUN docker-php-ext-install pdo pdo_mysql mysqli
RUN chmod 755 -R /var/www/*
RUN chmod 755 -R /etc/apache2/apache2.conf

RUN echo "ServerName www.samplephpwebsite.com" >> /etc/apache2/apache2.conf
