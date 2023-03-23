module com.example.firstprojects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstprojects to javafx.fxml;
    exports com.example.firstprojects;
}