package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.SQLOutput;

@RequiredArgsConstructor
@Getter

public class HelloLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("안녕하세요",12300);


        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }


    }


