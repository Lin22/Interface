package com.company;


public interface MyInterface {

    int b=10;
    static int a=20;
    enum Enum_in_interface{A,B,C};

    static void static_method_in_interface() {

        System.out.println("Hi from static");
    }

    default void defaul_method_in_interface(){
        System.out.println("hi from default");}

    class Class_in_interface{
        public void print(){
            System.out.println("Hi from Class");
        }
        interface Interface_in_interface{}
    }
}
