package com.mycompany.ejercicio;

public class Even {
    public boolean isEven(int number) throws Exception{
        if(number % 2 == 0){
            throw new Exception("No me gustan los nùmeros pares"); //Para crear mi propia excepciòn 
            
        }
        return false;
    }
}
