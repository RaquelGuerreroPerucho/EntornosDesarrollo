<img src=https://portal.edu.gva.es/iesmarcoszaragoza/wp-content/uploads/sites/256/2021/04/cabecera-k-fondocolores2-nologos-cdc.png alt="logo" width="800"/>

<h6 style="text-align: right"> <em> Raquel Guerrero Perucho </em> </h6> 
<h6 style="text-align: right"> <em> 1º DAM - Entornos de desarrollo </em> </h6> 

# TEMA 2: Práctica 1 Debug
> ### Exercici 1:
> En la función1… Què fan aquestes línies de codi?

        String string2 = "string2";
        string2= string2.substring(0, string2.length()-1);
        string2=string2+"1";

La primera línea de código quita a la variable string2 el último caracter y lo deja como string.
La segunda línea suma el caracter "1" al valor de la la variable string2.

> ### Exercici 2:
>  Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?if(string1 == string2 ) { System.out.println("SÓN IGUALS " + a );. } else { System.out.println("SÓN DIFERENTS"); }

        if(string1 == string2 ) {
        System.out.println("SÓN IGUALS " + a );.
        }
        else {
        System.out.println("SÓN DIFERENTS");
        }

Antes de ejecutar el codigo las variables string1 y string2 valen lo mismo: string1.

> ### Exercici 3:
> Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest?.

El opepador == no sirve porque compara posiciones de memoria en la que estan los strings en lugar del contenido de los mismos, para solucionarlo lo correcto seria utilizar equals ya que compara el contenido de los strings.

> ### Exercici 4:
>  La función2() està declarada com segueix:

        public void funcion2() {
        System.out.println("--------------------");
        System.out.println("Aquesta és la funció 2");
        System.out.println("Com faig la crida perquè funcione????");
        }
 > Aquesta funció com l'he de cridar des del mètode MAIN perquè funcione. Existeixen 2
possibilitats. Explica-les.

La función no está llamando ahora mismo porque el main es static y la función no, para que fuera correcto se debería o bien quitar el static del main o añadirselo a la función,
