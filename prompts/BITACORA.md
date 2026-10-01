# Bitacora de tecnicas avanzadas

Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: (escribe aqui cual usaste)

## Ejercicio 2: Zero-shot, one-shot y few-shot

| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot | 5/5 | Lista numerada con explicaciones o texto adicional | No |
| One-shot | 5/5 | Texto usando flechas pero con introducciones | No |
| Few-shot | 5/5 | Estricto: "comentario" -> Etiqueta sin texto extra | Si |


## Ejercicio 3: Chain of Thought


| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | 318.60 | No | Si |
| Paso a paso | Muestra el desglose: 120 x 0.75 = 90; 90 x 1.18 = 106.20; 106.20 x 3 = 318.60 | Si | Si |


## Ejercicio 4: Role prompting


| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol | Intermedio / Estandar | Ejemplos conceptuales simples | Publico general |
| B. Rol docente | Sencillo / Didactico | Metaforas cotidianas (como una caja etiquetada) | Estudiantes sin experiencia |
| C. Rol senior | Tecnico / Avanzado | Codigo en Java y conceptos como tipo de dato y memoria | Desarrolladores y companeros de trabajo |


## Ejercicio 5: Descomposicion


- **Paso 1:** La IA entrego los 5 requisitos clave del sistema (gestion de productos, control de stock, alertas de minimo, registro de movimientos y reportes).
- **Paso 2:** Diseno las clases `Producto`, `Inventario` y `Movimiento` especificando sus atributos y tipos de datos.
- **Paso 3:** Genero el codigo fuente en Java de la clase `Producto` con constructor y metodos get y set.
- **Paso 4:** Propuso 3 mejoras: validacion de stock no negativo, agregar metodo `toString()` y hacer inmutable el ID del producto.

*Comparacion:* El pedido de una sola vez produjo una respuesta muy generica y resumida, mientras que la descomposicion por pasos permitio obtener un diseno modular, detallado y coherente con los requisitos acordados.


## Ejercicio 6: Prompt estructurado y autocritica

## Ejercicio 6: Prompt estructurado y autocrítica

| Qué revisar | Cumple (Sí / No) |
|-------------|------------------|
| ¿Tiene las 4 columnas pedidas? | Sí |
| ¿Incluye el bloqueo después de 3 intentos? | Sí |
| ¿Incluye casos con campos vacíos? | Sí |
| ¿Indica qué casos agregó en la autocrítica? | Sí |
| ¿Hay algún caso repetido o que no tenga sentido? | No |

### Prompts utilizados en el Ejercicio 6

```text
-- PROMPT ESTRUCTURADO --
Actua como analista de pruebas de software.
Login web con correo y contrasena. La cuenta se bloquea despues de 3 intentos fallidos.
Piensa paso a paso que puede fallar y escribe 6 casos de prueba.
Tabla con las columnas: ID, escenario, datos de entrada, resultado esperado.

-- MENSAJE DE AUTOCRÍTICA --
Revisa tu tabla: faltan casos limite como campos vacios, correo sin @ o contrasena con espacios? Agrega los que falten e indica cuales agregaste.