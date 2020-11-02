package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sqlite.AjudanteParaBD;

import java.io.File;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {

        // Cria a base de dados caso não exista
        File f = new File(AjudanteParaBD.DB_PATH);

        if(!f.exists() && !f.isDirectory())
            AjudanteParaBD.createNewDatabase();

        launch(args);
    }
}
