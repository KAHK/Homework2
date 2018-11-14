package kk72766;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String [] args) throws FileNotFoundException {

        String[][] map = FileReader.readFile(System.getProperty("user.dir")+"\\TicTacToe.csv");
        TicTacToeChecker.CheckMap(map);
    }
}