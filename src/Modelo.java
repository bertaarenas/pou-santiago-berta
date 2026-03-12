public class Modelo {

    private String nombre;
    private int hambre;
    private int felicidad;
    private int dinero;
    private int energia;


    private int hamburguesa;
    private int kebab;
    private int taco;
    private int sushi;
    private int pan;

    public Modelo(String nombre, int hambre, int felicidad, int dinero, int energia) {

        this.nombre = nombre;
        this.hambre = hambre;
        this.felicidad = felicidad;
        this.dinero = dinero;
        this.energia = energia;

        this.hamburguesa = 0;
        this.kebab = 0;
        this.taco = 0;
        this.sushi = 0;
        this.pan = 0;
    }

    // -- NOMBRE --//

    public String getNombre() {
        return nombre;
    }

    // -- HAMBRE -- //

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {

        if (hambre < 0) {
            this.hambre = 0;
        } else if (hambre > 100) {
            this.hambre = 100;
        } else {
            this.hambre = hambre;
        }
    }

    // -- FELICIDAD --//

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {

        if (felicidad < 0) {
            this.felicidad = 0;
        } else if (felicidad > 100) {
            this.felicidad = 100;
        } else {
            this.felicidad = felicidad;
        }
    }

    // --DINERO --//

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {

        if (dinero < 0) {
            this.dinero = 0;
        } else {
            this.dinero = dinero;
        }
    }

    // - ENERGIA -- //

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {

        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    // -- INVENTARIO --//

    public int getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(int hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public int getKebab() {
        return kebab;
    }

    public void setKebab(int kebab) {
        this.kebab = kebab;
    }

    public int getTaco() {
        return taco;
    }

    public void setTaco(int taco) {
        this.taco = taco;
    }

    public int getSushi() {
        return sushi;
    }

    public void setSushi(int sushi) {
        this.sushi = sushi;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    // -- ESTDO -- //

    public boolean vivo() {

        if (hambre == 0 || felicidad == 0) {
            return false;
        }

        return true;
    }
}