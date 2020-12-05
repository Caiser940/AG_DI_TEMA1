module com.mycompany.ag_di_tema1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ag_di_tema1 to javafx.fxml;
    exports com.mycompany.ag_di_tema1;
}
