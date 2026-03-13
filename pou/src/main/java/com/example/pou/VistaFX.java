package com.example.pou;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class VistaFX {

    Label lblNombre = new Label();
    Label lblDinero = new Label();

    Label lblHambre = new Label();
    Label lblFelicidad = new Label();
    Label lblEnergia = new Label();

    Label lblInventario = new Label();

    ProgressBar barraHambre = new ProgressBar();
    ProgressBar barraFelicidad = new ProgressBar();
    ProgressBar barraEnergia = new ProgressBar();

    Button btnComer = new Button("Comer");
    Button btnDormir = new Button("Dormir");
    Button btnJugar = new Button("Jugar");
    Button btnTienda = new Button("Tienda");

    VBox root = new VBox(10);

    public VistaFX(){

        root.getChildren().addAll(

                lblNombre,
                lblDinero,

                lblHambre,
                barraHambre,

                lblFelicidad,
                barraFelicidad,

                lblEnergia,
                barraEnergia,

                new Label("Inventario"),
                lblInventario,

                btnComer,
                btnDormir,
                btnJugar,
                btnTienda
        );
    }

    public VBox getRoot(){
        return root;
    }

    public void actualizar(Modelo m){

        lblNombre.setText("Pou: " + m.getNombre());
        lblDinero.setText("Dinero: " + m.getDinero());

        lblHambre.setText("Hambre: " + m.getHambre());
        lblFelicidad.setText("Felicidad: " + m.getFelicidad());
        lblEnergia.setText("Energia: " + m.getEnergia());

        barraHambre.setProgress(m.getHambre()/100.0);
        barraFelicidad.setProgress(m.getFelicidad()/100.0);
        barraEnergia.setProgress(m.getEnergia()/100.0);

        lblInventario.setText(
                " Hamburguesa: " + m.getHamburguesa() +
                        "\n Kebab: " + m.getKebab() +
                        "\n Taco: " + m.getTaco() +
                        "\n Sushi: " + m.getSushi() +
                        "\n Pan: " + m.getPan()
        );
    }
}