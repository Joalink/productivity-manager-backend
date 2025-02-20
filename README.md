# Proyecto Spring Boot con MySQL utilizando Docker Compose

Este proyecto contiene una aplicación Spring Boot conectada a una base de datos MySQL, todo gestionado mediante Docker Compose para facilitar la configuración y el despliegue.

## Requisitos previos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- [Docker](https://www.docker.com/get-started)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Estructura del Proyecto

Este proyecto está compuesto por los siguientes servicios:

- **Spring Boot**: La aplicación backend que se conecta a la base de datos MySQL.
- **MySQL**: Base de datos que se utiliza para almacenar la información de la aplicación.

## Pasos para inicializar el proyecto

### 1. Clonar el repositorio

Lo primero es clonar el repositorio de tu proyecto en tu máquina local:

```bash
git clone https://github.com/tu-usuario/nombre-del-repositorio.git
cd nombre-del-repositorio
```

### 2.Inicializar docker-compose
docker-compose up --build


### 2. Creacion de la tabla
se intentaron realizar migraciones con flywaydb pero hubo complicaciones en remplazo se hara manualmente
ejecutar el archivo: V1__init.sql