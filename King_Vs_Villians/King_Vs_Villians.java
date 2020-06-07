public class King_Vs_Villians{
    public static void main(String[] args) {
        String[] name_heroes = {"King", "Queen","Bishop", "Knight"};
        String[] name_villians = {"Lilith", "Wizard","Troll", "Ghoul"};
        String[] weapons = {"Knife","Sword","Axe","Bow and Arrow"};
        MyCharacter[] personajes = new MyCharacter[8];

        inicializarJuego(personajes, name_heroes, name_villians, weapons);
        character(personajes);


         
        // int w_random; 
        // int f_random;

        // String W_random;
        // Boolean F_random;

        // k= new MyCharacter();
        // l= new MyCharacter();
        // q= new MyCharacter("Queen");

        // k.setName("King");
        // l.setName("Lilith");
        // q.setName("Queen");

        // w_random = (int)Math.random() * 3;
        // W_random=(w_random == 0) ? "Sword" : (w_random == 1) ? "Axe" : "Knife";
        // k.setWeapone(weapons[(int)Math.random() * 4]);

        // w_random = (int)Math.random() * 3;
        // W_random=(w_random == 0) ? "Sword" : (w_random == 1) ? "Axe" : "Knife";
        // l.setWeapone(weapons[(int)Math.random() * 4]);

        // w_random = (int)Math.random() * 3;
        // W_random=(w_random == 0) ? "Sword" : (w_random == 1) ? "Axe" : "Knife";
        // q.setWeapone(weapons[(int)Math.random() * 4]);

        // k.setAmigo(true);
        // l.setAmigo(false);
        // q.setAmigo(true);
        
        // f_random = (int)Math.random() * 3;

        // F_random = (f_random > .5) ? true : false;
        // System.out.println(F_random);
    }
    public static void inicializarJuego(MyCharacter personajes[], String name_heroes[], String name_villians[], String weapons[]){
        for(int i = 0; i < personajes.length; i++){
            int randomFriend = (int)(Math.random()*2);
            int random_Heroe = (int)(Math.random()*name_heroes.length);
            int random_Villian = (int)(Math.random()*name_villians.length);
            switch (randomFriend) {
                case 0:
                    personajes[i] = new MyCharacter(name_heroes[random_Heroe], weapons[(int)(Math.random()*weapons.length)], true);
                    break;
                case 1:
                    personajes[i] = new MyCharacter(name_villians[random_Villian], weapons[(int)(Math.random()*weapons.length)], false);
                    break;
            }

        }
    }
    public static void character(MyCharacter personajes[]){
        int randomCharacter = 0, heroe = 0, villano = 0;
        boolean checkHeroe, checkVillano;
        
        do {
            checkHeroe = false;
            checkVillano = false;
            do {
                randomCharacter = (int)(Math.random()*personajes.length);
                if(personajes[randomCharacter].friend == true){
                    if(personajes[randomCharacter].life == true){
                        heroe = randomCharacter;
                        checkHeroe = true;
                    }
                } else if (personajes[randomCharacter].friend == false) {
                    if(personajes[randomCharacter].life == true){
                        villano = randomCharacter;
                        checkVillano = true;
                    }
                }
            } while (checkHeroe != true || checkVillano != true);
            
            fight(personajes, heroe, villano);
        } while (true);
    }

    public static void fight(MyCharacter personajes[], int heroe, int villano){
        switch (personajes[heroe].name) {
            case "King":
                    if(personajes[villano].name == "Lilith"){
                        personajes[heroe].life = false;
                    }
                break;
            case "Queen":
                    if(personajes[villano].name == "Lilith"){
                        if(personajes[heroe].weapon == "Sword"){
                            if(personajes[heroe].weapon == "Sword" && personajes[villano].weapon != "Sword" ){
                                personajes[villano].life = false;
                            }
                        } else if(personajes[villano].weapon == "Sword"){
                            if(personajes[villano].weapon == "Sword" && personajes[heroe].weapon != "Sword"){
                                personajes[heroe].life = false;
                            }
                        }
                    } else if(personajes[villano].name == "Wizard"){
                        personajes[villano].life = false;
                    } else if(personajes[villano].name == "Troll"){
                        personajes[villano].life = false;
                    } else if(personajes[villano].name == "Ghoul"){
                        personajes[villano].life = false;
                    }
                break;
            case "Bishop":
                    if(personajes[villano].name == "Troll"){
                        personajes[villano].life = false;
                    } else if(personajes[villano].name == "Ghoul"){
                        if(personajes[villano].weapon == "Bow and Arrow"){
                            personajes[heroe].life = false;
                        } else{
                            personajes[villano].life = false;
                        }
                    } else if(personajes[villano].name == "Wizard"){
                        personajes[heroe].life = false;
                    } else if(personajes[villano].name == "Lilith"){
                        personajes[heroe].life = false;
                    }
                break;
            case "Knight":
                    if(personajes[villano].name == "Ghoul"){
                        personajes[villano].life = false;
                    } else if(personajes[villano].name == "Troll"){
                        if(personajes[heroe].weapon == "Axe"){
                            personajes[villano].life = false;
                        } else{
                            personajes[heroe].life = false;
                        }
                    } else if(personajes[villano].name == "Wizard"){
                        personajes[heroe].life = false;
                    } else if(personajes[villano].name == "Lilith"){
                        personajes[heroe].life = false;
                    }
                break;
        
            default:
                break;
        }

        
        System.out.println("Personaje: "+ personajes[heroe].name + "\nArma: "+ personajes[heroe].weapon +"\nVida: " + personajes[heroe].life + "\n");
        System.out.println("Personaje: "+ personajes[villano].name + "\nArma: "+ personajes[villano].weapon +"\nVida: " + personajes[villano].life + "\n");

        if(personajes[heroe].life == true && personajes[villano].life == true){
            System.out.println(personajes[heroe].name + " y " + personajes[villano].name + " - Batalla Empatada!");
        } else{
            if(personajes[heroe].life == true){
                System.out.println(personajes[heroe].name + " Gano la batalla!");
            } else if(personajes[villano].life == true){
                System.out.println(personajes[villano].name + " Gano la batalla!");
            } 
        }

        System.out.println("\nSiguiente Pelea\n");
        try{        
            System.in.read();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class MyCharacter{
    String name;
    String weapon;
    boolean friend;
    boolean life=true;

    public MyCharacter(){

    }

    public MyCharacter(String name, String weapon, boolean friend){
        this.name = name;
        this.weapon = weapon;
        this.friend = friend;
    }

    // public void setName (String name){
    //     this.name = name;
    // }

    // public String getName (){
    //     return name;
    // }

    // public void setWeapone(String weapon){
    //     this.weapon = weapon;
    // }

    // public String getWeapon(){
    //     return weapon;
    // }

    // public void setVida(boolean life){
    //     this.life = life;
    // }

    // public boolean getVida(){
    //     return life;
    // }

    // public void setAmigo(boolean friend){
    //     this.friend = friend;
    // }

    // public boolean getAmigo(){
    //     return friend;
    // }
}

