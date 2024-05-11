package paquete01;

import java.util.Scanner;
import paquete02.Calificacion;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner para ingresar info por teclado
        String nombre;
        float n1, n2, n3;
        byte num;

        /*
        Uso de una estructura do while para asegurar que el ingreso del numero
        sea 1 o 2, ningun otro
         */
        do {
            System.out.println("Ingrese 1 para ingresar nombre, nota 1 y nota 2"
                    + "\nsino,");
            System.out.print("Ingrese 2 para ingresar nombre, nota 1, nota 2 "
                    + "y nota 3: ");
            num = sc.nextByte();
        } while (num != 1 && num != 2);

        sc.nextLine(); // Limpieza de buffer
        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese nota 1");
        n1 = sc.nextFloat();
        System.out.println("Ingrese nota 2");
        n2 = sc.nextFloat();
        switch (num) {

            case 1 -> {
                // Si el usuario digita 1 no es necesario la nota de la materia 3
                // por lo tanto se asigna los valores al objeto y se llama a la
                // funcion calcular promedio
                Calificacion prom1 = new Calificacion(nombre, n1, n2);
                prom1.calcularPromedio();
                System.out.printf("%s", prom1);
            }
            case 2 -> {
                /*
                Por otro lado, si digita 2, se le muestra un ingreso mas de nota
                para luego seguir con el mismo proceso que en el caso 1
                 */
                System.out.println("Ingrese nota 3");
                n3 = sc.nextFloat();
                Calificacion prom2 = new Calificacion(nombre, n1, n2, n3);
                prom2.calcularPromedio();
                System.out.printf("%s", prom2);
            }
        }

    }
}
