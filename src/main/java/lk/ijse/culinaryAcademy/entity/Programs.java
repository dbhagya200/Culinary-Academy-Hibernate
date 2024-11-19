package lk.ijse.culinaryAcademy.entity;

import lk.ijse.culinaryAcademy.dto.Programsdto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "programs")
public class Programs implements Serializable {

    @Id
    @Column(name = "programID" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int programID;

    @Column(name = "programName", nullable = false)
    private String programName;

    @Column(name = "programDuration",nullable = false)
    private String programDuration;

    @Column(name = "programFee",nullable = false)
    private String programFee;

//    public Programsdto toDto() {
//        Programsdto programsdto = new Programsdto();
//        programsdto.setProgramID(this.programID);
//        programsdto.setProgramName(this.programName);
//        programsdto.setProgramDuration(this.programDuration);
//        programsdto.setProgramFee(this.programFee);
//        return programsdto;
//    }


}
