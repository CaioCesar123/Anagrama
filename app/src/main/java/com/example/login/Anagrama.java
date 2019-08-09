package com.example.login;

import java.util.Arrays;

public class Anagrama {

    public boolean comparar(String login, String nome){
        char[] login2 = login.toCharArray();
        char[] nome2 = nome.toCharArray();
        Arrays.sort(login2);
        Arrays.sort(nome2);

        if (Arrays.equals(login2, nome2)) {
            return true;
        } else {
            return false;
        }

    }

}

