/***Conditional Statements***/
/*
Given an integer, n, perform the following actions:
- If n is odd, print "Weird"
- If n is even and in the inclusive range 2 to 5,
  print "Not Weird"
- If n is even and in the inclusive range 6 to 20,
  print "Weird"
- If n is even and greater than 20, print "Not Weird"

Assume n will be between 1 and 100.
Complete the function below.
*/

String weirdOrNot(int N) {
  String answer = "";
  if (N % 2 == 1 || N % 2 == 0 && N >= 6 && N <= 20) {
    answer = "Weird";
  }
  if (N % 2 == 0 && N >= 20 || N % 2 == 0 && N >= 2 && N <= 5) {
    answer = "Not Weird";
  }

  return answer;
}

//***DO NOT CHANGE ANY OF THIS CODE***//
void setup() {
  println("***RESULTS***");
  testWeird(3, "Weird");
  testWeird(24, "Not Weird");
  testWeird(100, "Not Weird");
  testWeird(1, "Weird");
  testWeird(29, "Weird");
  testWeird(76, "Not Weird");
  testWeird(5, "Weird");
  testWeird(51, "Weird");
  testWeird(50, "Not Weird");
}
//***DO NOT CHANGE ANY OF THIS CODE***//
void testWeird(int num, String expected) {
  String ans = weirdOrNot(num);
  if (ans.equals(expected)) print("Correct! ");
  else print("Incorrect. ");
  println("Number: " + num + " | Expected: " + expected +
          " | Your output: " + ans);
}
//DO NOT CHANGE ANY OF THIS CODE//
