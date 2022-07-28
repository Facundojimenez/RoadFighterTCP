# Road Fighter

Integrantes:

- Greco, Martin
- Bonvehi, Sebastián
- Jimenez, Facundo
- Bastistelli, Agustin
- Ciccones, Agustin
- Ramos, Alan
- Gomez, Matias

Introducción Durante el taller desarrollaremos un juego de carreras multijugador, con mecánicas similares al Road Fighter

En las clases del taller se les proveerá de herramientas para poder realizarlo en Java, con las buenas prácticas que irán adquiriendo.

Metodología de trabajo

La realización del juego, tendrá tres etapas con sus respectivas entregas:

Fecha	Contenido de la entrega
04/06	Posibilidad de interactuar con los elementos del juego en tiempo real en un entorno simulado, de forma gráfica
02/07	Capacidad de ser jugado a través de cliente-servidor
Se espera que las prácticas de programación sean buenas, y adecuadas al conocimiento adquirido en la materia. Esto incluye evitar el código aglomerado, tener una buena interacción de clases, no duplicar funcionalidades, tener el código indentado y prolijo, entre otras.

Mecánica del juego

La mecánica del juego consiste en una carrera entre múltiples automóviles en una ruta. A diferencia del Road Fighter, además de existir los automóviles circulando por la ruta, se contará con otros oponentes controlados por otras personas.

Una partida debe contar como mínimo con 2 jugadores (y soportar más de 4)
Una partida debe contar con una única ronda donde se determinaran las posiciones de los jugadores
La ronda puede finalizar cuando al menos un jugador haya llegado a la meta. Se puede esperar a todos los jugadores, esperar un cierto tiempo, o alguna otra forma
El mapa se compone de una ruta que será recorrida por los automóviles, y los margenes del mismo
El mapa contiene automóviles circulando que si son chocados por los automóviles de los jugadores, les harán perder el control momentáneamente
El mapa puede haberse generado previamente o generarlo aleatoriamente
Si un automóvil toca alguno de los dos márgenes de la ruta, explotará y si le pertenece a algún jugador volverá a aparecer cerca de ese margen unos instantes después
El movimiento de los vehículos será de forma horizontal o libre en la pantalla. El movimiento se tiene que sentir fluido
La posición inicial de los vehículos no debe darle ningún tipo de ventaja a algún jugador
Los vehículos podrán acelerar, en un principio a una velocidad constante
Los vehículos de los jugadores también tienen que tener la capacidad de frenar, lo cual disminuye su velocidad
Al finalizar la partida se debe indicar de forma clara la posición de cada jugador
Requisitos generales

Como usuario quiero ingresar al juego con mi nombre de usuario y contraseña, para poder jugar contra otros jugadores en una sala
Como usuario quiero seleccionar una sala de las existentes, para poder ingresar y jugar con los participantes (*1)
Como usuario quiero crear nuevas salas para que ingresen otros jugadores (*2)
Como usuario quiero poder salir de una sala, incluso si en la misma el juego se encuentra en ejecución
Como usuario quiero poder identificar cada jugador (saber quién lo maneja, y ver su puntuación)
Notas: (*1) Una sala puede estar activa para que ingresen jugadores mientras un juego no esté activo en la misma. Aún así, debe aparecer en la lista de juegos como que el juego ya inició (*2) La partida podrá ser iniciada por el creador de la sala, o cuando todos los jugadores estén listos, o cualquier otra condición que consideren

## Menú: 

![MENU1](https://user-images.githubusercontent.com/63988862/181522195-d89d6357-2fd2-4bf0-a7bd-8a20109a5176.png)

![MENU2](https://user-images.githubusercontent.com/63988862/181522200-b5ce8492-5599-4c06-b5d5-3db95c2c8cfa.png)

## Instalación:

Para instalar el juego, es necesario descargar este repositorio y compilar el código en modo Maven Build con el comando "javafx:run" en goals

![INSTALL](https://user-images.githubusercontent.com/63988862/181524779-53f2cb4b-d0f7-4d83-b89b-47dc711fb5c2.png)

## Juego:

Controles: 

- JUGADOR1: <br>
Movimiento izquierda: A <br>
Movimiento Derecha: D <br>
Aceleracion 1 (mayor aceleracion): V <br>
Aceleracion 2 (mayor velocidad maxima): B <br>
<br><br>
- JUGADOR2: <br>
Movimiento izquierda: <- <br>
Movimiento Derecha: -> <br>
Aceleracion 1 (mayor aceleracion): K <br>
Aceleracion 2 (mayor velocidad maxima): L<br>

## Vista previa: 

![RACE1](https://user-images.githubusercontent.com/63988862/181522204-c7f4c278-3377-4440-9d99-ce963c678d16.png)

![RACE2](https://user-images.githubusercontent.com/63988862/181522207-47e7cb7b-28cc-42bb-aea6-93819bcaeaba.png)

![FINISH LINE](https://user-images.githubusercontent.com/63988862/181522208-a807622c-84df-412a-bd66-8acac117b316.png)

![RACE3](https://user-images.githubusercontent.com/63988862/181522211-97f76550-4acc-4296-b41d-9e6ecc212c79.png)


