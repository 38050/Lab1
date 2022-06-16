package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Pierwsza liczba:");
        num1 = input.nextInt();
        System.out.print("Druga liczba");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2);

    }





}
