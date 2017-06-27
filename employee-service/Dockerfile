FROM java:8-jre

ADD ./target/employee-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/employee-service.jar"]

EXPOSE 6000