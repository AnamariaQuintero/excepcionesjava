package com.mycompany.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.division(4,0);
        
        System.out.println(res);
        
        /*
        try {
            int res = calculator.division(4,0);
            System.out.println(res);
        } catch(Exception exception){
            System.out.println("Ha ocurrido un problema");
            System.out.println(exception);
            //int res = 5/0;
        } finally{
            System.out.println("finally excetuted");
        }
        System.out.println("Fuera del bloque try");
        */
        /*
        try {
            int numbers[] = new int [3];
            numbers[5] = 5/5;
        } catch(ArithmeticException e){
            System.out.println("Operaciòn no permitida");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posiciòn de array no valida");
        } catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
        */
        
        
    }
}
