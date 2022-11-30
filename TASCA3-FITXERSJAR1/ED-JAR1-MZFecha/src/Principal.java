import java.util.Scanner;
public class Principal {
    public static void main(String[] args){

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        MZFecha fecha = new MZFecha();
        MZFecha fecha2 = new MZFecha();

        do {
            System.out.println("\n¿Qué opción quieres ejecutar?");
            System.out.println("\t1. Establecer fecha");
            System.out.println("\t2. Imprimir fecha");
            System.out.println("\t3. Diferenciar dos fechas");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    int dia, mes, anyo;

                    System.out.println("DIME UN DIA");
                    dia = sc.nextInt();
                    System.out.println("DIME UN MES");
                    mes = sc.nextInt();
                    System.out.println("DIME UN AÑO");
                    anyo = sc.nextInt();
                    fecha.setFecha(dia, mes, anyo);
                    break;
                case 2:
                    fecha.imprime();
                    break;
                case 3:

                    int dia2, mes2, anyo2;

                    System.out.println("DIME UN DIA");
                    dia2 = sc.nextInt();
                    System.out.println("DIME UN MES");
                    mes2 = sc.nextInt();
                    System.out.println("DIME UN AÑO");
                    anyo2 = sc.nextInt();
                    fecha2.setFecha(dia2, mes2, anyo2);

                    System.out.println("LA DIFERENCIA DE DIAS ES " + fecha2.diferenciaDias(fecha));
                    break;
                case 4:
                    System.out.println("¡Hasta otra!");
                    break;
            }
        } while(opcion != 0);
    }
}

