package com.example.fares_dammak_tp1.controller;

import com.example.fares_dammak_tp1.model.Patient;

public class Controller {
    public Patient patient;
    public static Controller instance;
    public Controller(){

    }
    public void craeteController(int age, float valButton,boolean mesure){
        this.patient = new Patient(age,valButton,mesure);
    }
    public void getResponse(){
        this.patient.calculer(this.patient.getValGlecimie(),this.patient.getAge());
    }
}
