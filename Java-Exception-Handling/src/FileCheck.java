import java.io.File;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        // Create a File object for the desired file path
        File file = new File("C:/Java/abc.txt");

        try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Check if the file exists
            if (file.exists()) {
                System.out.println("File exists.");

                // Check if it's a directory or a file
                if (file.isDirectory()) {
                    System.out.println("It is a directory.");
                } else if (file.isFile()) {
                    System.out.println("It is a regular file.");
                }

                // Print file name and absolute path
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
//            e.printStackTrace();
        }
    }
}
