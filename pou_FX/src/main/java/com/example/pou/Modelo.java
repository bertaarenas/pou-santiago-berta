package com.example.pou;

public class Modelo {

    private String nombre;
    private int hambre;
    private int felicidad;
    private int energia;
    private int dinero;

    // INVENTARIO
    private int hamburguesa;
    private int kebab;
    private int taco;
    private int sushi;
    private int pan;

    public Modelo(String nombre, int hambre, int felicidad, int energia, int dinero){

        this.nombre = nombre;
        this.hambre = hambre;
        this.felicidad = felicidad;
        this.energia = energia;
        this.dinero = dinero;

        hamburguesa = 0;
        kebab = 0;
        taco = 0;
        sushi = 0;
        pan = 0;
    }

    public String getNombre(){ return nombre; }

    public int getHambre(){ return hambre; }
    public int getFelicidad(){ return felicidad; }
    public int getEnergia(){ return energia; }
    public int getDinero(){ return dinero; }

    public void setHambre(int hambre){
        this.hambre = Math.max(0, Math.min(100, hambre));
    }

    public void setFelicidad(int felicidad){
        this.felicidad = Math.max(0, Math.min(100, felicidad));
    }

    public void setEnergia(int energia){
        this.energia = Math.max(0, Math.min(100, energia));
    }

    public void setDinero(int dinero){
        this.dinero = Math.max(0, dinero);
    }

    public boolean vivo(){
        return hambre > 0;
    }


    public int getHamburguesa(){ return hamburguesa; }
    public void setHamburguesa(int v){ hamburguesa = v; }

    public int getKebab(){ return kebab; }
    public void setKebab(int v){ kebab = v; }

    public int getTaco(){ return taco; }
    public void setTaco(int v){ taco = v; }

    public int getSushi(){ return sushi; }
    public void setSushi(int v){ sushi = v; }

    public int getPan(){ return pan; }
    public void setPan(int v){ pan = v; }
}