package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // render “Hello, World!” as big ASCII art
        try {
            System.out.println(FigletFont.convertOneLine("Hello, World!"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
