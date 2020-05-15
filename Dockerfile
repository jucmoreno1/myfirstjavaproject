
#Se elige una imagen pase para el contenedor
FROM openjdk:8-jdk-alpine

# Se copiaran los archivos a la imagen Docker
ADD build/libs/myfirstjavaproject-0.0.1-SNAPSHOT.jar myFirstJavaApp-0.0.1.jar

#Es el mismo puerto expuesto por el micrservicio
EXPOSE 8080

#Punto de entrada, la manera como corremos echamos andar el microservicio
ENTRYPOINT ["java","-jar","/myFirstJavaApp-0.0.1.jar"]
