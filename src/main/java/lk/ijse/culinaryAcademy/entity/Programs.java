package lk.ijse.culinaryAcademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

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
//    @GeneratedValue(generator = "ProgramsIDGenerator")
//    @GenericGenerator(
//            name = "ProgramsIDGenerator",
//            strategy = "lk.ijse.culinaryAcademy.util.ProgramsIDGenerator"
//    )
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String programID;

    @Column(name = "programName", nullable = false)
    private String programName;

    @Column(name = "programDuration",nullable = false)
    private String programDuration;

    @Column(name = "programFee",nullable = false)
    private String programFee;




}
