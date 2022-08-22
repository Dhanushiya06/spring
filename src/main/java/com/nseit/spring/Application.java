package com.nseit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        BinarySearchImpl binarySearch = new BinarySearchImpl();
        int result = binarySearch.binarySearch(new int[]{3, 7, 8, 12}, 7);
        System.out.println(result);


        //SpringApplication.run(Application.class, args);
    }
}

