import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
// Prepare a Logic To Write the File and LOad data into File Using Buffered Writer
public static void main(String args[]) throws IOException{
    FileWriter fr = new FileWriter("E:\nayeem\Assignments\assignment 26\Files.txt");
    BufferedWriter br = new BufferedWriter(fr);
    br.write("Swapna");
    br.newLine();
    br.write("Swathi");
    br.newLine();
    br.write("Rocky");
    br.close();
}
}
