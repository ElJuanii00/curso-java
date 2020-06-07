 public class Automoviles{
    public static void main(String[] args) {
        Limusina a = new Limusina();
        a.showCaracteristicas();
    }
 }

class Transporte extends Object{
    private double velocidad;
    private int capacidad;
    public Transporte(){
        
    }
    public Transporte(double velocidad, int capacidad) {
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

class Limusina extends Transporte{
    private boolean quemacoco;

    public Limusina() {
    }
    

    public Limusina(double velocidad, int capacidad, boolean quemacoco) {
        super(velocidad, capacidad);
        this.quemacoco = quemacoco;
    }

    public boolean getQuemacoco() {
        return this.quemacoco;
    }

    public void showCaracteristicas(){
        Limusina[] a = new Limusina[5];
        for(int i = 0; i < a.length; i++){
            a[i] = new Limusina(Math.random() * 10, (int)(Math.random()*20), ((int)(Math.random()) > .5 ? true : false));
            System.out.println("El carro " + i + "\n\n" + "La velocidad: " + a[i].getVelocidad() + "\n" + "La capacidad: " + a[i].getCapacidad() + "Quemacoco: " + a[i].getQuemacoco() );
        }
    }
}