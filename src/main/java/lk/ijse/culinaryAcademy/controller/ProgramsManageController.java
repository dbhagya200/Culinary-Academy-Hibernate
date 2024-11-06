package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProgramsManageController {

    @FXML
    private ImageView imgAdd;

    @FXML
    private Label lblAddBook;

    @FXML
    private Label lblSearchAlert;

    @FXML
    private AnchorPane programsManageroot;

    @FXML
    private Pane searchPane;

    @FXML
    private Pane studentManagePane;

    @FXML
    private TextField txtSearch;

    @FXML
    private VBox vProgramsManage;

    @FXML
    void btnAddProgramsOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNodeForgot = FXMLLoader.load(getClass().getResource("/view/add_programs.fxml"));
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("add Programs");
        popupStage.setScene(new Scene(rootNodeForgot));
        popupStage.showAndWait();
    }
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(ProgramsManageController.class.getResource("/view/add_programs_bar.fxml"));
        Parent root = loader.load();
        loader.getController();
//        controller.setData(id);
        vProgramsManage.getChildren().add(root);
    }

    @FXML
    void btnAddProgramsOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnAddProgramsOnMouseExited(MouseEvent event) {

    }

    @FXML
    void txtSearchOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchOnMouseMoved(MouseEvent event) {

    }

}
