package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int suma(int a, int b) {
        return a+b;
    }
}
