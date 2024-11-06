package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Pane booksPane;
    @FXML
    private AnchorPane customroot;

    @FXML
    private Pane branchesPane;

    @FXML
    private Pane catalogPane;

    @FXML
    private Pane dashboardPane;

    @FXML
    private AnchorPane dashbord;

    @FXML
    private ImageView imgBranches;

    @FXML
    private ImageView imgDashboard;

    @FXML
    private ImageView imgLogOut;

    @FXML
    private ImageView imgPrograms;

    @FXML
    private ImageView imgStudent;

    @FXML
    private ImageView imgTransparent;

    @FXML
    private ImageView imgUsers;

    @FXML
    private Label lblAdmin;

    @FXML
    private Label lblBooks;

    @FXML
    private Label lblBranches;

    @FXML
    private Label lblCatalog;

    @FXML
    private Label lblDashboard;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblLogOut;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblUsers;

    @FXML
    private Pane logOutPane;

    @FXML
    private Pane pagingPane;

    @FXML
    private Pane popUpLargePane;

    @FXML
    private Pane popUpPane;

    @FXML
    private Pane settingsPane;

    @FXML
    private Pane usersPane;

    @FXML
    void btnBranchesOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        Stage stage = (Stage) dashbord.getScene().getWindow();

        stage.setScene(new Scene(rootNode));
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) {

    }

    @FXML
    void btnProgramsOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(getClass().getResource("/view/programs_manage.fxml"));
        Stage stage = (Stage) customroot.getScene().getWindow();
        customroot.getChildren().clear();
        customroot.getChildren().add(rootNode);
        stage.setTitle("Student Manage Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnSettingsOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(getClass().getResource("/view/student_manage.fxml"));
        Stage stage = (Stage) customroot.getScene().getWindow();
        customroot.getChildren().clear();
        customroot.getChildren().add(rootNode);
        stage.setTitle("Student Manage Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnUsersOnAction(ActionEvent event) {

    }

}
