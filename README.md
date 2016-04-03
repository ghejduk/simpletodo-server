# Backend application for Android ToDo app.

## Setup project

1. Build application `mvn clean package docker:build`
2. Run docker project `docker-compose up -d`
3. Import db schema `docker exec -i simpletodoserver_mysql_1 mysql -uroot -pchangeme simpletodo < docker/mysql/schema.sql`
