package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import sqlite.AjudanteParaBD;

import java.time.format.DateTimeFormatter;

public class AddFaturaController
{
    @FXML public TextField valor;
    @FXML public DatePicker data;

    @FXML public void onAddFatura(ActionEvent e)
    {
        try
        {
            float v = Float.valueOf(valor.getText().toString());

            String pattern = "yyyy-MM-dd";
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
            String s = data.getValue().format(dateFormatter);

            AjudanteParaBD.insertFaturaInFatura(v);
        }
        catch (Exception _)
        {

        }
    }

    @FXML private void initialize()
    {
    }
}