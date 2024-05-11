package paquete01;

import java.util.Scanner;
import paquete02.Automotor;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;
        int cedula;
        String marca;
        // Cadena que servirá para guardar la informacion, inicia vacia
        String cadena = ""; 
        int anio;
        float valorAuto;

        System.out.print("Cuantas iteraciones se realizara?: ");
        num = sc.nextByte();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("\nAuto "+(i+1));
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
        }
        System.out.println(cadena);
    }
}

