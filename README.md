# Actividad3CAEJ

Aplicación Spring Boot (Calculadora)
Para que nuestras aplicaciones sean profesionales, debemos separar la lógica de acceso a datos de la lógica de control. En esta actividad, daremos un paso más allá del MVC básico para integrar la capa de persistencia.

1. Desafío Técnico:
Su tarea consiste en crear un módulo funcional donde demuestren la interacción de estos tres pilares:

El Modelo (@Entity):

Es la representación de nuestra realidad en código.

Misión: Definir la estructura de la tabla en la base de datos (atributos como ID, nombre, fecha, etc.).

El Repositorio (@Repository):

Es la interfaz que hereda de JpaRepository.

Misión: Gestionar las operaciones CRUD (Guardar, Buscar, Eliminar) sin escribir consultas SQL manuales. Es el puente directo a la base de datos.

El Controlador (@Controller / @Controller):

Es el director de orquesta.

Misión: Recibir la petición del usuario, solicitar los datos al Repositorio y decidir qué Modelo enviar a la vista.

2. Instrucciones de Entrega
Implementación: Desarrollar un pequeño CRUD (por ejemplo, de "Estudiantes" o "Libros").

Diagrama de Flujo: Realizar un esquema simple que muestre el camino de un dato desde que el usuario lo escribe en el navegador hasta que el Repositorio lo guarda en la base de datos.

Código: Asegúrense de que su Repositorio esté correctamente inyectado en el Controlador usando la anotación @Autowired.

3. Ejemplo de Flujo de Trabajo
El Controlador recibe un "Guardar", le pasa el objeto Modelo al Repositorio, y este último se encarga de hablar con la base de datos para asegurar que la información no se pierda.
