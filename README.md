# practica9 - HTML5

La Oficina de Planeamiento (OP) de la PUCMM solicita al departamento de Sistema y
Computación su ayuda para realizar encuestas sociales a la población de la zona norte
del país. La OP pretende dotar al personal de apoyo con teléfonos inteligentes o tabletas
para realizar las encuestas, los cuales pueden no tener acceso de red (Wifi o 3G/4G)
mientras estén realizando el levantamiento, por dicha razón, es necesario incorporar un
mecanismo para almacenar la información en el dispositivo y sincronizar una vez tenga
acceso a la red de datos. Los requerimiento de la aplicación son:
1. Aplicación Web con un diseño adaptado a dispositivos móviles.
2. El formulario de capturará debe procesar las siguientes informaciones: Nombre,
Sector y Nivel escolar (Básico, Medio, Grado Universitario, Postgrado y Doctorado).
3. Cada vez que un registro es almacenado, deben guardar la posición georeferencial
del registro.
4. El almacenamiento de la información será local y deberán implementar un
mecanismo que permita sincronizar con el servidor la información registrada.
5. Deben tener una opción que permita listar la información recibida por el cliente en
el servidor y presentar en un mapa (Google Maps API) donde fueron realizados los
registros.
6. Debe existir una acción para modificar o borrar un registro antes del enviar al
servidor.
Algunas librerías que pueden implementar, son libres de usar cualquier otra:
• ZangoDB
• Dexie.js
• Offline.js
• Geolocator
