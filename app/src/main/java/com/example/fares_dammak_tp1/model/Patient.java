package com.example.fares_dammak_tp1.model;

import android.widget.RadioButton;
import android.widget.TextView;

public class Patient {
    private int age;
    private float valGlecimie;
    private boolean valButton;

    public Patient(int age, float valGlecimie, boolean valButton){
        this.age=age;
        this.valButton=valButton;
        this.valGlecimie=valGlecimie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getValGlecimie() {
        return valGlecimie;
    }

    public void setValGlecimie(float valGlecimie) {
        this.valGlecimie = valGlecimie;
    }

    public boolean isValButton() {
        return valButton;
    }

    public void setValButton(boolean valButton) {
        this.valButton = valButton;
    }

    public String calculer(double valeur, int age){
        boolean isNormal = true;
        String result;
        if(valButton==false){
            if(valeur > 10.5){
                isNormal = false;
            }
        }else{
            if(age < 6){
                if(!(valeur > 5.5 && valeur < 10.0)){
                    isNormal = false;
                }
            }else{
                if(age < 13){
                    if(!(valeur > 5.0 && valeur < 10.0)){
                        isNormal = false;
                    }
                }else{
                    if(!(valeur > 5.0 && valeur < 7.2)){
                        isNormal = false;
                    }
                }
            }
        }
        return result = isNormal? "Le patient est Normale" : "Le patient est Annormale";
    }
}
