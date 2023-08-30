
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class hello {

    // private StringBuilder str = new StringBuilder ("");
    public static String read(String fileName) throws IOException {
        StringBuilder str = new StringBuilder("");
        BufferedReader ar = new BufferedReader(new FileReader(fileName));
        while (ar.ready()) {
            str.append((char) ar.read());
        }
        ar.close();
        return str.toString();

    }

    public static void write(String input, String outputFile) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(outputFile);
        pw.print(input);
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        String file = "readme.txt";
        System.out.println(read(file));

        String input = "hello there";
        String outputFile = "output.txt";
        write(input, outputFile);
    }

}
