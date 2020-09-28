import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileRead {
    public static void main(String[] args) {
        //variable declaration
        double mark1;
        double mark2;
        double exam;
        double averageMark = 0;
        File myObj = new File("student_data.txt");
        Scanner myReader=null;
        Scanner in = null;
        //Try and Catch for not found error
        try {
            myReader = new Scanner(myObj);
        }
        catch (FileNotFoundException e) {
            System.out.println("The file could not be found");
            e.printStackTrace();
        }
        //The  two scanners in action, to read the line, and each object in that line
        while (myReader.hasNextLine()) {
            String curLine = myReader.nextLine();
            in =new Scanner(curLine);
            in.useDelimiter(" ");
            String data = myReader.nextLine();
            int id=in.nextInt();
            String surname=in.next();
            String name = in.next();
            mark1= in.nextDouble();
            mark2= in.nextDouble();
            exam= in.nextDouble();
            averageMark=(mark1 * 0.1) + (mark2*0.1) + (exam*0.8);
            System.out.println(id + ", " + surname + " " + name + ": " + String.format("%.1f",averageMark));
            }
        //closing the scanners
        in.close();
        myReader.close();

        }
    }
