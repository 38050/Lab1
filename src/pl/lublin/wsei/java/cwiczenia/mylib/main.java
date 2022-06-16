package pl.lublin.wsei.java.cwiczenia.mylib;

public class main {
    public static void main(String[] args) {
        Account acc = new Account();
        String txt = "Анна";
        System.out.printf(Account.translit((txt)));
    }
}