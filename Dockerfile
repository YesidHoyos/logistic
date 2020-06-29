FROM openjdk:8-jre-alpine
RUN mkdir -p /usr/src/apps/logistic
COPY target/logistic-0.0.1-SNAPSHOT.jar /usr/src/apps/logistic
WORKDIR /usr/src/apps/logistic
CMD ["nohup", "java", "-jar", "logistic-0.0.1-SNAPSHOT.jar", "&"]