package com.bioguardian.bioguardian;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppCtrl {
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

    @FXML
    void OnClickClose(ActionEvent event) {
        Stage stage = (Stage) this.ExitBtn.getScene().getWindow();
        stage.close();
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