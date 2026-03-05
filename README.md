# 📌 MiniCaso – Implementación de Patrones de Diseño con Arquitectura MVC

## 📖 Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema simplificado para la gestión y procesamiento de solicitudes de servicios domésticos.

El objetivo principal es aplicar e integrar correctamente la arquitectura **MVC (Model–View–Controller)** junto con los siguientes patrones de diseño:

- Abstract Factory  
- Proxy  
- Template Method  
- DAO (Data Access Object)

El sistema simula el flujo completo desde la solicitud de un servicio hasta su procesamiento y almacenamiento.

---

## 🎯 Objetivo Académico

Demostrar la correcta integración de múltiples patrones de diseño dentro de una arquitectura organizada, aplicando principios fundamentales del diseño orientado a objetos como:

- Bajo acoplamiento  
- Separación de responsabilidades  
- Modularidad  
- Extensibilidad  
- Principio de Inversión de Dependencias  

---

# 🏗 Arquitectura del Sistema – MVC

El sistema está estructurado bajo el patrón arquitectónico **MVC**, el cual divide la aplicación en tres capas principales:

---

## 🔹 Model (Modelo)

Contiene la lógica del negocio y la representación de los datos.

### Clases principales:

- `Servicio` (clase abstracta)
- `ServicioDomestico` (implementación concreta)
- `ServicioDAO`
- `ServicioDAOImpl`

### Responsabilidades:

- Definir el proceso general del servicio.
- Implementar la lógica específica de cada tipo de servicio.
- Gestionar la persistencia de los datos.

---

## 🔹 View (Vista)

Representada por la clase `Main`.

### Responsabilidades:

- Interactuar con el usuario.
- Solicitar la ejecución de acciones al controlador.
- Mostrar resultados en consola.

---

## 🔹 Controller (Controlador)

Clase: `ServicioController`

### Responsabilidades:

- Coordinar la creación del servicio.
- Gestionar el acceso mediante Proxy.
- Ejecutar el procesamiento.
- Guardar la información utilizando DAO.

El controlador actúa como intermediario entre la vista y el modelo.

---

# 🧩 Patrones de Diseño Implementados

---

## 1️⃣ Template Method

### 📌 Propósito

Definir la estructura fija de un algoritmo y permitir que ciertos pasos sean implementados por subclases.

### 📌 Implementación

Clase abstracta:

```java
abstract class Servicio
