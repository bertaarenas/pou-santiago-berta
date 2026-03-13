
public class Main {

    public static void main(String[] args) {

        Vista vista = new Vista();

        String nombre = vista.pedirNombre();

        Modelo modelo = new Modelo(nombre, 80, 80, 50, 80);

        Controlador controlador = new Controlador(vista, modelo);

        controlador.iniciar();
    }
}