FROM gradle:6.3-jdk11 as compiler
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle* settings.gradle* gradle* $APP_HOME
COPY gradle $APP_HOME/gradle
RUN gradle build || return 0
COPY . .
RUN gradle installDist

FROM adoptopenjdk/openjdk11:jre-11.0.4_11-alpine
ENV APP_HOME=/usr/app/
ENV EXECUTABLE_NAME=bar-server
WORKDIR $APP_HOME
COPY --from=builder $APP_HOME/server/build/ .
EXPOSE 50051
CMD ./install/server/bin/$EXECUTABLE_NAME