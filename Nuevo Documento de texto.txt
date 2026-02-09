Javones y Mazmorras

Proyecto de Programación Orientada a Objetos en Java.

Equipo

- Julen Artesona Sanchez
- Marcel Codina Perpiña
- Viktor Todorov Dilyanov

Descripción

Sistema de personajes para un juego de rol tipo mazmorra. Los héroes cooperan, se protegen y gestionan recursos para sobrevivir.

Clases Implementadas

Personaje (clase base)
- Atributos: nombre, nivel, vida, protección, inventario
- Métodos: mostrarInfo, bajarVida, curar, gestión de protección

Mago (hereda de Personaje)
- Sistema de maná para lanzar hechizos
- Métodos: lanzarHechizo, recargarMana

Guerrero (hereda de Personaje)
- Puede proteger a otros personajes
- Métodos: proteger, dejarDeProteger

Ladron (hereda de Personaje)
- Puede volverse invisible
- Métodos: robar, hacerseInvisible

Equipamiento
- Representa items del juego (armas, armaduras, etc.)

Inventario
- Gestiona la lista de equipamiento de cada personaje

Conceptos de POO aplicados

- Herencia: Mago, Guerrero y Ladron heredan de Personaje
- Encapsulación: Atributos privados/protected con getters y setters
- Polimorfismo: Sobrescritura del método mostrarInfo en cada clase
- Composición: Personaje contiene un objeto Inventario

Como ejecutar

1. Compilar:

javac Main.java personajes/*.java items/*.java


2. Ejecutar:

java Main


Funcionalidades

La simulación muestra:
- Creación de personajes de diferentes clases
- Sistema de equipamiento e inventarios
- Combate con daño y protección
- Sistema de maná del Mago
- Invisibilidad del Ladron
- Curación y descanso

Fecha de entrega

9-2-26



