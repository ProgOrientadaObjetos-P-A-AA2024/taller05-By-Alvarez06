package paquete01;

import java.util.Scanner;
import paquete02.Automotor;

public class EjecutorDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cedula;
        String marca;
        String cadena = "";
        int anio;
        float valorAuto;
        boolean bandera = true;
        String comprobar;
        byte i = 0;
        
        while (bandera) {
            System.out.println("\nAuto " + (i + 1));
            System.out.print("Ingrese la cedula: ");
            cedula = sc.nextInt();
            sc.nextLine(); // Limpieza de buffer
            System.out.print("Ingrese la marca del auto: ");
            marca = sc.nextLine();
            System.out.print("Ingrese el año de fabricacion del auto: ");
            anio = sc.nextInt();
            System.out.print("Ingrese el valor del auto: ");
            valorAuto = sc.nextFloat();
            sc.nextLine(); // Limpieza de buffer
            /*
            Envia y asigna los valores al objeto mediante un constructor que
            recibe como parametros todos los valores ingresados por el usuario
             */
            Automotor auto1 = new Automotor(cedula, marca, anio, valorAuto);
            auto1.calcularValorMatricula();
            cadena = String.format("%s\n%s", cadena, auto1);
            System.out.print("Ingrese 's' para salir del ciclo, caso contrario,"
                    + " digite cualquier otra letra: ");
            comprobar = sc.nextLine();
            // Aumenta el contador en caso de seguir con las interaciones de autos
            i++; 
            if (comprobar.equals("s")) {
                bandera = false;
            }
        }
        System.out.println(cadena);
    }
}
