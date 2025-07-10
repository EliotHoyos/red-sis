# Sistema Integrado de Salud (SIS)

**Seguimiento de Formatos Únicos de Asistencia Socioeconómica (FUAS)**

<p align="center">
  <img alt="Java 17" src="https://img.shields.io/badge/Java-17-blue?logo=java" />
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen?logo=springboot" />
  <img alt="Lombok" src="https://img.shields.io/badge/Lombok-enabled-red?logo=lombok" />
  <img alt="JPA" src="https://img.shields.io/badge/JPA-2.2-orange?logo=java" />
  <img alt="Spring Security" src="https://img.shields.io/badge/Spring%20Security-5.7.0-yellow?logo=springsecurity" />
  <img alt="SQL Server" src="https://img.shields.io/badge/SQL%20Server-2019-blue?logo=microsoftsqlserver" />
  <img alt="REST API" src="https://img.shields.io/badge/REST%20API-✔️-lightgrey?logo=rest" />
  <img alt="Postman" src="https://img.shields.io/badge/Postman-API%20Testing-orange?logo=postman" />
</p>

---

## 📋 Descripción

Este proyecto está diseñado para el **Sistema Integrado de Salud** con el fin de gestionar y realizar el seguimiento de los **FUAS** (Formato Único de Asistencia Socioeconómica). Proporciona una API REST segura y escalable para el manejo de datos.

## 🚀 Tecnologías

|                                         Icono                                        | Tecnología      | Descripción                                       |
| :----------------------------------------------------------------------------------: | --------------- | ------------------------------------------------- |
|               ![](https://img.shields.io/badge/Java-17-blue?logo=java)               | Java 17         | Lenguaje de programación principal.               |
|   ![](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen?logo=springboot)  | Spring Boot     | Framework para microservicios y aplicaciones web. |
|           ![](https://img.shields.io/badge/Lombok-enabled-red?logo=lombok)           | Lombok          | Reduce el código boilerplate en Java.             |
|            ![](https://img.shields.io/badge/JPA-2.2-orange?logo=hibernate)           | JPA / Hibernate | Gestión de la persistencia de datos.              |
| ![](https://img.shields.io/badge/Spring%20Security-5.7.0-yellow?logo=springsecurity) | Spring Security | Módulo de autenticación y autorización.           |
|   ![](https://img.shields.io/badge/SQL%20Server-2019-blue?logo=microsoftsqlserver)   | SQL Server      | Base de datos relacional.                         |
|          ![](https://img.shields.io/badge/REST%20API-✔️-lightgrey?logo=rest)         | API REST        | Punto de intercambio de datos.                    |
|      ![](https://img.shields.io/badge/Postman-API%20Testing-orange?logo=postman)     | Postman         | Herramienta para pruebas de API.                  |

---

## 🔧 Instalación

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/tu-usuario/sis-salud.git
   cd sis-salud
   ```
2. **Configurar la base de datos** en `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:sqlserver://<HOST>:<PUERTO>;databaseName=<DB_NAME>
   spring.datasource.username=<USUARIO>
   spring.datasource.password=<PASSWORD>
   spring.jpa.hibernate.ddl-auto=update
   ```
3. **Compilar y ejecutar**:

   ```bash
   mvn clean package
   mvn spring-boot:run
   ```

---

## ⚙️ Uso

* **Endpoint base**: `http://localhost:8080/api/personas`
* **Documentación interactiva (Swagger UI)**: `http://localhost:8080/swagger-ui.html`

**Pruebas con Postman**:

1. Ejecuta la aplicación con `mvn spring-boot:run`.
2. Envía una petición GET a `http://localhost:8080/api/personas` para obtener todas las personas.
3. Para paginar, usa `http://localhost:8080/api/personas/paginate?page=0&size=10`.

---

## 🤝 Contribuciones

¡Todas las contribuciones son bienvenidas! Para colaborar:

1. Haz un *fork* del repositorio.
2. Crea una rama de feature: `git checkout -b feature/nombre-de-tu-feature`.
3. Realiza tus cambios y comitea: `git commit -m "Añade feature X"`.
4. Sube tu rama: `git push origin feature/nombre-de-tu-feature`.
5. Abre un *Pull Request* describiendo tus cambios.

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia **MIT**. Consulta [LICENSE.md](LICENSE.md) para más detalles.

---

<p align="center">Desarrollado con ❤️ por el equipo de SIS</p>
