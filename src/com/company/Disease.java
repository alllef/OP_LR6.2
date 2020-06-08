package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disease<T> { // Шаблонный класс болезни симптомами
    String name;
    int sickNumber=0;
    List<T> symptoms = new ArrayList<>();

    Disease(String name, List<T> symptoms) {
        this.name = name;
        this.symptoms=symptoms  ;
    }


    Disease() {

    }

}
