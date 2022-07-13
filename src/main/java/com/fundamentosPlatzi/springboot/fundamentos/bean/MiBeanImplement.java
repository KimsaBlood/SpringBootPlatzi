package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MiBeanImplement implements MiBean{
    @Override
    public void print() {
        System.out.println("Mi bean");
    }
}
