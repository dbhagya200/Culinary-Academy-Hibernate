package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {

    @FXML
    private Label lblContactNoAlert;

    @FXML
    private Label lblEmailAlert;

    @FXML
    private Label lblFirstNameAlert;

    @FXML
    private Label lblLastNameAlert;

    @FXML
    private Label lblPasswordAlert;

    @FXML
    private Label lblSignIn;

    @FXML
    private Label lblSignUp;

    @FXML
    private Label lblUsernameAlert;

    @FXML
    private Pane signInPane;

    @FXML
    private Pane signUpPane;

    @FXML
    private TextField txtContactNo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;


    @FXML
    private AnchorPane rootNodeUp;

    @FXML
    void btnSignInOnAction(ActionEvent event) {
        try {
            navigateToTheSignInForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) {

    }

    @FXML
    void btnSignUpOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnSignUpOnMouseExited(MouseEvent event) {

    }

    @FXML
    void txtContactNoOnAction(ActionEvent event) {

    }

    @FXML
    void txtContactNoOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtEmailOnAction(ActionEvent event) {

    }

    @FXML
    void txtEmailOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtFirstNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtFirstNameOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtLastNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtLastNameOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void txtPasswordOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtUsernameOnAction(ActionEvent event) {

    }

    @FXML
    void txtUsernameOnKeyPressed(KeyEvent event) {

    }

    public void navigateToTheSignInForm() throws IOException {
        AnchorPane rootNode1 = FXMLLoader.load(this.getClass().getResource("/view/signIn_form.fxml"));

        Scene scene = new Scene(rootNode1);

        Stage stage = (Stage)this.rootNodeUp.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }

}
