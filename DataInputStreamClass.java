package java_io_pkg;
import java.io.DataInputStream;
import java.io.IOException;
public class DataInputStreamClass {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(dis.readLine());
            System.out.println("Integer entered: " + num);
            
            System.out.print("Enter a double: ");
            double d = Double.parseDouble(dis.readLine());
            System.out.println("Double entered: " + d);
            
            System.out.print("Enter a string: ");
            String str = dis.readLine();
            System.out.println("String entered: " + str);
            
            System.out.print("Enter a character: ");
            char ch = (char) dis.read();
            System.out.println("Character entered: " + ch);
            
            dis.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}

