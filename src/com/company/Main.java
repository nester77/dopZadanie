package com.company;

public class Main {

    public static void main(String[] args) {
        int ourNumber=75345;
        int k=1;
        int a=10;

        while ((ourNumber%a)!= ourNumber) {
            k++;
            a*=10;
        }
        System.out.println("Длина числа "+k+" знака(ов)");

        System.out.print(ourNumber + " = ") ;

        int [] numberOfDigits=new int[10];

        for (int i= k-1; i>=0; i--){

            System.out.print(ourNumber/(int)Math.pow(10,i) + "*10^"+i+" + ") ;
            numberOfDigits[ourNumber/(int)Math.pow(10,i)]++;
            ourNumber %=(int)Math.pow(10,i);

        }
        System.out.println() ;
        for (int i=0; i<=9; i++){
           if (numberOfDigits[i] != 0 )
            System.out.println("[" + i + "] = " + numberOfDigits[i]);


        }
        System.out.println("МАССИВ");
        int [] array= {5,5,8,6,1,7,2,9,-15,1};
        int max=array[0];
        int min=array[0];

        for (int i=1; i<array.length; i++){
            if (array[i]>max) max=array[i];
            if (array[i]<min) min=array[i];

        }
        System.out.println("Минимальное число это "  + min);
        System.out.println("Максимальное число это "  + max);

    }
}
