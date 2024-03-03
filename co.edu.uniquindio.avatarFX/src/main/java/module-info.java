module co.edu.uniquindio.avatarfx.avatarapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.avatarfx.avatarapp to javafx.fxml;
    exports co.edu.uniquindio.avatarfx.avatarapp;
}