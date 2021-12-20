Exam Project - 24 timers eksamensprojekt
Programmering 2, 3. semester KEA, efterår 2021

PROJEKT TITEL:
KommuneudvalgExam

PROJEKT BESKRIVELSE:
This project was made for my 3rd semesters 24hour exam. 

Dette projekt skulle implementere bestemte kriterier i en simpel full-stack applikation:

Opgave 1:
a) Du skal modellere kommunalvalget i en enkelt kommune som du selv vælger.
b) Byg et Spring Boot projekt med Database, JPA, og tabeller du fandt, da du modellerede
applikationen.
Opgave 2:
a) Tilføj en restcontroller som kan tage imod en request (fra Postman eller browser-klient) til at oprette,
rette og slette kandidater for de enkelte partier.
b) Tilføj kode, så restcontrolleren også kan returnere en liste af kandidater tilbage til Postman eller
browser-klient.
c) I rest api opret en metode der kan returnere kandidater fra et givent parti.
Opgave 3:
a) Byg en HTML/JavaScript frontend til dit projekt, som viser alle kandidater. Det skal være muligt at få
sorteret kandidater efter parti.
b) Tilføj kode, så man også kan oprette, opdatere og slette kandidater.
c) Forestil dig nu at valget er slut. Stemmerne er talte. Opret nu et skærmbillede der viser en liste over
de enkelte partier og deres procentdel af stemmerne.

MYSQL DATABASE:
Der er vedlagt 4 SQL scripts i projektet.
Implementer filen script.sql først og derefter de 3 kommunevalg scripts som indeholder dataen i diverse tables.

APPLICATION PROPERTIES:
application properties skal implementeres selv.

SKABELON:
spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://localhost:3306/kommunevalg
spring.datasource.username=???
spring.datasource.password=???
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true


server.error.include-message=always

spring.jackson.serialization.indent-output=true








