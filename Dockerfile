FROM openjdk:11
EXPOSE 8080
COPY out/portfolio-backend.jar portfolio-backend.jar
CMD ["java","-jar","portfolio-backend.jar"]