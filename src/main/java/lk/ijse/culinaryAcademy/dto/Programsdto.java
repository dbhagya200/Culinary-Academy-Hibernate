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
    private long programID;
    private String programName;
    private String programDuration;
    private String programFee;

    public Programs toEntity() {
        Programs programsdto = new Programs();
        programsdto.setProgramID(this.programID);
        programsdto.setProgramName(this.programName);
        programsdto.setProgramDuration(this.programDuration);
        programsdto.setProgramFee(this.programFee);
        return programsdto;
    }
}
