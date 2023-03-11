module com.example.javafx_pratice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_pratice to javafx.fxml;
    exports com.example.javafx_pratice;
}