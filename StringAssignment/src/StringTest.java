
public class StringTest {
	//HIT CTRL+A to select all
	//Then CTRL+C to copy
	// StringTest
	// Functions for Manipulating Strings
	// Complete Function Stubs
	// Test in function in main
    // 1.
    public static String writeFirstLast(String name) {

        int sepInd = name.indexOf(", ");
        String lastName = name.substring(0, sepInd);
        String firstName = name.substring(sepInd + 2, name.length());
        String fullName = firstName + " " + lastName;
        
        return fullName;
    }
    
    // 2.
    public static String reverse(String str) {
        String out = "";
        //TODO: Complete function code]
      int length = str.length()-1;

      while (length >= 0) {
        out+=(str.charAt(length));
        length--;
      }
        return out;
    }
    
    // 3.
    public static boolean isPalindrome(String str) {
        //TODO: Complete function code
        int length = str.length()-1;
    	boolean out = false;
        for (int count = 0; length >= count; count++) {
          char startChar = str.charAt(count);
          char lastChar = str.charAt(length - count);
          if (startChar == lastChar) {
            out = true;
          }
          if (startChar != lastChar) {
            out = false;
            break;
          }
        }
        return out;
    }
    
    // 4.
    public static String removeDashes(String ssn) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 6a.
    public static String lastFour(String ccNumber) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 7.
    public static String scroll(String str) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 8.
    public static String removeComments(String str) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 9.
    public static String removeTag(String html) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 10.
    public boolean isValidISBN(String isbn) {
        boolean valid = true;
        //TODO: Complete function code
        
        return valid;
    }
    
    

    public static void main(String[] args) {
        // Test your functions here
        // For example
        // 1.
        System.out.println("Testing Number 1");
        String name = "Twain, Mark";
        System.out.println(writeFirstLast(name));
        
        System.out.println("Testing Number 2");
        String rev = "hello";
        System.out.println(reverse(rev));
        
        System.out.println("Testing Number 3");
        String str = "hi";
        System.out.println(isPalindrome(str));


    }

}
