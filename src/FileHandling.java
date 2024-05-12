import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {

        // Creation of file

    File myFile = new File("lokesh.txt");
    try {
        myFile.createNewFile();
    } catch (Exception e) {
        System.out.println("Some Error Occured During Creation of file\n");
    }


    // Writing in file
    try{
    FileWriter fileWriter = new FileWriter("lokesh.txt");
        fileWriter.write("This is is File Handling\nI am Lokesh singh\nI am going to finish It");
        fileWriter.close();
    } catch (IOException e) {
        System.out.println("Unable to write a file");
        e.printStackTrace();
    }

    // Reading a file
    File file = new File("lokesh.txt");
    try (Scanner sc = new Scanner(file)) {
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Some Error Occured During Reading the file");
        e.printStackTrace();
    }


        // Delete the file

        File f = new File("lokesh.txt");
        f.delete();

    }
}
