package com.mycompany.factory_method_persons;

public class Factory_Method_Persons {

    public static void main(String[] args) {
        Maternity factor1 = new Maternity();
        
        String name = "João";
        String sex = "m";
        
        factor1.getPerson(name, sex);
        
        name = "Jurema";
        sex = "Autobot";
        
        factor1.getPerson(name, sex);
    }
}
