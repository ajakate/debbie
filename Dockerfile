FROM openjdk:8-alpine

COPY target/uberjar/debbie.jar /debbie/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/debbie/app.jar"]
