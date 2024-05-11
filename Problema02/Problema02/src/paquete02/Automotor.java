package paquete02;

public class Automotor {

    private int cedula;
    private String marca;
    private int anioFabricacion;
    private float valorVehiculo;
    private float valorMatricula;

    public Automotor(int c, String m, int a, float v) {
        cedula = c;
        marca = m;
        anioFabricacion = a;
        valorVehiculo = v;
    }


    public void establecerCedula(int n) {
        cedula = n;
    }

    public void establecerMarca(String s) {
        marca = s;
    }

    public void establecerAnio(int n) {
        anioFabricacion = n;
    }

    public void establecerValorVehiculo(float n) {
        valorVehiculo = n;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.002f) * (2024 - anioFabricacion);
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anioFabricacion;
    }

    public float obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public float obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor de Matricula de un Auto\n"
                + "Cedula de Identidad: %d\n"
                + "Marca del Vehiculo: %s\n"
                + "Anio de Fabricacion: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedula, marca, anioFabricacion, valorVehiculo, valorMatricula);
        return cadena;
    }

}
