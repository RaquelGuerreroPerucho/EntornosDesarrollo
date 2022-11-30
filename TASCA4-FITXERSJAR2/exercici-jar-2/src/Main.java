import es.iesmz.prueba.Coche;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("FIAT", "PANDA", "GROC");
        Scanner sc = new Scanner(System.in);

        String marca = " ", modelo = " ", color = " ";

        int opcion =0, vel=0;

        do {
            System.out.println("\nOPCIONES DE LA CLASE COCHE");
            System.out.println("\t1. IMPRIMIR DATOS DEL COCHE");
            System.out.println("\t2. PINTAR EL COCHE");
            System.out.println("\t3. ESTABLECER MARCA");
            System.out.println("\t4. ESTABLECER MODELO");
            System.out.println("\t5. ESTABLECER COLOR");
            System.out.println("\t6. ACELERAR");
            System.out.println("\t7. FRENAR");
            System.out.println("\t8. PARAR");
            System.out.println("\t0. SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(coche.getColor());
                    System.out.println(coche.getMarca());
                    System.out.println(coche.getModelo());
                    break;
                case 2:
                    coche.pinta();
                    break;
                case 3:
                    System.out.println("ESCRIBE UNA MARCA");
                    marca = sc.nextLine();

                    coche.setMarca(marca);
                    break;
                case 4:
                    System.out.println("ESCRIBE UN MODELO");
                    modelo = sc.nextLine();

                    coche.setModelo(modelo);
                    break;
                case 5:
                    System.out.println("ESCRIBE UN COLOR");
                    color = sc.nextLine();

                    coche.setColor(color);
                    break;
                case 6:

                    System.out.println("ESCRIBE CUANTO QUIERES QUE ACELERE");
                    vel = sc.nextInt();

                    coche.acelera(vel);
                    break;
                case 7:

                    System.out.println("ESCRIBE CUANTO QUIERES QUE FRENE");
                    vel = sc.nextInt();

                    coche.frena(vel);
                    break;
                case 8:
                    coche.para();
                    break;
                case 0:
                    System.out.println("¡Hasta otra!");
                    break;
            }

        } while(opcion != 0);
    }
}
