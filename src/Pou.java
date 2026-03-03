public class Pou {

    private String nombre;
    private int hambre = 50;
    private int sueno = 50;
    private int felicidad = 50;
    private int dinero = 10;
    private int energia = 50;

    public Pou(String nombre, int hambre, int sueno, int felicidad, int dinero, int energia){

        this.nombre = nombre;
        this.hambre = hambre;
        this.sueno = sueno;
        this.felicidad = felicidad;
        this.dinero = dinero;
        this.energia = energia;

    }

    public String getNombre(){

        return nombre;
    }

    public int getHambre(){

        return hambre;
    }

    public int getSueno(){

        return sueno;
    }

    public int getFelicidad(){

        return felicidad;
    }

    public int getDinero(){

        return dinero;
    }

    public int getEnergia(){

        return energia;
    }

    public boolean vivo(){

        return true;
    }

    @Override
    public String toString() {
        return "Pou{" +
                "nombre='" + nombre + '\'' +
                ", hambre=" + hambre +
                ", sueno=" + sueno +
                ", felicidad=" + felicidad +
                ", dinero=" + dinero +
                ", energia=" + energia +
                '}';
    }
}
