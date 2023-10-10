module com.bioguardian.bioguardian {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
    requires java.sql;

    opens com.bioguardian.bioguardian to javafx.fxml;
    exports com.bioguardian.bioguardian;
}