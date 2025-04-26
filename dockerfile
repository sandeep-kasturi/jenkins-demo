#FROM openjdk:17

FROM public.ecr.aws/amazoncorretto/amazoncorretto:17


WORKDIR /app

COPY target/demo-service-2.jar /app/demo-service-2.jar

EXPOSE 5001

ENTRYPOINT ["java", "-jar", "/app/demo-service-2.jar"]	