
#See: https://spring.io/guides/gs/spring-boot-docker/
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","-Dpostgres.host=${POSTGRES_HOST}","ke.co.miles.units.Application"]

