package com.example.patientspring.model;


public class Patient {


    private int patient_cpr_id;
    private  String patient_first;
    private String patient_last;
    private String patient_adress;
    private String patient_city;
    private String patient_phone;
    private String patient_sex;



    public int getPatient_cpr_id() {
        return patient_cpr_id;
    }

    public void setPatient_cpr_id(int patient_cpr_id) {
        this.patient_cpr_id = patient_cpr_id;
    }

    public String getPatient_first() {
        return patient_first;
    }

    public void setPatient_first(String patient_first) {
        this.patient_first = patient_first;
    }

    public String getPatient_last() {
        return patient_last;
    }

    public void setPatient_last(String patient_last) {
        this.patient_last = patient_last;
    }

    public String getPatient_adress() {
        return patient_adress;
    }

    public void setPatient_adress(String patient_adress) {
        this.patient_adress = patient_adress;
    }

    public String getPatient_city() {
        return patient_city;
    }

    public void setPatient_city(String patient_city) {
        this.patient_city = patient_city;
    }

    public String getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(String patient_phone) {
        this.patient_phone = patient_phone;
    }

    public String getPatient_sex() {
        return patient_sex;
    }

    public void setPatient_sex(String patient_sex) {
        this.patient_sex = patient_sex;
    }
}
