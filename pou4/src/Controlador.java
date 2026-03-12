import java.util.Random;

public class Controlador {

    private Vista vista;
    private Modelo modelo;
    private Random random = new Random();

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar(){

        int opcion;

        do{

            if(!modelo.vivo()){
                vista.mensaje("Tu Pou ha muerto.");
                break;
            }

            vista.verMenu();
            opcion = vista.leerOpcion();

            switch(opcion){

                case 1: comer(); comprobarLogros(); break;
                case 2: dormir(); comprobarLogros(); break;
                case 3: jugar(); comprobarLogros(); break;
                case 4: tienda(); comprobarLogros(); break;
                case 5: vista.verEstado(modelo); break;
                case 6: vista.verLogros(modelo); break;
            }

            comprobarLogros();

        }while(opcion != 7);
    }

    private void jugar(){

        vista.verMenuJuegos();
        int opcion = vista.leerOpcion();

        switch(opcion){
            case 1: piedrapapeltijera(); break;
            case 2: dados(); break;
        }

        modelo.incrementarVecesJugado();
        modelo.setHigiene(modelo.getHigiene() - 10);
    }

    private void piedrapapeltijera(){

        vista.mensaje("0 = Piedra  |  1 = Papel  |  2 = Tijera");
        int jugador = vista.leerOpcion();

        if(jugador < 0 || jugador > 2){
            vista.mensaje("Opcion no valida.");
            return;
        }

        int cpu = random.nextInt(3);
        String[] nombres = {"Piedra", "Papel", "Tijera"};

        vista.mensaje("Tu: " + nombres[jugador] + " | Pou: " + nombres[cpu]);

        if(jugador == cpu){
            vista.mensaje("Empate.");
        }
        else if((jugador == 0 && cpu == 2) || (jugador == 1 && cpu == 0) || (jugador == 2 && cpu == 1)){
            modelo.setFelicidad(modelo.getFelicidad() + 2);
            modelo.setDinero(modelo.getDinero() + 3);
            modelo.setEnergia(modelo.getEnergia() - 2);
            vista.mensaje("Has ganado! +2 de felicidad, +3 monedas y -2 de energia");
        }
        else {
            modelo.setFelicidad(modelo.getFelicidad() - 1);
            vista.mensaje("Has perdido, -1 de felicidad");
        }
    }

    private void dados(){

        vista.mensaje("Se tiraran dos dados, el mayor gana.");

        int dadoJugador = random.nextInt(6) + 1;
        int dadoPou = random.nextInt(6) + 1;

        vista.mensaje("Tu dado: " + dadoJugador + " | Dado del Pou: " + dadoPou);

        if(dadoJugador > dadoPou){
            modelo.setFelicidad(modelo.getFelicidad() + 2);
            modelo.setDinero(modelo.getDinero() + 3);
            modelo.setEnergia(modelo.getEnergia() - 2);
            vista.mensaje("Has ganado! +2 de felicidad, +3 monedas y -2 de energia");
        }
        else if(dadoPou > dadoJugador){
            modelo.setFelicidad(modelo.getFelicidad() - 1);
            vista.mensaje("Has perdido, -1 de felicidad");
        }
        else {
            vista.mensaje("Empate.");
        }
    }

    private void comprobarLogros(){

        if(!modelo.isLogroComido() && modelo.getVecesComido() >= 15){
            modelo.setLogroComido();
            vista.mensaje("-- LOGRO DESBLOQUEADO: Hambre - Come 15 veces --");
        }
        if(!modelo.isLogroJugado() && modelo.getVecesJugado() >= 10){
            modelo.setLogroJugado();
            vista.mensaje("LOGRO DESBLOQUEADO: Jugador - Juega 10 veces");
        }
        if(!modelo.isLogroComprado() && modelo.getVecesComprado() >= 5){
            modelo.setLogroComprado();
            vista.mensaje("LOGRO DESBLOQUEADO: Comprador - Compra 5 veces");
        }
        if(!modelo.isLogrodormido() && modelo.getVecesDormido() >= 20){
            modelo.setLogrodormido();
            vista.mensaje("LOGRO DESBLOQUEADO: Dormillon - Duerme 20 veces");
        }
    }

