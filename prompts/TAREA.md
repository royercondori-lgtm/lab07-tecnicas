# Tarea: Mi prompt avanzado

## Tarea elegida
Diseñar la estructura de clases, interfaces y lógica de negocio en Java para un **Sistema de Gestión de Notas Académicas Universitario**.

## Version 1: prompt basico

Haz las clases en Java para un sistema de notas de alumnos.

## Version 2

Actúa como un Diseñador de Software Senior especializado en Java Orientado a Objetos.

Diseña un sistema de notas de alumnos descomponiendo el problema en los siguientes componentes independientes:
1. Clase de dominio `Estudiante`
2. Clase de dominio `Evaluacion`
3. Servicio `CalculadorPromedioService`

Proporciona únicamente el código Java bien estructurado.


## Version 3: prompt final

Actúa como un Arquitecto de Software Senior especializado en Desarrollo de Sistemas Académicos en Java y Principios SOLID.



Estamos diseñando el núcleo backend para calcular el promedio ponderado de cursos universitarios y determinar el estado final del alumno (Aprobado, Desaprobado, En Recuperación).



1. Piensa paso a paso (Chain of Thought): analiza primero las entidades y sus atributos, luego define las fórmulas de ponderación y finalmente la lógica del servicio.
2. Descompón el problema en tres capas independientes:
   - Entidad `Estudiante` y `Evaluacion`
   - Entidad `Curso` (que contiene la lista de evaluaciones)
   - Servicio `CalculadorPromedioService`
3. Antes de responder, realiza una autocrítica sobre tu código: verifica que no uses tipos de datos que requieran librerías externas no declaradas y que los métodos de cálculo no contengan errores de división por cero.



Entrada esperada:
- Evaluación 1: Nota 15 (Peso 30%)
- Evaluación 2: Nota 12 (Peso 70%)

Salida esperada en el servicio:
- Promedio Ponderado: 12.9
- Condición: Aprobado



Escribe el código completo en Java dentro de bloques de código separados por clase, incluyendo comentarios breves sobre la lógica implementada.

## Tecnicas usadas en el prompt final

## Tecnicas usadas en el prompt final

| Parte del Prompt Final | Técnica Aplicada |
|------------------------|------------------|
| `Actúa como un Arquitecto de Software Senior...` | **Role Prompting**[cite: 15, 16] |
| Uso de etiquetas XML (``, ``, ``, etc.) | **Prompt Estructurado**[cite: 15, 16] |
| `1. Piensa paso a paso (Chain of Thought)...` | **Chain of Thought (CoT)**[cite: 15, 16] |
| `2. Descompón el problema en tres capas...` | **Descomposición**[cite: 15, 16] |
| `...` | **Few-shot / Ejemplo de formato**[cite: 15, 16] |
| `3. Antes de responder, realiza una autocrítica...` | **Autocrítica**[cite: 15, 16] |

## Evaluacion del resultado

## Evaluacion del resultado

| Criterio de Evaluación | Cumple (Sí / No) | Observaciones |
|------------------------|------------------|---------------|
| ¿Usa un rol específico y no genérico (evita solo "experto")? | Sí | Se asignó "Arquitecto de Software Senior especializado en Desarrollo de Sistemas Académicos en Java". |
| ¿Aplica descomposición explícita de la tarea? | Sí | Dividió el desarrollo en Entidades, Dominio y Servicios independientes. |
| ¿Incluye guía de razonamiento (Chain of Thought)? | Sí | Se le indicó analizar entidades -> fórmulas -> lógica del servicio antes de codificar. |
| ¿Define un formato de salida claro y un ejemplo? | Sí | Incluyó la etiqueta `` y especificó bloques de código Java. |


## Por que elegi estas tecnicas

Elegí Role Prompting y Prompt Estructurado con XML porque otorgan un marco profesional claro y evitan que la IA mezcle contextos cuando la instrucción es extensa. La Descomposición y Chain of Thought fueron indispensables debido a que el diseño de software requiere analizar dependencias y algoritmos de forma secuencial antes de escribir código. El uso de Few-Shot permitió fijar el criterio del cálculo ponderado sin margen de ambigüedad, y la Autocrítica aseguró que la IA revisara de forma previa la validez sintáctica de su propia solución. No utilicé únicamente Zero-shot porque generaba soluciones monolíticas e incompletas.
