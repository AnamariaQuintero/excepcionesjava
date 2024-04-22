package com.mycompany.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public Calculator(){
    }
    
    public int division(int a, int b){
        /* Validaciòn que evita la excepicòn
        if(b <= 0){
            System.out.println("Operaciòn no permitida");
            return -1;
        }
        */
        boolean repeat;
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            repeat = false;
            try {
                res = a/b;
            } catch(ArithmeticException e){
                System.out.println("Operaciòn no vàlida");
                System.out.println("Ingrese un valor vàlido");
                
                try{
                    b = scanner.nextInt();
                } catch(InputMismatchException ex) {
                    System.out.println("Tipo de dato no es vàlido");
                    repeat = true;
                }
            } catch(InputMismatchException e) {
                System.out.println("Tipo de dato no es vàlido");
                System.out.println("Ingrese un valor vàlido");
                b = scanner.nextInt();
                repeat = true;
            }
            
        }while(repeat);
        
        return res;
    }
    
}
