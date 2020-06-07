import java.util.Scanner;

public class scanner_trabajo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        String s = new String();
        System.out.print("Introduzca texto: ");
        s = teclado.nextLine();

        System.out.print("Tu nombre es: "+ s);
    }
}