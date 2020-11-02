package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController
{
    @FXML private void onAddClick(ActionEvent event)
    {
        System.out.println("ADD");
    }

    @FXML private void onHistoricClick(ActionEvent event)
    {
        System.out.println("HISTORIC");
    }

    @FXML private void initialize()
    {
    }
}