package com.mycompany.ahorcado;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String secretWord = "juego";
        char [] wordGuess = new char[secretWord.length()];
        int attempts = 6;
        
        for (int i= 0; i< wordGuess.length; i++){
            wordGuess[i] = '_';
        }
        
        while (attempts > 0){
            System.out.println("Palabra a adivinar: "+ String.valueOf(wordGuess));
            System.out.println("Ingrese una letra");
            char letter = scanner.next().toUpperCase().charAt(0);
        }
    }
}
