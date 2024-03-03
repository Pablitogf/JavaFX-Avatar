package co.edu.uniquindio.avatarfx.avatarapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.avatarfx.avatarapp.model.Avatar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AvatarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnFinalizarRegistro;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEstatus;

    @FXML
    private TextField txtFechaNacimiento;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultadoRegsitro;

    @FXML
    void onFinalizarregistro(ActionEvent event) {
        agregarAvatar();
    }

    @FXML
    void initialize() {
    }

    private void agregarAvatar() {
        Avatar avatar = new Avatar();

        avatar.setNombre(txtNombre.getText());
        avatar.setApellido(txtApellido.getText());
        avatar.setEdad(Integer.parseInt(txtEdad.getText()));
        avatar.setFechaNacimiento(txtFechaNacimiento.getText());
        avatar.setEstatus(txtEstatus.getText());
        avatar.setCelular(txtCelular.getText());

        txtResultadoRegsitro.setText(avatar.toString());

    }



}

