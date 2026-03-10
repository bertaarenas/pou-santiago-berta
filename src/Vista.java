import java.util.Scanner;
public class Vista {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre() {
        System.out.println("Introduce el nombre: ");
        return sc.next();
    }

    public void verEstado(Modelo pou){
        System.out.println("Estado de "+ pou.getNombre());
        System.out.println("Hambre :" +pou.getHambre() );
        System.out.println("Felicidad :"+pou.getFelicidad());
        System.out.println("Dinero :"+pou.getDinero());
        System.out.println("Energia :"+pou.getEnergia());
    }

    public void verMenu(){
        System.out.println("MENU");
        System.out.println("1. Comer");
        System.out.println("2. Dormir");
        System.out.println("3. ");
        System.out.println("");
    }


}
