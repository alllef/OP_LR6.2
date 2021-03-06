package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {// Класс больница
    Disease<String>[] diseasesList = new Disease[10];// список возможных болезней


    void setupDiseases() {
        diseasesList[0] = new Disease<>("COVID-19", Arrays.asList("Кашель", "Температура", "Боль в груди"));
        diseasesList[1] = new Disease<>("Грипп", Arrays.asList("Насморк", "Кашель, Температура"));
        diseasesList[2] = new Disease<>("Ангина", Arrays.asList("Температура", "Боль в горле"));
    }

    void makeDiagnosis(Patient patient) {// установить диагноз
        for (Disease disease : diseasesList) {
            for (Object symptoms : disease.symptoms) {
                if (symptoms.equals(patient.symptoms)){}
            }
        }
    }
}
