FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/PhotoAppApiZuulAPIGateway-0.0.1-SNAPSHOT.jar ZullApiGateway.jar
ENTRYPOINT ["java", "-jar", "ZuulApiGateway.jar"]
