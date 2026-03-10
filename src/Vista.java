import java.util.Scanner;
public class Vista {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre() {
        System.out.println("Introduce el nombre: ");
        return sc.next();
    }


}
