# docker start
docker run --name mysql -e MYSQL_ROOT_HOST=localhost -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=db -e MYSQL_USER=user -e MYSQL_PASSWORD=password  -d -p 1521:3306 mysql:8.1.0