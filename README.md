<h1 align="center">
  <a href="#"> API Gestión de Préstamos </a>
</h1>

<h3 align="center">Prueba técnica de gestión de solicitudes de préstamos</h3>

<p align="center">

  <img alt="Estrellas" src="https://img.shields.io/github/stars/jaresgal/caixa-java?style=social">
  
  <a href="https://github.com/jaresgal/caixa-java">
    <img alt="Último commit en GitHub" src="https://img.shields.io/github/last-commit/jaresgal/caixa-java">
  </a>
    
  <img alt="Licencia" src="https://img.shields.io/badge/license-MIT-brightgreen">

  <a href="https://github.com/jaresgal/">
    <img alt="Creado por José Antonio" src="https://img.shields.io/badge/made%20by-José%20Antonio-ff69b4">
  </a>
</p>


<p align="center">
 <a href="#about">Acerca de</a> •
 <a href="#features">Características</a> •
 <a href="#how-it-works">Cómo funciona</a> • 
 <a href="#tech-stack">Tecnologías</a> •  
 <a href="#author">Autor</a> • 
 <a href="#user-content-license">Licencia</a>
</p>

<hr/>

<h2 id="about">Acerca de</h2>

<p>
<b>API Gestión de Préstamos</b> es una aplicación creada para gestionar solicitudes de préstamos personales. 
Permite a los clientes enviar solicitudes, a los gestores revisar y modificar su estado, y al sistema consultar el historial de solicitudes.
</p>

<hr/>

<h2 id="features">Características</h2>

<ul>
  <li>[x] Crear solicitudes de préstamo con nombre, importe, divisa y documento identificativo</li>
  <li>[x] Consultar todas las solicitudes o una solicitud específica por ID</li>
  <li>[x] Modificar el estado de una solicitud siguiendo el flujo: <b>Pendiente → Aprobada/Rechazada, Aprobada → Cancelada</b></li>
  <li>[x] Carga de datos de prueba al iniciar la aplicación</li>
  <li>[x] Documentación de la API con <b>Swagger / OpenAPI</b></li>
</ul>

<hr/>

<h2 id="how-it-works">Cómo funciona</h2>

<p>
La API está desarrollada con <b>Spring Boot</b> y utiliza almacenamiento en memoria para las solicitudes.  
No requiere base de datos y permite probar todos los endpoints mediante Swagger o Postman.
</p>

<h3>Requisitos previos</h3>
<p>
Antes de comenzar, necesitas tener instaladas estas herramientas: <br/>
- <a href="https://git-scm.com">Git</a> <br/>
- <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java 17+</a> <br/>
- <a href="https://maven.apache.org/">Maven</a> <br/>
- Un IDE, por ejemplo <a href="https://spring.io/tools">Spring Tool Suite (STS)</a>
</p>

<h4>Ejecutar la aplicación</h4>

<pre>
<code>
# Clona este repositorio
$ git clone git@github.com:jaresgal/caixa-java.git

# Accede a la carpeta del proyecto
$ cd caixa-java

# Compila e instala dependencias
$ mvn clean install

# Inicia la aplicación
$ mvn spring-boot:run

# La API estará disponible en http://localhost:8080
# Documentación Swagger en http://localhost:8080/swagger-ui.html
</code>
</pre>

<hr/>

<h2 id="tech-stack">Tecnologías</h2>

<p>Esta API fue construida usando las siguientes tecnologías:</p>

<h4>Backend</h4>
<ul>
  <li><a href="https://spring.io/projects/spring-boot">Spring Boot 3.2</a></li>
  <li><a href="https://maven.apache.org/">Maven</a></li>
  <li><a href="https://spring.io/projects/spring-doc-openapi">Springdoc OpenAPI / Swagger</a></li>
  <li>Java 17</li>
</ul>

<h4>Herramientas de desarrollo</h4>
<ul>
  <li>Spring Tool Suite (STS)</li>
  <li>Postman para pruebas de endpoints</li>
  <li>Git para control de versiones</li>
</ul>

<p>Más detalles en <a href="https://github.com/jaresgal/caixa-java/blob/main/pom.xml">pom.xml</a></p>

<hr/>

<h2 id="author">Autor</h2>


[![Linkedin Badge](https://img.shields.io/badge/-José%20Antonio-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jaresgal/)](https://www.linkedin.com/in/jaresgal/)

<hr/>

<h2 id="user-content-license">Licencia</h2>

<p>Este proyecto está bajo la licencia <a href="./LICENSE">MIT</a>.</p>
<p>Hecho con ❤️ por José Antonio 👋🏽 <a href="https://www.linkedin.com/in/jaresgal/">¡Contáctame!</a></p>

<hr/>

<h2 id="learn-more">Aprende más</h2>

<p>
Esta API fue creada usando <a href="https://spring.io/projects/spring-boot">Spring Boot</a>.  
Para aprender más sobre Spring Boot y desarrollo de APIs REST, revisa la <a href="https://spring.io/guides/gs/rest-service/">documentación oficial de Spring</a>.
</p>
