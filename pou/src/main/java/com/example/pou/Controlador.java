package com.example.pou;

import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;

public class Controlador {

    private Modelo modelo;
    private VistaFX vista;

    public Controlador(Modelo modelo, VistaFX vista){

        this.modelo = modelo;
        this.vista = vista;

        vista.btnComer.setOnAction(e -> comer());
        vista.btnDormir.setOnAction(e -> dormir());
        vista.btnJugar.setOnAction(e -> jugar());
        vista.btnTienda.setOnAction(e -> tienda());

        vista.actualizar(modelo);
    }

    private void comer(){

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Hamburguesa",
                "Hamburguesa","Kebab","Taco","Sushi","Pan");

        dialog.setTitle("Inventario de comida");

        dialog.showAndWait().ifPresent(comida -> {

            if(comida.equals("Hamburguesa") && modelo.getHamburguesa()>0){
                modelo.setHamburguesa(modelo.getHamburguesa()-1);
                modelo.setHambre(modelo.getHambre()+30);
            }
            else if(comida.equals("Kebab") && modelo.getKebab()>0){
                modelo.setKebab(modelo.getKebab()-1);
                modelo.setHambre(modelo.getHambre()+25);
            }
            else if(comida.equals("Taco") && modelo.getTaco()>0){
                modelo.setTaco(modelo.getTaco()-1);
                modelo.setHambre(modelo.getHambre()+20);
            }
            else if(comida.equals("Sushi") && modelo.getSushi()>0){
                modelo.setSushi(modelo.getSushi()-1);
                modelo.setHambre(modelo.getHambre()+35);
            }
            else if(comida.equals("Pan") && modelo.getPan()>0){
                modelo.setPan(modelo.getPan()-1);
                modelo.setHambre(modelo.getHambre()+10);
            }
            else{
                alerta("No tienes esa comida en el inventario");
            }

            actualizar();
        });
    }

    private void dormir(){

        modelo.setEnergia(modelo.getEnergia()+30);
        modelo.setHambre(modelo.getHambre()-10);

        actualizar();
    }

    private void jugar(){

        if(modelo.getEnergia() < 10){
            alerta("Tu Pou está muy cansado ");
            return;
        }

        modelo.setEnergia(modelo.getEnergia()-15);
        modelo.setFelicidad(modelo.getFelicidad()+20);
        modelo.setDinero(modelo.getDinero()+10);

        actualizar();
    }

    private void tienda(){

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Hamburguesa 20",
                "Hamburguesa 20",
                "Kebab 15",
                "Taco 10",
                "Sushi 25",
                "Pan 5");

        dialog.setTitle("Tienda");

        dialog.showAndWait().ifPresent(comida -> {

            int precio = 0;

            if(comida.contains("Hamburguesa")) precio = 20;
            if(comida.contains("Kebab")) precio = 15;
            if(comida.contains("Taco")) precio = 10;
            if(comida.contains("Sushi")) precio = 25;
            if(comida.contains("Pan")) precio = 5;

            if(modelo.getDinero() < precio){
                alerta("Dinero insuficiente");
                return;
            }

            modelo.setDinero(modelo.getDinero()-precio);

            if(comida.contains("Hamburguesa"))
                modelo.setHamburguesa(modelo.getHamburguesa()+1);

            if(comida.contains("Kebab"))
                modelo.setKebab(modelo.getKebab()+1);

            if(comida.contains("Taco"))
                modelo.setTaco(modelo.getTaco()+1);

            if(comida.contains("Sushi"))
                modelo.setSushi(modelo.getSushi()+1);

            if(comida.contains("Pan"))
                modelo.setPan(modelo.getPan()+1);

            actualizar();
        });
    }

    private void actualizar(){

        vista.actualizar(modelo);

        if(modelo.getHambre() <= 0){
            alerta(" Tu Pou murió de hambre");
            System.exit(0);
        }

        if(modelo.getHambre() < 20)
            alerta(" Tu Pou tiene mucha hambre");

        if(modelo.getEnergia() < 20)
            alerta(" Tu Pou está cansado");

        if(modelo.getFelicidad() < 20)
            alerta(" Tu Pou está triste");
    }

    private void alerta(String texto){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(texto);
        alert.show();
    }
}