module com.example.funcionarios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.funcionarios to javafx.fxml;
    exports com.example.funcionarios;
}