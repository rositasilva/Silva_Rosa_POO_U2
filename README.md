# Proyecto Audiovisual – Unidad 2  
### Universidad Politécnica Salesiana  
**Materia:** Programación Orientada a Objetos  
**Estudiante:** Rosa Silva  

---

## Descripción del Proyecto

Este repositorio contiene un proyecto en Java desarrollado como una demostración práctica de los principios fundamentales de la **Programación Orientada a Objetos (POO)**.  
El sistema modela un catálogo de diferentes tipos de contenido audiovisual, donde cada uno tiene sus propias características, relaciones y componentes.

El proyecto fue desarrollado en **Eclipse IDE** y demuestra la correcta aplicación de los conceptos de herencia, polimorfismo, encapsulamiento y composición.  
Además, se integró la gestión de versiones mediante **Git y GitHub** para documentar y respaldar todo el desarrollo del trabajo.

---

## Objetivos y Propósito del Proyecto

El objetivo principal es aplicar y demostrar un entendimiento sólido de los **cuatro pilares de la POO**:

### 🔹 Abstracción  
Se define una clase base abstracta `ContenidoAudiovisual` que contiene los atributos y métodos comunes para todos los tipos de medios (ID, título, duración y género).  
Esta clase sirve como modelo general del que heredan los demás tipos de contenido.

### 🔹 Herencia  
Las clases `Pelicula`, `SerieDeTV`, `Documental`, `Cortometraje` y `VideoYouTube` heredan de `ContenidoAudiovisual`.  
Cada una extiende la funcionalidad con sus propios atributos y métodos específicos.

### 🔹 Polimorfismo  
Se usa la sobrescritura de métodos (por ejemplo, `mostrarDetalles()`), para que cada clase muestre su información de forma personalizada, aunque se invoque el mismo método.

### 🔹 Encapsulamiento  
Todos los atributos están declarados como `private`, y el acceso se controla mediante métodos `get` y `set`, garantizando la protección e integridad de los datos.

---

## Clases y Funcionalidades Implementadas

El proyecto está organizado en **paquetes** para mantener una estructura limpia y modular:

- **paquete uni1a:** contiene las clases del modelo principal (`ContenidoAudiovisual`, `Pelicula`, `SerieDeTV`, `Documental`, `Cortometraje`, `VideoYouTube`, `Actor`, `Temporada`, `Investigador`).
- **paquete poo:** contiene la clase ejecutable `PruebaAudioVisual.java`, donde se crean y prueban los objetos.

### Funcionalidades destacadas:
- Creación de distintos tipos de contenido audiovisual.  
- Asociación entre clases (por ejemplo, Película ↔ Actor, Documental ↔ Investigador).  
- Composición (por ejemplo, SerieDeTV ♦→ Temporada).  
- Visualización de todos los objetos creados en consola con sus detalles.

---

## Diagrama de clases
<img width="1182" height="601" alt="Captura de pantalla 2025-10-31 184047" src="https://github.com/user-attachments/assets/3c1668a6-4bc1-495c-ba29-f41a057b0900" />

---

## Funcionalidades y Clases Añadidas

- **ContenidoAudiovisual:** Clase abstracta base que define los atributos y métodos comunes.  
- **Pelicula:** Incluye una lista de actores.  
- **SerieDeTV:** Contiene varias temporadas (relación de composición).  
- **Documental:** Asociado a un investigador.  
- **Cortometraje:** Añadido como subclase adicional con su propio actor y director.  
- **VideoYouTube:** Subclase adicional que maneja vistas, likes y colaborador.  

### Clase ejecutable:
- **PruebaAudioVisual:** Contiene el método `main()`, desde donde se crean los objetos, se ejecutan los métodos y se muestran los resultados en consola.

---

## Instrucciones para Clonar o Descargar y Ejecutar

### 🔧 **Requisitos previos**
- Tener instalado el **JDK (Java Development Kit)** versión 17 o superior.  
- Tener instalado un IDE como **Eclipse** o **IntelliJ IDEA**.  

### 🔹 Opción 1: Clonar el repositorio desde GitHub
Abre tu terminal o Git Bash y escribe:

```bash
git clone https://github.com/rositasilva/Silva_Rosa_POO_U2.git




