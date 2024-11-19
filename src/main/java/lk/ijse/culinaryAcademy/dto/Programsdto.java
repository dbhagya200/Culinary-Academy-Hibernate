package lk.ijse.culinaryAcademy.dto;

import lk.ijse.culinaryAcademy.entity.Programs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Programsdto implements Serializable {
    private int programID;
    private String programName;
    private String programDuration;
    private String programFee;

}
