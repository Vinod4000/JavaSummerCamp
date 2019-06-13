
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
    	str = str.toLowerCase();
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
        out = ssn.substring(0, 3) + ssn.substring(4, 6) + ssn.substring(7,11);
        
        return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
        String out = "";
        if (dateStr.charAt(0) != '0') {
        	dateStr = "0" + dateStr;
        }
        if (dateStr.length() == 9) {
        	dateStr = dateStr.substring(0,3) + "0" + dateStr.substring(3, dateStr.length());
        }

        out = dateStr.substring(3, 5) + "-" + dateStr.substring(0, 2) + "-" + dateStr.substring(6,10);

        return out;
    }
    
    // 6a.
    public static String lastFour(String ccNumber) {
        String out = "";
        out = ccNumber.substring(15, ccNumber.length());
        
        return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
        String out = "";
        out = ccNumber.substring(13, 14) + lastFour(ccNumber);
        
        return out;
    }
    
    // 7.
    public static String scroll(String str) {
        String out = "";
        out = str.substring(1, str.length()) + str.substring(0,1);
        
        return out;
    }
    
    // 8.
    public static String removeComments(String str) {
        if (str.indexOf("/*") != -1 && str.indexOf("*/") != -1) {
        	return str.substring(0, str.indexOf("/*")) + str.substring(str.indexOf("*/") + 2, str.length()); 
        } else {
        	return str;
        }
        
    }
    
    // 9.
    public static String removeTag(String html) {
        String out = "";
        int startInd = html.indexOf("<");
        int endInd = html.indexOf(">");
        
        int startInd2 = html.indexOf("<", startInd + 1);
        int endInd2 = html.indexOf(">", endInd + 1);
        
        if (startInd == -1 || endInd == -1 || startInd2 == -1 || endInd2 == -1) {
        	return html;
        }
        
        out = html.substring(endInd + 1, startInd2);
        
        
        return out;
    }
    
    // 10.
    public static boolean isValidISBN(String isbn) {
    	int x = 0;
        boolean valid = false;
        String[] nums = new String[10/*isbn.length()*/];
        for (int i = 0; i < 10 /*nums.length*/; i++) {
        
        	nums[i] = isbn.substring(i, i + 1); 
        	if (i == nums.length - 1 && nums[i].toLowerCase().equals("x")) {
        		nums[i] = "10";
        	}
        	if (nums[i].toLowerCase().equals("x")) {
        		valid = false;
        		return valid;
        	}
        	x += Integer.parseInt(nums[i]) * (10-i);
        }
        valid = x % 11 == 0;

        
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
        String str = "Racecar";
        System.out.println(isPalindrome(str));
        
        System.out.println("Testing Number 4");
        String ssn = "987-65-4321";
        System.out.println(removeDashes(ssn));
        
        System.out.println("Testing Number 5");
        String dateStr = "5/03/2017";
        System.out.println(changeDateFormat(dateStr));
        
        System.out.println("Testing Number 6a");
        String ccNumber = "4111 1111 1111 1111";
        System.out.println(lastFour(ccNumber));
        
        System.out.println("Testing Number 6b");
        String ccNumberb = "4111 1111 1112 1111";
        System.out.println(lastFive(ccNumberb));
        
        System.out.println("Testing Number 7");
        String scr = "hello";
        System.out.println(scroll(scr));
        
        System.out.println("Testing Number 8");
        String com = "he/*ll*/o";
        System.out.println(removeComments(com));
        
        System.out.println("Testing Number 9");
        String html = "Strings are immutable</read>";
        System.out.println(removeTag(html));
        
        System.out.println("Testing Number 10");
        String isbn = "096548534X";
        System.out.println(isValidISBN(isbn));
        
    }

}
