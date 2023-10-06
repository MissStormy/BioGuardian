module com.bioguardian.bioguardian {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.bioguardian.bioguardian to javafx.fxml;
    exports com.bioguardian.bioguardian;
}