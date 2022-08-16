# For docker api and docker db with bridge network:
mvn clean package
docker image rm shaiful365/spring-postgre-docker
docker build -t shaiful365/spring-postgre-docker .
docker-compose -f docker-compose-docker-api-and-docker-db.yml up



# For local api and docker db with bridge network:
docker-compose  -f docker-compose-local-api-and-docker-db.yml up
mvn clean spring-boot:run
docker-compose  -f docker-compose-local-api-and-docker-db.yml down



# docker api and local db
mvn clean package
docker image rm shaiful365/spring-postgre-docker
docker build -t shaiful365/spring-postgre-docker .
docker-compose  -f docker-compose-docker-api-and-local-db.yml up
docker-compose  -f docker-compose-docker-api-and-local-db.yml down
