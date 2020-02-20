package com.kubitssu;

import java.util.Scanner;

import static com.kubitssu.Generator.generate;
import static com.kubitssu.Generator.swapMissing;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("|           Random Password Generator             |");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter length of Password: ");
        int length=scanner.nextInt();
        System.out.println("------------Your Password-------------");
        String stringPassword=new String (swapMissing(generate(length)));
        System.out.println("------------ "+stringPassword+" -------------");



    }
}
