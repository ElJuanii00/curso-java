public class Senso_Economico2020{
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis","Maura","Pepe","Frida","Hannia","Gustavo"};
        Senso senso = new Senso();
        senso.aplicaSenso();
        senso.grafica1();
    }
}

class Ciudadano{
    private char sexo;
    private int edad;
    private String lugar_Nacimiento;
    private boolean casa,auto,wifi,laptop;

    public Ciudadano(char sexo,int edad,String lugar_Nacimiento, boolean casa, boolean auto, boolean wifi, boolean laptop){
        this.sexo = sexo;
        this.edad = edad;
        this.lugar_Nacimiento = lugar_Nacimiento;
        this.casa = casa;
        this.auto = auto;
        this.wifi = wifi;
        this.laptop = laptop;
    }

    public int estudioSE(){
        int total = 0;
        if(casa){
            total++;
        }
        if(auto){
            total++;
        }
        if(wifi){
            total++;
        }
        if(laptop){
            total++;
        }
        return total;
    }

    public char getSexo(){
        return sexo;
    }

}

class Senso{
    Ciudadano[] encuesta = new Ciudadano[100];
    
    public void aplicaSenso(){
        char s;
        String l_n;
        int e;
        boolean c,a,w,l;
        
        for(int i=0;i < encuesta.length; i++){
            s = (int)(Math.random()*2)==0?'H':'M';
            e = (int)(Math.random()*50);
            l_n = (int)(Math.random()*2)==0?"A":"B";
            c = (int)(Math.random()*2)==0?false:true;
            a = (int)(Math.random()*2)==0?false:true;
            w = (int)(Math.random()*2)==0?false:true;
            l = (int)(Math.random()*2)==0?false:true;
            encuesta[i] = new Ciudadano(s, e, l_n, c, a, w, l);
        }
    }
    
    public void aplicaEncuesta() {
        
    }
    
    public void grafica1() {
        int t4=0,t3=0,t2=0,t1=0,t0=0;
        for(int i=0;i<encuesta.length;i++){
            if(encuesta[i].getSexo() == 'H'){
                switch(encuesta[i].estudioSE()){
                    case 0: t1++;
                    break;
                    case 1: t1++;
                    break;
                    case 2: t2++;
                    break;
                    case 3: t3++;
                    break;
                    case 4: t4++;
                        break;
                }
            }

            System.out.println(encuesta[i].estudioSE());
        }
    }

}