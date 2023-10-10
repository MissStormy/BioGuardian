package com.bioguardian.bioguardian.util;

import javafx.scene.control.Alert;

public class AlertTemplate {
    public static void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setContentText(mensaje);
        alerta.show();
    }
}
