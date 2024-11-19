package lk.ijse.culinaryAcademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.culinaryAcademy.dto.Programsdto;
import lk.ijse.culinaryAcademy.service.ProgramsService;
import lk.ijse.culinaryAcademy.service.ServiceFactory;

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

    ProgramsService programsService = (ProgramsService) ServiceFactory.getInstance().
            getService(ServiceFactory.ServiceTypes.PROGRAMS);
    @FXML
    void btnAddOnAction(ActionEvent event) throws IOException {

        Programsdto programsdto = new Programsdto();
        programsdto.setProgramName(txtName.getText());
        programsdto.setProgramDuration(txtDuration.getText());
        programsdto.setProgramFee(txtProgramFee.getText());

        if (programsService.addPrograms(programsdto)) {
            Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/culinaryAcademy/view/programs_manage.fxml"));
            addProgramroot.getChildren().setAll(root);
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
