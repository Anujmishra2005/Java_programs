package hashcode;

public class hellString {
    String str1 = new String("Codechef");
    String str2 = new String("Codeforces");
    String str3 = "Hackerrank";
    String str4 = "Leetcode";
    
    public String concatStrings() {
        return str1.concat(str2).concat(str3).concat(str4);
    }
    
    public String toUpperCase() {
        return str1.toUpperCase() + " " + str2.toUpperCase() + " " + str3.toUpperCase() + " " + str4.toUpperCase();
    }
    
    public String toLowerCase() {
        return str1.toLowerCase() + " " + str2.toLowerCase() + " " + str3.toLowerCase() + " " + str4.toLowerCase();
    }
    
    public char[] toCharacterArray() {
        String concatenated = concatStrings();
        return concatenated.toCharArray();
    }
    
    public boolean isEqual(String str1, String str2) {
        return str1.equals(str2);
    }
    
    public boolean isEqualWithOperator(String str3, String str4) {
        return str3 == str4;
    }
    
    public static void main(String[] args) {
    	
        hellString hello = new hellString();
        
        StringBuilder sb = new StringBuilder(str);
        
        
        sb.append("Java Programming");
        System.out.println(sb);
        
        System.out.println("Concatenated string: " + hello.concatStrings());
        System.out.println("Uppercase string: " + hello.toUpperCase());
        System.out.println("Lowercase string: " + hello.toLowerCase());
        System.out.println("Character array: " + new String(hello.toCharacterArray()));
//        System.out.println("Using equals method: " + hello.isEqual(str1 , str2));
//        System.out.println("Using == operator: " + hello.isEqualWithOperator(str3 , str4));
    }
}