    private void comer(){

        if(modelo.getHamburguesa()==0 &&
                modelo.getKebab()==0 &&
                modelo.getTaco()==0 &&
                modelo.getSushi()==0 &&
                modelo.getPan()==0){

            vista.mensaje("No tienes comida.");
            return;
        }

        vista.verMenuComida(modelo);
        int op = vista.leerOpcion();

        switch(op){

            case 1:
                if(modelo.getHamburguesa()>0){
                    modelo.setHamburguesa(modelo.getHamburguesa()-1);
                    modelo.setHambre(modelo.getHambre()+30);
                    modelo.setHigiene(modelo.getHigiene()-5);
                    modelo.incrementarVecesComido();
                    vista.mensaje("Tu Pou comio hamburguesa");
                }
                break;

            case 2:
                if(modelo.getKebab()>0){
                    modelo.setKebab(modelo.getKebab()-1);
                    modelo.setHambre(modelo.getHambre()+25);
                    modelo.setHigiene(modelo.getHigiene()-5);
                    modelo.incrementarVecesComido();
                    vista.mensaje("Tu Pou comio kebab");
                }
                break;

            case 3:
                if(modelo.getTaco()>0){
                    modelo.setTaco(modelo.getTaco()-1);
                    modelo.setHambre(modelo.getHambre()+20);
                    modelo.setHigiene(modelo.getHigiene()-5);
                    modelo.incrementarVecesComido();
                    vista.mensaje("Tu Pou comio taco");
                }
                break;

            case 4:
                if(modelo.getSushi()>0){
                    modelo.setSushi(modelo.getSushi()-1);
                    modelo.setHambre(modelo.getHambre()+35);
                    modelo.setHigiene(modelo.getHigiene()-5);
                    modelo.incrementarVecesComido();
                    vista.mensaje("Tu Pou comio sushi");
                }
                break;

            case 5:
                if(modelo.getPan()>0){
                    modelo.setPan(modelo.getPan()-1);
                    modelo.setHambre(modelo.getHambre()+10);
                    modelo.setHigiene(modelo.getHigiene()-5);
                    modelo.incrementarVecesComido();
                    vista.mensaje("Tu Pou comio pan");
                }
                break;
        }
    }

    private void dormir(){

        modelo.setEnergia(modelo.getEnergia()+30);
        modelo.setHambre(modelo.getHambre()-10);
        modelo.incrementarVecesDormido();

        vista.mensaje("Tu Pou ha dormido.");
    }

    private void tienda(){

        vista.verTienda();
        int op = vista.leerOpcion();

        int precio = 0;

        switch(op){
            case 1: precio=20; break;
            case 2: precio=15; break;
            case 3: precio=10; break;
            case 4: precio=25; break;
            case 5: precio=5; break;
            case 6: precio=10; break;
        }

        if(op>=1 && op<=6){

            if(modelo.getDinero() < precio){
                vista.mensaje("Dinero insuficiente");
            }else{

                modelo.setDinero(modelo.getDinero()-precio);
                modelo.incrementarVecesComprado();

                switch(op){
                    case 1:
                        modelo.setHamburguesa(modelo.getHamburguesa()+1);
                        break;
                    case 2:
                        modelo.setKebab(modelo.getKebab()+1);
                        break;
                    case 3:
                        modelo.setTaco(modelo.getTaco()+1);
                        break;
                    case 4:
                        modelo.setSushi(modelo.getSushi()+1);
                        break;
                    case 5:
                        modelo.setPan(modelo.getPan()+1);
                        break;
                    case 6:
                        modelo.setHigiene(modelo.getHigiene()+50);
                        vista.mensaje("Tu Pou se ha duchado.");
                        break;
                }

                if(op != 6) vista.mensaje("Compra realizada!");
            }
        }
    }
}