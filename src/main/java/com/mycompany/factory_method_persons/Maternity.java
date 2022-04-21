package com.mycompany.factory_method_persons;

public class Maternity implements FactoryPerson {

    @Override
    public Person getPerson(String name, String sex) {
        if (sex.equals("m")) {
            return new Man(name);
        } else {
            return new Woman(name);
        }
    }

}
