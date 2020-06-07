public class Examen{
    public static void main(String[] args) {
        Licuado licuados = new Licuado();
        Menu menu = new Menu();
        
        // Prepara las frutas de los licuados
        licuados.prepararLicuado();
        // Valida las mezclas en el menu
        menu.validarMezcla(licuados.prepararComplemento(), licuados.getFruta());
    }
}

class Fruta{
    // Esta clase define la estructura o molde de la fruta
    private String name;
    private boolean citrico;

    public Fruta(String name, boolean citrico){
        this.name = name;
        this.citrico = citrico;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public boolean getCitrico(){
        return citrico;
    }

}

class Licuado{
    private Fruta[] fruta = new Fruta[4];

    // Esta seccion prepara el licuado
    public void prepararLicuado(){
        String[] nombreFruta = {"Limon","Platano","Naranja","Fresa"};
        boolean[] esCitrico = {true,false,true,false};
        for(int i = 0; i < fruta.length; i++){
            String nombre;
            boolean citrico;
            nombre = nombreFruta[i];
            citrico = esCitrico[i];
            fruta[i] = new Fruta(nombre, citrico);
        }
    }

    // Esta seccion prepara el complemento
    public String prepararComplemento(){
        String[] complemento = {"leche","jugo","agua"};
        int random;
        String complementoLicuado;

        random = (int)(Math.random() * 3);
        complementoLicuado = complemento[random];

        return complementoLicuado;
    }

    public Fruta[] getFruta(){
        return fruta;
    }
}

class Menu{
    // Esta seccion valida la mezcla de las 2 frutas y el complemento
    public void validarMezcla(String complemento, Fruta[] fruta){
        String fruta1, fruta2;
        int random1, random2;
        random1 = (int)(Math.random()*4);
        random2 = (int)(Math.random()*4);
        fruta1 = fruta[random1].getname();
        fruta2 = fruta[random2].getname();
        System.out.println("La fruta a mezclar es: " + fruta1 + " y " + fruta2 + "\n" + "El estado citrico de la fruta " + fruta1 + " es: " + fruta[random1].getCitrico() + "\n" +"El estado citrico de la fruta " + fruta2 + " es: " + fruta[random2].getCitrico() + "\n" + "El complemento es: " + complemento + "\n\n");

        if(fruta[random1].getCitrico() == true || fruta[random2].getCitrico() == true){
            if(complemento == "leche"){
                System.out.println("Las fruta a mezclar es no es saludable");

            } else{
                System.out.println("Las fruta a mezclar es saludable");
            }
        } else {
            System.out.println("Las fruta a mezclar es saludable");
        }
    }
}

