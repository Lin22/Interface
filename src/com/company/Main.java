package com.company;

public class Main implements MyInterface {

    public static void main(String[] args) {

        Enum_in_interface s= Enum_in_interface.C;

        System.out.println("hi enum from interface");

        MyInterface.static_method_in_interface();

        MyInterface g = new Main();
        g.defaul_method_in_interface();

        MyInterface.Class_in_interface f= new MyInterface.Class_in_interface();
        f.print();
    }

    @Override
    public void defaul_method_in_interface() {

    }
}
