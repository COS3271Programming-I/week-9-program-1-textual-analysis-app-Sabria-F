import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextualAnalysisApp {
    static Scanner dataInput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException{
        String fileName = "text.txt";
        File textFile = new File(fileName);
        Scanner dataInput = new Scanner(textFile);
        int letters = 0;
        int words = 1;
        int sentances = 1;
        Double averageLetters = (double)letters/words;
        Double averageWords = (double)words/sentances;


    }

}
