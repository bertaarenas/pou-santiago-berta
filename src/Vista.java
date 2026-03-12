import java.util.Scanner;

public class Vista {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre(){
        System.out.print("Introduce el nombre del Pou: ");
        return sc.next();
    }

    public int leerOpcion(){
        return sc.nextInt();
    }

    // -- ESTADO --//

    public void verEstado(Modelo pou){

        System.out.println("\nEstado de " + pou.getNombre());
        System.out.println("Hambre: " + pou.getHambre());
        System.out.println("Felicidad: " + pou.getFelicidad());
        System.out.println("Dinero: " + pou.getDinero());
        System.out.println("Energia: " + pou.getEnergia());
    }

    // MENU //
    public void verMenu(){

        System.out.println("\nMENU");
        System.out.println("1. Comer");
        System.out.println("2. Dormir");
        System.out.println("3. Jugar");
        System.out.println("4. Tienda");
        System.out.println("5. Estado");
        System.out.println("6. Salir");
    }


    // MENU DE COMIDA //
    public void verMenuComida(Modelo pou){

        System.out.println("COMIDA DISPONIBLE");

        if(pou.getHamburguesa() > 0)
            System.out.println("1. Hamburguesa (" + pou.getHamburguesa() + ")");

        if(pou.getKebab() > 0)
            System.out.println("2. Kebab (" + pou.getKebab() + ")");

        if(pou.getTaco() > 0)
            System.out.println("3. Taco (" + pou.getTaco() + ")");

        if(pou.getSushi() > 0)
            System.out.println("4. Sushi (" + pou.getSushi() + ")");

        if(pou.getPan() > 0)
            System.out.println("5. Pan (" + pou.getPan() + ")");

        System.out.println("6. Salir");
    }

    // -- TIENDA --//

    public void verTienda(){

        System.out.println("\nTIENDA");
        System.out.println("1. Hamburguesa (20€)");
        System.out.println("2. Kebab (15€)");
        System.out.println("3. Taco (10€)");
        System.out.println("4. Sushi (25€)");
        System.out.println("5. Pan (5€)");
        System.out.println("6. Salir");
    }

    public void mensaje(String m){
        System.out.println(m);
    }

}