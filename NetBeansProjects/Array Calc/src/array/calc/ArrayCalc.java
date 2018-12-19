package array.calc;

import java.util.Scanner;

public class ArrayCalc {
    
    public static void main(String[] args) {
     
        //Array för att spara tal
        int[] tal = new int[10];
        
        //Scanner för tangentbordet
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i < tal.length; i++){
            tal[i] = keyboard.nextInt();
        }
        
    
    //Summera talen
    int Summa = 0;
    for (int i = 0; i < tal.length; i++){
    Summa += tal[i];
}
    System.out.println("Största talet är: " + Summa);
    
    
    //Ta reda på det störtsta talet
    int StorstaTalet = Integer.MIN_VALUE;
    for(int i=0; i < tal.length; i++) {
        if(tal[i] > StorstaTalet) {
            StorstaTalet = tal[i];
        }
    }
    
    System.out.println("Största talet är: " + StorstaTalet);
    
    //Räkna ut medelvärdet
    
        }
}
