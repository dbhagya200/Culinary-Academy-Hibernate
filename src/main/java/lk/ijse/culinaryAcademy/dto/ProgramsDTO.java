package lk.ijse.culinaryAcademy.dto;

import lk.ijse.culinaryAcademy.entity.Programs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProgramsDTO implements Serializable {
    private String programID;
    private String programName;
    private String programDuration;
    private String programFee;

    public Programs toEntity() {
        Programs programs = new Programs();
        programs.setProgramID(this.programID);
        programs.setProgramName(this.programName);
        programs.setProgramDuration(this.programDuration);
        programs.setProgramFee(this.programFee);
        return programs;
    }

}
