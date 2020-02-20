package com.kubitssu;

public class Generator {


    public static int randomInteger(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    //Filling array with random characters//
    static public char[] generate(int length) {
        char[] passwd = new char[length];
        for (int i = 0; i < length; i++) {
            passwd[i] = (char) randomInteger(33, 126);
        }
        return passwd;
    }
    //Checking if password have at least one upper case letter, one lower case letter one
    //special sign and one number, if not adding missing character on random position
    static public char[] swapMissing(char[] array) {
        char[] password = array;
        int lowerCase = 0, upperCase = 0, special = 0, number = 0;
        do {
            for (int i = 0; i < password.length; i++) {
                if (password[i] <= 57 && password[i] >= 48) number++;
                else if (password[i] <= 90 && password[i] >= 65) upperCase++;
                else if (password[i] <= 122 && password[i] >= 97) lowerCase++;
                else special++;
            }
            if (lowerCase == 0) {
                password[randomInteger(0, password.length)] = (char) randomInteger(97, 122);
            }
            if (upperCase == 0) {
                password[randomInteger(0, password.length)] = (char) randomInteger(65, 90);
            }
            if (number == 0) {
                password[randomInteger(0, password.length)] = (char) randomInteger(48, 57);
            }
            if (special == 0) {
                int rand = randomInteger(0, 2);
                if (rand == 1) password[randomInteger(0, password.length)] = (char) randomInteger(33, 47);
                else if (rand == 2) password[randomInteger(0, password.length)] = (char) randomInteger(91, 96);
                else password[randomInteger(0, password.length)] = (char) randomInteger(123, 126);
            }
        }while (number==0||special==0||lowerCase==0||upperCase==0);
        return password;
    }
}
