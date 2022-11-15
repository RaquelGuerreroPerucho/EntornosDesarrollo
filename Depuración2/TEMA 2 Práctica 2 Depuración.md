<img src=https://portal.edu.gva.es/iesmarcoszaragoza/wp-content/uploads/sites/256/2021/04/cabecera-k-fondocolores2-nologos-cdc.png alt="logo" width="800"/>

<h6 style="text-align: right"> <em> Raquel Guerrero Perucho </em> </h6> 
<h6 style="text-align: right"> <em> 1º DAM - Entornos de desarrollo </em> </h6> 

# TEMA 2: Práctica 2 Depuración
Donat el codi a JAVA de la classe cotxe que compta amb els mètodes:
* constructor on se li estableix la marca, model, color i la velocitat inicial del qual és 0.
* getters i setters de cada paràmetre.
* Mètode accelera (int vel) que incrementa la velocitat del cotxe en “vel” Km/h.
* Mètode frena(int vel) que decrementa la velocitat del cotxe en “vel” Km/h.
* para() que posa la velocitat a 0.
* pinta() que pinta el cotxe més a prop o més lluny segons la velocitat que tinga en aqueix moment.
A més , la classe Principal té el mètode:
pubic static void main(String [] args) punt d'inici del programa →

>0. Importar el projecte en INTELLIJ.

![](file:///C:\Users\34638\Desktop\imagen1.png)

>1. Explica QUÈ FA EL MÈTODE MAIN.

El metodo main es el encargado de jecutar la aplicacion, se busca si existe un metodo main y es lo primero que se ejecuta.

>2. Posad un punt de ruptura (breakpoint) en la línia 27 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3.
Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.

En el inicio del programa con los valores indicados los coches están pintados de la siguiente manera

![](file:///C:\Users\34638\Desktop\imagencocheinicio.png)

El valor de la variable velocitat_nueva1 en la linea 27 es 42

El valor de la variable velocitat_nueva2 en la linea 27 es 37

El valor de la variable velocitat_nueva3 en la linea 27 es 51

![](file:///C:\Users\34638\Desktop\imagen1.png)

Por otra parte las variables c, c2 y c3 almacenan la marca, el modelo, el color y la velocidad de cada vehiculo.

![](file:///C:\Users\34638\Desktop\imagen%204.png)


>3. Posad un punt de ruptura (breakpoint) en la línia 46 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3.
Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.

El valor de la variable velocitat_nueva1 en la linea 46 es 41

El valor de la variable velocitat_nueva2 en la linea 46 es 5

El valor de la variable velocitat_nueva3 en la linea 46 es 79

![](file:///C:\Users\34638\Desktop\imagen2.png)

Finalmente los coches quedan pintados de la siguiente manera en el programa y podemos ver como han cambiado la posición de los coches por el cambio de los valores.

![](file:///C:\Users\34638\Desktop\imagen%20final.png)
