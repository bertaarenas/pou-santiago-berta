import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Modelo pou1 = new Modelo("pepe", 100, 100, 100, 100);

        System.out.println(pou1.toString());

        System.out.println("-- Bienvenido al Pou --");
    }

}