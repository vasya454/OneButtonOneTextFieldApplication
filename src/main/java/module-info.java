module com.example.onebuttononetextfieldapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onebuttononetextfieldapplication to javafx.fxml;
    exports com.example.onebuttononetextfieldapplication;
}