import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Modelo pou1 = new Modelo("pepe", 100, 100, 100, 100, 100);

        System.out.println(pou1.toString());

        System.out.println("-- Bienvenido al Pou --");
    }
    public static int menu(Scanner sc, int opcion) {
        System.out.println("1. Dar de comer");
        System.out.println("2. Dormir");
        System.out.println("3. Jugar");
        System.out.println("4. Tienda");
        System.out.println("5. Estado");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

    }
}