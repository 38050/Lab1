package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;
public class Main3 {

private static String leftPad(String aText, char aChar, int aWidth)

    {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1;
    do {
        System.out.print("Pierwsza liczba:");
        num1 = input.nextInt();
        if (num1 == 0) break;
        System.out.printf("Liczba dziesietna %d , liczba dwójkowa %s, liczba szesnastkowa: %s%n", num1,leftPad(Integer.toBinaryString(num1), '0', 8), leftPad(Integer.toHexString(num1), '0', 4));
    }while (true);
    }


}
