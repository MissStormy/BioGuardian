package com.bioguardian.bioguardian;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static com.bioguardian.bioguardian.util.AlertTemplate.mostrarError;

public class AppCtrl {
    @FXML
    private Button CancelBtn;

    @FXML
    private Button CleanBtn;
    @FXML
    private Button FotoBtn;

    @FXML
    private Button GuardarBtn;
    @FXML
    private TextField MNtxt;

    @FXML
    private TextField VLNTxt;

    @FXML
    private TextField VNTxt;


    @FXML
    private ComboBox<?> CmbMortal;

    @FXML
    private ComboBox<?> CmbTipo;

    @FXML
    private Button ExitBtn;
    @FXML
    private Button HealBtn;

    @FXML
    private AnchorPane HealPane;

    @FXML
    private Button ListBtn;

    @FXML
    private AnchorPane ListPane;

    @FXML
    private Button VenomBtn;

    @FXML
    private AnchorPane VenomPane;
    private final HerbDAO herbDAO;

    public AppCtrl(){
        //Arrancamos conexion con la BBDD
        herbDAO = new HerbDAO();
        try{
            herbDAO.conectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.getProperty("user.home"));
    }
    @FXML
    void OnClickClose(ActionEvent event) {
        Stage stage = (Stage) this.ExitBtn.getScene().getWindow();
        stage.close();
    }
    @FXML
    void OnClickCancel(ActionEvent event) {

    }

    @FXML
    void OnClickClean(ActionEvent event) {

    }
    @FXML
    void OnClickFoto(ActionEvent event) {
        mostrarError("Esto todavia no esta implementado");
    }
    @FXML
    void OnClickSave(ActionEvent event) {

    }

    @FXML
    void OnClickHeal(ActionEvent event) {
        HealBtn.setDisable(true);
        VenomBtn.setDisable(false);
        ListBtn.setDisable(false);

        HealPane.setVisible(true);
        VenomPane.setVisible(false);
        ListPane.setVisible(false);
    }

    @FXML
    void OnClickList(ActionEvent event) {
        HealBtn.setDisable(false);
        VenomBtn.setDisable(false);
        ListBtn.setDisable(true);

        HealPane.setVisible(false);
        VenomPane.setVisible(false);
        ListPane.setVisible(true);
    }

    @FXML
    void OnClickVenom(ActionEvent event) {
        HealBtn.setDisable(false);
        VenomBtn.setDisable(true);
        ListBtn.setDisable(false);

        HealPane.setVisible(false);
        VenomPane.setVisible(true);
        ListPane.setVisible(false);
    }
}