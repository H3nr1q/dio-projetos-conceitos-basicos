module com.example.projetos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetos to javafx.fxml;
    exports com.example.projetos;
}