package java_io_pkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println("Integer entered: " + num);
            
            System.out.print("Enter a double: ");
            double d = Double.parseDouble(br.readLine());
            System.out.println("Double entered: " + d);
            
            System.out.print("Enter a string: ");
            String str = br.readLine();
            System.out.println("String entered: " + str);
            
            System.out.print("Enter a character: ");
            char ch = (char) br.read();
            System.out.println("Character entered: " + ch);

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
