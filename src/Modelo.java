public class Modelo {

    private String nombre;
    private int hambre = 100;
    private int felicidad = 50;
    private int dinero = 100;
    private int energia = 100;

    public Modelo(String nombre, int hambre,  int felicidad, int dinero, int energia){

        this.nombre = nombre;
        this.hambre = hambre;
        this.felicidad = felicidad;
        this.dinero = dinero;
        this.energia = energia;

    }

    public String getNombre(){

        return nombre;
    }

        // hambre //

    public int getHambre(){

        return hambre;
    }

    public void setHambre(int hambre){
        if(hambre<0){
            this.hambre = 0;
        } else if (hambre > 100) {
            this.hambre = 100;
        }else {
            this.hambre = hambre;
        }
    }


    // felicidad //

    public int getFelicidad(){

        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        if (felicidad < 0) {
            this.felicidad = 0;
        } else if (felicidad > 100) {
            this.felicidad = 100;

        }else {
            this.felicidad = felicidad;
        }

    }

    // Dinero //

    public int getDinero(){

        return dinero;
    }

    public void setDinero(int dinero) {
        if (dinero < 0){
            this.dinero = 0;
        } else if (dinero > 100) {
            this.dinero = 100;
        }else {
            this.felicidad = felicidad;
        }
    }

    // Energia //

    public int getEnergia(){

        return energia;
    }

    public void setEnergia(int energia){
        if (energia < 0){
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        }else {
            this.energia = dinero;
        }
    }

    public boolean vivo(){

        return true;
    }

    
}
