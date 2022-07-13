package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printDependency() {
        System.out.println("Hola desde implementacion");
        System.out.println("Suma: "+myOperation.suma(3,5));
    }
}
