import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextualAnalysisApp {
    //Initiate new scanner called dataInput.
    static Scanner dataInput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException{
        //Create a string that will store the file name.
        //I didn't need the file extension because the .txt file is in the same folder as my java program.
        String fileName = "text.txt";
        File textFile = new File(fileName);
        dataInput = new Scanner(textFile);
        //Create a string called line.
        //This will hold each line as we iterate through the file.
        String line;
        //Create three integers to hold the number of letters, words, and sentances.
        int letters = 0;
        int words = 0;
        int sentances = 0;
        //Create two doubles to hold the average letters per word and the average words per sentance.
        Double averageLetters;
        Double averageWords;

        //Create a while loop to iterate through the lines of the file.
        while (dataInput.hasNextLine()){
            //Add one to the word count.
            words++;
            //Set the line variable to the next line in the the file.
            line = dataInput.nextLine();
            //Trim any white space off the line.
            line = line.trim();

            //Initiate a for loop that iterates through the characters in the line variable.
            for(int i = 0; i < line.length(); i++){
                //test if the current character is a letter.
                if((((int)line.charAt(i) >= 65) && ((int)line.charAt(i)<= 90))  || (((int)line.charAt(i)>=97) && ((int)line.charAt(i)<= 122))){
                    //If it is, then add one to the letters variable.
                    letters++;
                }

                //Test if the current character is a white space, and also that the next character isn't a white space.
                if ((line.charAt(i) == ' ') && (line.charAt(i+1) != ' ')){
                    //Add one to the word count.
                    words++;
                }

                //Test if the current character is a punctuation mark.
                if(String.valueOf(line.charAt(i)).equals("!") || String.valueOf(line.charAt(i)).equals(".") || String.valueOf(line.charAt(i)).equals("?")){
                    //If it is, add one to the sentance count.
                    sentances++;
                }

            }

        }
        //Formatting
        System.out.println("\n");

        //Print out the number of letters.
        System.out.println("The number of letters is: " + letters);

        //Print out the number of words.
        System.out.println("The number of words is: " + words);

        //Print out the number of sentances.
        System.out.println("The number of sentances is: " + sentances);

        //Formatting
        System.out.println("\n");

        //Calculate and print out the average number of letters per word.
        averageLetters = ((double)letters)/((double)words);
        System.out.format("The average number of letters per word is: %.2f%n", averageLetters);

        //Calculate and print out the average number of words per sentance.
        averageWords = ((double)words)/((double)sentances);
        System.out.format("The average number of words per sentance is: %.2f%n", averageWords);

        //Formatting
        System.out.println("\n");

        //Close the scanner.
        dataInput.close();

    }

}
