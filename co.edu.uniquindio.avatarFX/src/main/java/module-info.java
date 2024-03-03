module co.edu.uniquindio.avatarfx.avatarapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.avatarfx.avatarapp to javafx.fxml;
    exports co.edu.uniquindio.avatarfx.avatarapp;

    opens co.edu.uniquindio.avatarfx.avatarapp.controller;
    exports co.edu.uniquindio.avatarfx.avatarapp.controller;
    //opens co.edu.uniquindio.avatarfx.avatarapp.model;
}