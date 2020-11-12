package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sqlite.AjudanteParaBD;
import sqlite.Fatura;

import java.util.ArrayList;

public class HistoricController
{
    @FXML TableView tabela;

    @FXML TableColumn colId;
    @FXML TableColumn colValor;

    @FXML private void initialize()
    {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));

        ArrayList<Fatura> faturas = AjudanteParaBD.selectFaturas();

        for(Fatura f : faturas)
            tabela.getItems().add(f);
    }
}