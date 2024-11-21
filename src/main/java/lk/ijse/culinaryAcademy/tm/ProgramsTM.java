package lk.ijse.culinaryAcademy.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProgramsTM {
    private String programID;
    private String programName;
    private String programDuration;
    private String programFee;
}
