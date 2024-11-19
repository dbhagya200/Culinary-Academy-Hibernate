package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgotFormController {

    @FXML
    private Pane BackPane;

    @FXML
    private Label lblResetPassword;

    @FXML
    private Label lblSignIn;

    @FXML
    private Label lblUsernameAlert;

    @FXML
    private Pane resetPasswordPane;

    @FXML
    private AnchorPane rootNodeForget;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        navigateToTheSignInForm();
    }

    @FXML
    void btnResetPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void btnResetPasswordOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnResetPasswordOnMouseExited(MouseEvent event) {

    }

    @FXML
    void btnSignUpOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnSignUpOnMouseExited(MouseEvent event) {

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

        Stage stage = (Stage)this.rootNodeForget.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }

}
