import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) throws FileNotFoundException {
        // Example usage of the Filehandling class
        File file = new File("\"C:\\Users\\ADMIN\\Downloads\\PRECIOUS KIPKORIR - Resume - Software Developer _ Problem Solver.txt\"");
        Scanner scanner = new Scanner(file);

        if (file.exists()) {
            System.out.println("scan.nextLine() = " + scanner.nextLine());
        } else {
            System.out.println("File not found!");
        }

        System.out.println("scan.nextLine() = " + scanner.nextLine());
        scanner.close();
    }
}


/* FileWriter writer = new FileWriter("output.txt");
        writer.write("fileContent.concat(\"\\n\");\n");
        writer.close();
        
        System.out.println("File written successfully.");
    }
} */