
public class Modelo {

    private String nombre;
    private int hambre;
    private int felicidad;
    private int dinero;
    private int energia;
    private int higiene;

    private int hamburguesa;
    private int kebab;
    private int taco;
    private int sushi;
    private int pan;

    private int vecesComido;
    private int vecesJugado;
    private int vecesComprado;
    private int vecesDormido;

    private boolean logroComido = false;
    private boolean logroJugado = false;
    private boolean logroComprado = false;
    private boolean logrodormido = false;


    public Modelo(String nombre, int hambre, int felicidad, int dinero, int energia) {

        this.nombre = nombre;
        this.hambre = hambre;
        this.felicidad = felicidad;
        this.dinero = dinero;
        this.energia = energia;
        this.higiene = 100;

        this.hamburguesa = 0;
        this.kebab = 0;
        this.taco = 0;
        this.sushi = 0;
        this.pan = 0;

        this.vecesComido = 0;
        this.vecesJugado = 0;
        this.vecesComprado = 0;
        this.vecesDormido = 0;
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

    // -- HIGIENE -- //

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {

        if (higiene < 0) {
            this.higiene = 0;
        }
        else if (higiene > 100) {
            this.higiene = 100;
        }
        else {
            this.higiene = higiene;
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

    // Logros

    public int getVecesComido() {
        return vecesComido;
    }
    public void incrementarVecesComido() {
        this.vecesComido++;
    }

    public int getVecesJugado() {
        return vecesJugado;
    }
    public void incrementarVecesJugado() {
        this.vecesJugado++;
    }

    public int getVecesComprado() {
        return vecesComprado;
    }
    public void incrementarVecesComprado() {
        this.vecesComprado++;
    }

    public int getVecesDormido() {
        return vecesDormido;
    }
    public void incrementarVecesDormido() {
        this.vecesDormido++;
    }

    public boolean isLogroComido() {
        return logroComido;
    }
    public void setLogroComido() {
        this.logroComido = true;
    }

    public boolean isLogroJugado() {
        return logroJugado;
    }
    public void setLogroJugado() {
        this.logroJugado = true;
    }

    public boolean isLogroComprado() {
        return logroComprado;
    }
    public void setLogroComprado() {
        this.logroComprado = true;
    }

    public boolean isLogrodormido() {
        return logrodormido;
    }
    public void setLogrodormido() {
        this.logrodormido = true;
    }

    // -- ESTDO -- //

    public boolean vivo() {

        if (hambre == 0 || felicidad == 0 || higiene == 0) {
            return false;
        }

        return true;
    }
}