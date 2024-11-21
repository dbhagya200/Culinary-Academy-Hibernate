package lk.ijse.culinaryAcademy.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.culinaryAcademy.service.BOFactory;
import lk.ijse.culinaryAcademy.service.custom.ProgramsBO;
import lk.ijse.culinaryAcademy.dto.ProgramsDTO;

public class AddProgramsBarController {

    @FXML
    private ImageView imgDelete;

    @FXML
    private ImageView imgEdit;

    @FXML
    private ImageView imgView;

    @FXML
    private Label lblDuration;

    @FXML
    private Label lblId;

    @FXML
    private Label lblName;

    @FXML
    private Label lblProgramFee;

    @FXML
    private Label lblregisterDate;

    @FXML
    private AnchorPane programsManageBarroot;
    private ProgramsDTO programsDTO;

    public static String programID;

    ProgramsBO programsBO = BOFactory.getBoFactory().getBO(BOFactory.BOType.PROGRAMSBO);

    public void setData(String id) throws Exception {

//        programsDTO = programsBO.getPrograms(id);
        lblId.setText(programsDTO.getProgramID());
        lblName.setText(programsDTO.getProgramName());
        lblDuration.setText(programsDTO.getProgramDuration());
        lblProgramFee.setText(programsDTO.getProgramFee());

    }

    @FXML
    void imgDeleteOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgDeleteOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void imgDeleteOnMouseExited(MouseEvent event) {

    }

    @FXML
    void imgEditOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgEditOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void imgEditOnMouseExited(MouseEvent event) {

    }

    @FXML
    void imgViewOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgViewOnMouseEntered(MouseEvent event) {

    }

    @FXML
    void imgViewOnMouseExited(MouseEvent event) {

    }

}
