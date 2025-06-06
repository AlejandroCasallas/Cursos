FROM nginx:stable-alpine

VOLUME /tmp

RUN rm -rf /usr/share/nginx/html/*
COPY ./nginx.conf /etc/nginx/nginx.conf
COPY dist/billingApp /usr/share/nginx/html
COPY mime.types /etc/nginx/mime.types


RUN apk --no-cache add openjdk17-jre

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk
ENV PATH $JAVA_HOME/bin:$PATH


RUN java -version

ENV JAVA_OPTS=""
ARG JAR_FILE
ADD ${JAR_FILE} app.jar


COPY appshell.sh appshell.sh

EXPOSE 80 7080

ENTRYPOINT [ "sh", "/appshell.sh" ]