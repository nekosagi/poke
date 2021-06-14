# poke
Proyecto poke api

Para acceder a la api interna desde el sitio en heroku se debe hacer dese https://myminipokedex.herokuapp.com/minipokeapi/ + numero
el numero indica el id del pokemon, en la poke api original llega hasta /898 y luego se salta hasta el /10001

https://myminipokedex.herokuapp.com/web/index.html
En esta web se desplegan los primero 20 pokemones, sin embargo en el acceso a la api se puede encontrar la informacion filtrada de mas pokemon

Cabe destacar que se pedia las evoluciones y la descripcion del pokemon: en cuanto a la descripcion se quito ese parametro en la verison v2 de la poke api
por lo que no era posible acceder, en cuanto a las evoluciones, las cadeas de evoluciones no eran correlativas a los id de los pokemones por lo que si
se seguia el "evolution-chain" numero 25 (correspondiente al pokemon 25= pikachu) corresponde a la cadena entre arcanine y growlithe 

