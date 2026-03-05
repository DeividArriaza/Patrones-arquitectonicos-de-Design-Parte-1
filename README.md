📌 MiniCaso – Implementación de Patrones de Diseño con Arquitectura MVC
📖 Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema simplificado para la gestión y procesamiento de solicitudes de servicios domésticos. El objetivo principal es aplicar e integrar correctamente la arquitectura MVC (Model–View–Controller) junto con los siguientes patrones de diseño:

Abstract Factory

Proxy

Template Method

DAO (Data Access Object)

El sistema simula el flujo completo desde la solicitud de un servicio hasta su procesamiento y almacenamiento.

🎯 Objetivo Académico

Demostrar la correcta integración de múltiples patrones de diseño dentro de una arquitectura organizada, aplicando principios de:

Bajo acoplamiento

Separación de responsabilidades

Modularidad

Extensibilidad

Principio de Inversión de Dependencias

🏗 Arquitectura del Sistema – MVC

El sistema está estructurado bajo el patrón arquitectónico MVC, el cual divide la aplicación en tres capas principales:

🔹 Modelo (Model)

Contiene la lógica del negocio y la representación de los datos.

Incluye:

Servicio (clase abstracta)

ServicioDomestico (implementación concreta)

ServicioDAO

ServicioDAOImpl

Responsabilidades:

Definir el proceso del servicio.

Implementar la lógica específica del servicio.

Gestionar la persistencia de datos.

🔹 Vista (View)

Representada por la clase Main.

Responsabilidades:

Interactuar con el usuario.

Solicitar la ejecución de acciones al controlador.

Mostrar resultados en consola.

🔹 Controlador (Controller)

Clase: ServicioController

Responsabilidades:

Coordinar la creación del servicio.

Gestionar el acceso mediante Proxy.

Ejecutar el procesamiento.

Guardar la información utilizando DAO.

🧩 Patrones de Diseño Implementados
1️⃣ Template Method
📌 Propósito

Definir la estructura fija de un algoritmo y permitir que ciertos pasos sean implementados por subclases.

📌 Implementación

Clase abstracta:

Servicio

Método plantilla:

procesarServicio()

Este método define la secuencia general:

Validar disponibilidad

Calcular costo

Generar solicitud

Notificar trabajador

Las subclases implementan los detalles específicos.

✅ Beneficios

Garantiza consistencia en el flujo.

Reutiliza lógica común.

Evita alteraciones en la estructura general del proceso.

2️⃣ Abstract Factory
📌 Propósito

Crear objetos sin especificar directamente sus clases concretas.

📌 Implementación

Interfaz:

ServicioFactory

Implementación concreta:

ServicioDomesticoFactory

El controlador utiliza la fábrica para crear el servicio sin usar directamente new ServicioDomestico().

✅ Beneficios

Reduce el acoplamiento.

Facilita extensiones futuras.

Centraliza la creación de objetos.

3️⃣ Proxy
📌 Propósito

Controlar el acceso a un objeto real mediante un intermediario.

📌 Implementación

Interfaz común:

ServicioAcceso

Implementaciones:

ServicioReal

ServicioProxy

El Proxy valida si el usuario está autenticado antes de permitir la ejecución del servicio.

✅ Beneficios

Agrega seguridad.

Controla el acceso.

Mantiene transparencia para el cliente.

4️⃣ DAO (Data Access Object)
📌 Propósito

Separar la lógica de acceso a datos del resto del sistema.

📌 Implementación

Interfaz:

ServicioDAO

Implementación:

ServicioDAOImpl

El controlador delega la persistencia al DAO.

✅ Beneficios

Desacopla la base de datos del negocio.

Facilita cambios futuros en almacenamiento.

Mejora la mantenibilidad.

🔄 Flujo General del Sistema

La Vista (Main) solicita la ejecución de un servicio.

El Controlador utiliza la Abstract Factory para crear el servicio.

El Proxy valida el acceso.

El Servicio ejecuta el algoritmo definido por Template Method.

El DAO guarda la información.

Se muestra el resultado en consola.

🧠 Principios de Diseño Aplicados

Separación de responsabilidades.

Bajo acoplamiento mediante interfaces.

Principio de Inversión de Dependencias.

Modularidad.

Extensibilidad.

⚙ Posibles Mejoras

Expandir Abstract Factory para crear una familia completa de objetos relacionados.

Hacer que el DAO trabaje directamente con objetos Servicio en lugar de cadenas de texto.

Implementar persistencia real (base de datos o archivos).

📌 Conclusión

El proyecto demuestra una integración coherente entre la arquitectura MVC y los patrones de diseño Abstract Factory, Proxy, Template Method y DAO. Cada patrón cumple un rol específico dentro del sistema, manteniendo una estructura organizada, modular y extensible.

La solución presenta una arquitectura clara, con separación adecuada de responsabilidades y correcta aplicación de principios de diseño orientado a objetos.
