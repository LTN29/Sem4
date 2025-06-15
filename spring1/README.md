## 1. Prerequisite
  - Cài đặt JDK 21+ nếu chưa cài đặt thì [cài đặt JDK](https://www.oracle.com/cn/java/technologies/downloads/)
  - Cài đặt Maven 3.5+ nếu chưa cài đặt thì [cài đặt Maven](https://maven.apache.org/download.cgi)
  - Cài đặt Eclipse nếu chưa thì [cài đặt Eclipse](https://www.eclipse.org/downloads/packages/)
  - Cài đặt IntelliJ nếu chưa thì [cài đặt IntelliJ](https://www.jetbrains.com/idea/download/)
  - Cài đặt Docker nếu chưa thì [cài đặt Docker](https://www.docker.com/products/docker-desktop/)

## 2. Technical Stacks
  - Java 21
  - Maven 3.5+
  - Spring boot 3.5.0
  - Spring Data Validation
  - Spring Data JPA
  - MsSql/Mysql (Optional)
  - Lombok
  - DevTools
  - Docker
  - Docker compose
3. Build & run Application
   - Run application bơi mvnw tại folder 'backend-service'
```shell
    ./mvnw spring-boot:run
````
   - Run application bởi Docker 
```shell
    mvn clean install -P dev
    docker build -t backend-service:latest .
    docker run -it -p 8080:8080 --name backend-service backend-service:latest
```
4. Test
    - Check health với cURL 
```bash
  curl --location 'http://localhost:8080/actuator/health'
```   
--- response ---
```json
{
  "status" : "UP"
}
```