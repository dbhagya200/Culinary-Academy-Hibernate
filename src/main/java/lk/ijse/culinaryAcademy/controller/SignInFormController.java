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
import lk.ijse.culinaryAcademy.util.Navigations;

import java.io.IOException;

public class SignInFormController {

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
    private AnchorPane rootNodeLog;

    @FXML
    private Pane signInPane;

    @FXML
    private Pane signUpPane;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnSignInOnAction(ActionEvent event) {
        try {
            navigateToTheDashboard();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnSignInOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnSignInOnMouseExited(MouseEvent event) {

    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) {
        try {
            navigateToTheSignUpForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnSignUpOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnSignUpOnMouseExited(MouseEvent event) {

    }

    @FXML
    void hyperForgotPasswordOnAction(ActionEvent event) throws IOException {
        navigateToTheForgotForm();
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
    public void navigateToTheDashboard() throws IOException {
        AnchorPane rootNode1 = FXMLLoader.load(this.getClass().getResource("/view/dashboard.fxml"));

        Scene scene = new Scene(rootNode1);

        Stage stage = (Stage)this.rootNodeLog.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }
    public void navigateToTheSignUpForm() throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/signUp_form.fxml"));
        Scene scene = new Scene(rootNode);

        Stage stage = (Stage)this.rootNodeLog.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Sign Up Form");

    }
    public void navigateToTheForgotForm() throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/forgot_form.fxml"));
        Scene scene = new Scene(rootNode);

        Stage stage = (Stage)this.rootNodeLog.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Forgot Form");

    }


}
