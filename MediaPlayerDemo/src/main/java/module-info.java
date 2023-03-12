module com.example.mediaplayerdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mediaplayerdemo to javafx.fxml;
    exports com.example.mediaplayerdemo;
}