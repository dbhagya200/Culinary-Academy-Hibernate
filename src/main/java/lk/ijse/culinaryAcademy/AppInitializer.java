package lk.ijse.culinaryAcademy;

import lk.ijse.culinaryAcademy.dto.Programsdto;
import lk.ijse.culinaryAcademy.service.ProgramsService;
import lk.ijse.culinaryAcademy.service.impl.ProgramsServiceImpl;

public class AppInitializer {
    public static void main(String[] args) {
        ProgramsService programsService =  ProgramsServiceImpl.getInstance();
        Programsdto programsdto = getProgramsDto();

        programsService.addPrograms(programsdto);
    }
    private static Programsdto getProgramsDto() {
        Programsdto programsdto = new Programsdto();
        // Sets Customer table's primary key
//        programsdto.setProgramID("1L");
        // Sets Customer Name
        programsdto.setProgramName("Professional_Cooking");
        // Sets the customer address
        programsdto.setProgramDuration("1_year");
        // Sets the customer age
        programsdto.setProgramFee("120,000.00");

        return programsdto;
    }

}
