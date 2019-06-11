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
