public class escuela{
    public static void main(String[] args) {
        Lista list = new Lista();
        list.field_alumnos();
        // list.show_alumnos();
        list.order_alumnos();
    }
}

class Alumno{
    private String name;
    private int faltas;

    public Alumno(String name, int faltas){
        this.name = name;
        this.faltas = faltas;
    }

    public String getNombre(){
        return name;
    }
    public int getFaltas(){
        return faltas;
    }
}

class Lista{
    private Alumno[] alumno = new Alumno[10];
    
    public void field_alumnos(){
        String[] name = {"Juan", "Pedro", "Luis","Maura","Pepe","Frida","Daniel","Gustavo","Jesus","Rodrigo"};
        for(int i = 0; i < alumno.length; i++){
            String name_selected;
            int faltas;
            
            faltas = (int)(Math.random() * 10);
            name_selected = name[i];
            alumno[i] = new Alumno(name_selected, faltas);
        }
    }
    
    public void show_alumnos(){
        for(int i = 0; i < alumno.length; i++){
            System.out.println("El alumno es: " + alumno[i].getNombre()  + "\n" + "Faltas: " + alumno[i].getFaltas() + "\n");
        }
    }

    public void order_alumnos(){

        for(int i = 0; i < alumno.length - 1; i++)
        {
            for(int j = 0; j < alumno.length - 1; j++)
            {
                if (alumno[j].getFaltas() < alumno[j + 1].getFaltas())
                {
                    Alumno tmp = alumno[j+1];
                    alumno[j+1] = alumno[j];
                    alumno[j] = tmp;
                }
            }
        }
        for(int i = 0; i < alumno.length; i++){
            System.out.println("El alumno es: " + alumno[i].getNombre()  + "\n" + "Faltas: " + alumno[i].getFaltas() + "\n");
        }
    }
}

