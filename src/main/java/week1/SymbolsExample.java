package week1;

import java.io.IOException;

public class SymbolsExample {
    public static void main(String[] args) throws IOException {

        char ch;
        System.out.println("type right symbol and press ENTER: ");

        ch = (char) System.in.read();

        System.out.println("you type this symbol: " + ch);
    }
}
