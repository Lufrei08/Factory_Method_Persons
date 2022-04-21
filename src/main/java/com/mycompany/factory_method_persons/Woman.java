package com.mycompany.factory_method_persons;

public class Woman extends Person {

    public Woman(String name) {
        this.name = name;
        System.out.println("Olá, senhor " + this.name);
    }
}
