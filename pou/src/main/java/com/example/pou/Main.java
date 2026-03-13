package com.example.pou;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){

        Modelo modelo = new Modelo("Pou",80,80,80,50);

        VistaFX vista = new VistaFX();

        new Controlador(modelo, vista);

        Scene scene = new Scene(vista.getRoot(),320,500);

        stage.setTitle("Juego Pou");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}