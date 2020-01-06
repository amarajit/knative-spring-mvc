# Use the official maven/Java 8 image to create a build artifact.
FROM maven:3.5-jdk-8-alpine as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

FROM openjdk:8-jre-alpine

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/knative-spring-mvc-*.jar /knative-spring-mvc-1.0.0.jar

# Run the service on container startup.
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/knative-spring-mvc-1.0.0.jar"]
