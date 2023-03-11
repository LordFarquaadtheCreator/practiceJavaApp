module com.example.practicejavaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicejavaapp to javafx.fxml;
    exports com.example.practicejavaapp;
}