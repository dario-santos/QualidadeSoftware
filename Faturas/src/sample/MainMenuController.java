package sample;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController
{
    @FXML public Button addButton;

    @FXML public void onEnterAddFaturaClick(ActionEvent event)
    {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("AddFatura.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) addButton.getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        catch (IOException ex)
        {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML public void onEnterHistoricClick(ActionEvent event)
    {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("Historic.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) addButton.getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        catch (IOException ex)
        {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML private void initialize()
    {
    }
}