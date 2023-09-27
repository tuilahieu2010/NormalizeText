package normalizeText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            int countLine = 0;
            br = new BufferedReader(new FileReader(new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\NormalizeText\\src\\normalizetext\\input.txt")));
            while (br.readLine() != null) {
                countLine++;
            }
            br.close();

            int count = 1;
            br = new BufferedReader(new FileReader(new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\NormalizeText\\src\\normalizetext\\input.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\dell\\Documents\\NetBeansProjects\\NormalizeText\\src\\normalizetext\\output.txt", true)));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                line = normalizeOneSpace(line);
                line = normalizeSpecialCharacters(line);
                line = capitalizeAfterDot(line);
                line = removeSpacesInsideQuotes(line);
                line = capitalizeFirstCharacter(line);
                line = addDotAtEnd(line);

                pw.print(line);

                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }

            br.close();
            pw.close();

            System.out.println("Normalize successful. 😊");
        } catch (FileNotFoundException ex) {
            System.err.println("File not found. ❌");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String normalizeOneSpace(String line) {
        return line;
    }

    private static String normalizeSpecialCharacters(String line) {
        return line;
    }

    private static String capitalizeAfterDot(String line) {
        return line;
    }

    private static String removeSpacesInsideQuotes(String line) {
        return line;
    }

    private static String capitalizeFirstCharacter(String line) {
        return line;
    }

    private static String addDotAtEnd(String line) {
        return line;
    }
}
