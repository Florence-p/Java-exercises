package FileLearn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProject {
    public static void main(String[] args) {
        String Filepath = "C:\\Users\\Florence Adepoju\\Desktop\\Test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(Filepath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
}
