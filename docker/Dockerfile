FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ../target/producer-usuario-gambalonga-sys-0.0.1-SNAPSHOT.jar /app/producer-usuario-gambalonga-sys-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "producer-usuario-gambalonga-sys-0.0.1-SNAPSHOT.jar"]
