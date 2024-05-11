package paquete02;

public class Calificacion {

    private String nombreEstudiante;
    private float nMateria1;
    private float nMateria2;
    private float nMateria3;
    private float promedio;

    public Calificacion(String nombre, float n1, float n2) {
        nombreEstudiante = nombre;
        nMateria1 = n1;
        nMateria2 = n2;
        nMateria3 = (nMateria1 + nMateria2) / 2;
    }

    public Calificacion(String nombre, float n1, float n2, float n3) {
        nombreEstudiante = nombre;
        nMateria1 = n1;
        nMateria2 = n2;
        nMateria3 = n3;
    }

    public void establecerNombreEstudiante(String s) {
        nombreEstudiante = s;
    }

    public void establecerNMateria1(float n) {
        nMateria1 = n;
    }

    public void establecerNMateria2(float n) {
        nMateria2 = n;
    }

    public void establecerNMateria3(float n) {
        nMateria3 = n;
    }

    public void calcularPromedio() {
        promedio = (nMateria1 + nMateria2 + nMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public float obtenerNMateria1() {
        return nMateria1;
    }

    public float obtenerNMateria2() {
        return nMateria2;
    }

    public float obtenerNMateria3() {
        return nMateria3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tabla de Calificaciones\n"
                + "Nombre: %s\n"
                + "Calificacion de la Materia 1: %.2f\n"
                + "Calificacion de la Materia 2: %.2f\n"
                + "Calificacion de la Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante, nMateria1, nMateria2, nMateria3, promedio);
        return cadena;
    }

}
