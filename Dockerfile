FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/demo-heap-dump-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-XX:+HeapDumpOnOutOfMemoryError", "-XX:HeapDumpPath=/dumps", "-jar", "/app.jar"]
