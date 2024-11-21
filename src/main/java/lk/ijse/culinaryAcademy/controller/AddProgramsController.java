package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.culinaryAcademy.dto.ProgramsDTO;
import lk.ijse.culinaryAcademy.service.BOFactory;
import lk.ijse.culinaryAcademy.service.custom.ProgramsBO;


import java.io.IOException;

public class AddProgramsController {

    @FXML
    private Pane addPane;

    @FXML
    private Pane addPane1;

    @FXML
    private AnchorPane addProgramroot;

    @FXML
    private Pane cancelPane;

    @FXML
    private Label lblAdd;

    @FXML
    private Label lblAdd1;

    @FXML
    private Label lblCancel;

    @FXML
    private Label lblLanguageAlert;

    @FXML
    private Label lblNameAlert;

    @FXML
    private Label lblTypeAlert;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtProgramFee;

    @FXML
    private DatePicker txtdate;

    public static String id;



   ProgramsBO programsBO = BOFactory.getBoFactory().getBO(BOFactory.BOType.PROGRAMSBO);
   private static ProgramsManageController programsManageController = new ProgramsManageController();
    @FXML
    void btnAddOnAction(ActionEvent event) throws Exception {

//        String name = txtName.getText();
//        String duration = txtDuration.getText();
//        String fee = txtProgramFee.getText();
//        String date = txtdate.getValue().toString();
//
//        try {
//            programsBO.addPrograms(new ProgramsDTO( name, duration, fee, date));
////            loadAllPrograms();
//            new Alert(Alert.AlertType.CONFIRMATION,"Student Added Successful !", ButtonType.OK).show();
//        } catch (Exception e) {
//            e.printStackTrace();
//            new Alert(Alert.AlertType.ERROR, "Student Added Not Successful!", ButtonType.OK).show();
//        }
//
//        if (programsBO.addPrograms(new ProgramsDTO( name, duration, fee, date))) {
//            Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/culinaryAcademy/view/programs_manage.fxml"));
//            addProgramroot.getChildren().setAll(root);
//        }

        String id = txtID.getText();
        String name = txtName.getText();
        String duration = txtDuration.getText();
        String fee = txtProgramFee.getText();

//        ProgramsDTO programsDTO = new ProgramsDTO(id,name, duration, fee);

        try {
            programsBO.savePrograms(new ProgramsDTO(id,name, duration, fee));
            programsManageController.loadAllPrograms();
            new Alert(Alert.AlertType.CONFIRMATION,"Programs Added Successful !", ButtonType.OK).show();
        } catch (Exception e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Programs Added Not Successful!", ButtonType.OK).show();
        }

    }



    @FXML
    void btnAddOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnAddOnMouseExited(MouseEvent event) {

    }

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

    @FXML
    void btnCancelOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void btnCancelOnMouseExited(MouseEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void txtDurationOnAction(ActionEvent event) {

    }

    @FXML
    void txtDurationOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtIDOnAction(ActionEvent event) {

    }

    @FXML
    void txtIDOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameOnKeyPressed(KeyEvent event) {

    }

    @FXML
    void txtProgramFeeOnAction(ActionEvent event) {

    }

    @FXML
    void txtProgramFeeOnKeyPressed(KeyEvent event) {

    }

}
