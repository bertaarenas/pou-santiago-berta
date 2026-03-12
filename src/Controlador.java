public class Controlador {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar(){

        int opcion;

        do{

            if(!modelo.vivo()){
                vista.mensaje("Tu Pou ha muerto ☠");
                break;
            }

            avisos();

            vista.verMenu();
            opcion = vista.leerOpcion();

            switch(opcion){

                case 1:
                    comer();
                    break;

                case 2:
                    dormir();
                    break;

                case 3:
                    jugar();
                    break;

                case 4:
                    tienda();
                    break;

                case 5:
                    vista.verEstado(modelo);
                    break;

            }

        }while(opcion != 6);

    }

    private void comer(){

        if(modelo.getHamburguesa() == 0 &&
                modelo.getKebab() == 0 &&
                modelo.getTaco() == 0 &&
                modelo.getSushi() == 0 &&
                modelo.getPan() == 0){

            vista.mensaje("No tienes comida disponible");
            return;
        }

        vista.verMenuComida(modelo);

        int op = vista.leerOpcion();

        switch(op){

            case 1:
                if(modelo.getHamburguesa() > 0){
                    modelo.setHamburguesa(modelo.getHamburguesa()-1);
                    modelo.setHambre(modelo.getHambre()+30);
                    vista.mensaje("Tu Pou comió hamburguesa");
                }
                break;

            case 2:
                if(modelo.getKebab() > 0){
                    modelo.setKebab(modelo.getKebab()-1);
                    modelo.setHambre(modelo.getHambre()+25);
                    vista.mensaje("Tu Pou comió kebab");
                }
                break;

            case 3:
                if(modelo.getTaco() > 0){
                    modelo.setTaco(modelo.getTaco()-1);
                    modelo.setHambre(modelo.getHambre()+20);
                    vista.mensaje("Tu Pou comió taco");
                }
                break;

            case 4:
                if(modelo.getSushi() > 0){
                    modelo.setSushi(modelo.getSushi()-1);
                    modelo.setHambre(modelo.getHambre()+35);
                    vista.mensaje("Tu Pou comió sushi");
                }
                break;

            case 5:
                if(modelo.getPan() > 0){
                    modelo.setPan(modelo.getPan()-1);
                    modelo.setHambre(modelo.getHambre()+10);
                    vista.mensaje("Tu Pou comió pan");
                }
                break;
        }
    }

    private void dormir(){

        modelo.setEnergia(modelo.getEnergia() + 30);
        modelo.setHambre(modelo.getHambre() - 10);

        vista.mensaje("Tu Pou ha dormido.");
    }

    private void jugar(){

        if(modelo.getEnergia() < 10){
            vista.mensaje("No tienes energía suficiente");
            return;
        }

        modelo.setFelicidad(modelo.getFelicidad() + 20);
        modelo.setEnergia(modelo.getEnergia() - 15);
        modelo.setDinero(modelo.getDinero() + 10);

        vista.mensaje("Tu Pou ha jugado y ganó 10 monedas!");
    }

    private void tienda() {

        vista.verTienda();
        int op = vista.leerOpcion();

        int precio = 0;

        switch (op) {

            case 1:
                precio = 20;
                break;
            case 2:
                precio = 15;
                break;
            case 3:
                precio = 10;
                break;
            case 4:
                precio = 25;
                break;
            case 5:
                precio = 5;
                break;
        }

        if (op >= 1 && op <= 5) {

            if (modelo.getDinero() < precio) {
                vista.mensaje("Dinero insuficiente");
            } else {
                modelo.setDinero(modelo.getDinero() - precio);
                modelo.setHambre(modelo.getHambre() + 30);

                vista.mensaje("Tu Pou ha comido.");
            }

        }
    }
}