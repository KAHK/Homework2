package kk72766;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
        public static String[][] readFile(String args) throws FileNotFoundException {
            File inFile = new File(args);

            Scanner scanner = new Scanner(inFile);

            String[][] map = new String[3][3];
            String[] elements;
            int i = 0;
            while (scanner.hasNext()) {

                String line = scanner.nextLine();
                elements = line.split(",");
                map[i] = elements;
                System.out.println(line);

                i++;
            }
            return map;
        }
    }
