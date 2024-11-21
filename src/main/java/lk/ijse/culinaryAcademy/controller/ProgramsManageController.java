package lk.ijse.culinaryAcademy.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lk.ijse.culinaryAcademy.service.BOFactory;
import lk.ijse.culinaryAcademy.service.custom.ProgramsBO;
import lk.ijse.culinaryAcademy.dto.ProgramsDTO;
import lk.ijse.culinaryAcademy.service.BOFactory;
import lk.ijse.culinaryAcademy.service.custom.ProgramsBO;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ProgramsManageController implements Initializable {

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
    private TableView<?> tblPrograms;

    @FXML
    private TextField txtSearch;
    @FXML
    private TableColumn<?, ?> colDu;

    @FXML
    private TableColumn<?, ?> colFee;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    ProgramsBO programsBO = BOFactory.getBoFactory().getBO(BOFactory.BOType.PROGRAMSBO);

//    private static ProgramsManageController controller;
//
//    public ProgramsManageController(){controller = this;}
//
//    public static ProgramsManageController getInstance(){
//        return controller;
//    }

    @FXML
    void btnAddProgramsOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNodeForgot = FXMLLoader.load(getClass().getResource("/view/add_programs.fxml"));
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("add Programs");
        popupStage.setScene(new Scene(rootNodeForgot));
        popupStage.show();
    }
//    public void initialize() throws IOException {
//        FXMLLoader loader = new FXMLLoader(ProgramsManageController.class.getResource("/view/add_programs_bar.fxml"));
//        Parent root = loader.load();
//        loader.getController();
////        controller.setData(id);
//        vProgramsManage.getChildren().add(root);
//    }

//    public void allProgramsId() throws Exception {
//        vProgramsManage.getChildren().clear();
//        programs = programsBO.getAllPrograms();
////        if (programs != null) return;
////        for (ProgramsDTO programsDTO : programs) {
////            if (!programsDTO.getProgramID().equals("Removed")) loadAllPrograms(programsDTO.getProgramID());
////
////        }
//        if (programs != null) {
//            for (ProgramsDTO programsDTO : programs) {
//                loadAllPrograms(programsDTO.getProgramID());
//            }
//        }
//    }

//    private void loadAllPrograms(String programID) {
//        try {
//            FXMLLoader loader = new FXMLLoader(ProgramsManageController.class.getResource("/view/add_programs_bar.fxml"));
//            Parent root = loader.load();
//            AddProgramsBarController controller = loader.getController();
//            controller.setData(programID);
//            vProgramsManage.getChildren().add(root);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        try {
//            allProgramsId();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        colId.setCellValueFactory(new PropertyValueFactory<>("programID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("programName"));
        colDu.setCellValueFactory(new PropertyValueFactory<>("programDuration"));
        colFee.setCellValueFactory(new PropertyValueFactory<>("programFee"));
        
        loadAllPrograms();
    }

     void loadAllPrograms() {
        if (tblPrograms.getItems() == null) {
            tblPrograms.getItems().clear();
        }else if ( tblPrograms.getItems().size() > 0) {

            tblPrograms.getItems().clear();
            ObservableList<ProgramsDTO> items= (ObservableList<ProgramsDTO>) tblPrograms.getItems();
            try {
                /*Get all Programs*/
                List<ProgramsDTO> allPrograms = programsBO.getAllPrograms();
                System.out.println(allPrograms);

                for (ProgramsDTO p : allPrograms) {
                    items.add(new ProgramsDTO(p.getProgramID(), p.getProgramName(), p.getProgramDuration(), p.getProgramFee()));
                    System.out.println(p.getProgramID());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
         }

    }
}
