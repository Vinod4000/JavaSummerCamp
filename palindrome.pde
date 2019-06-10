void palindrome (String word) {
  int length = word.length()-1;
  String answer = "";
  //int length = word.length()-1;
  
  //while (length >= 0) {
  //  println(word.charAt(length));
  //  length--;
  //}
  
  for (int count = 0; length >= count; count++) {
    char startChar = word.charAt(count);
    char lastChar = word.charAt(length - count);
    
    if (startChar == lastChar) {
      answer = "True";
    }
      
    if (startChar != lastChar) {
      answer = "False";
      break;
    }
  }
  
  println(answer);

}
void setup() {
  palindrome("tacocat");
}

  
