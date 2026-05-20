# Lectura y Procesamiento de Archivos (Repaso 15)

Programa en Java que implementa la lectura secuencial de archivos de texto externos y el procesamiento de su contenido para extraer métricas básicas.

## 🚀 Funcionalidades
* **Lectura Eficiente:** Utiliza un sistema de búfer para leer el archivo `nombres.txt` de forma rápida, optimizando el uso de memoria del sistema.
* **Conteo de Registros:** Implementa un acumulador para determinar el número total de líneas (o registros) que contiene el documento.
* **Visualización Dinámica:** Imprime en consola cada una de las líneas recuperadas antes de mostrar el resumen estadístico final.
* **Gestión de Rutas:** Demuestra el acceso a archivos mediante rutas relativas entre diferentes directorios del proyecto.

## 🛠️ Estructura técnica
El código aplica patrones avanzados de Entrada/Salida (I/O) en Java:
* **`BufferedReader`**: Clase fundamental para la lectura de texto que minimiza las operaciones de lectura física en disco mediante el almacenamiento temporal en un búfer.
* **`FileReader`**: Actúa como el puente de conexión inicial con el archivo físico en el sistema.
* **Algoritmo de Lectura Continua**: Utiliza un bucle `while` que evalúa la condición `readLine() != null` para procesar el archivo íntegramente sin conocer su tamaño previo.
* **Control de Excepciones de I/O**: Gestiona errores potenciales (como archivos no encontrados o errores de acceso) para garantizar una salida controlada y descriptiva.