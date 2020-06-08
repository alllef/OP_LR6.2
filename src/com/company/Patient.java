package com.company;

import java.util.ArrayList;

public class Patient {// Класс пациента с симптомами

ArrayList<String> symptoms = new ArrayList<>();

Patient(){}
Patient(ArrayList<String>symptoms){
    this.symptoms=symptoms;
}

}
