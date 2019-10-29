package com.example.patientspring;

import com.example.patientspring.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class PatientController {

    @GetMapping("/")
        public String patient()
        {
            return "Opretpatient";
        }

    @PostMapping("/sendpressed")
    public String patientoprettet(Patient patient)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientsystem?useTimezone=true&serverTimezone=UTC", "root", "Morfar1559");

            Statement st = con.createStatement();


        st.executeUpdate("insert into patient value ('"
                + patient.getPatient_cpr_id()+ "', '"
                + patient.getPatient_first() + "', '"
                + patient.getPatient_last() + "', '"
                + patient.getPatient_adress() + "', '"
                + patient.getPatient_city() + "', '"
                + patient.getPatient_phone() + "', '"
                + patient.getPatient_sex()+ "')");

        System.out.println("oprettet");

        }


        catch (ClassNotFoundException e)
        {
        e.printStackTrace();
        }
        catch (SQLException ex)
        {
        ex.printStackTrace();
        }
        return "done";
    }



}
