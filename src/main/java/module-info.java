module pl.nataliamichalowska {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens pl.nataliamichalowska to javafx.fxml;
    exports pl.nataliamichalowska;
    exports pl.nataliamichalowska.controller;
    opens pl.nataliamichalowska.controller to javafx.fxml;
}