public class ejercicio_1{
    public static void main(String[] args) {
        double hola;
    }
}

class Cuadrado{
    private double lado;


    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado lado(double lado) {
        this.lado = lado;
        return this;
    }
    
}