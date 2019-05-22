/*

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

  public int sumNumbers(String str) {
  int sum = 0;
  if(str == null || str.length() ==0){
    return sum;
  }
  
  StringBuilder num = new StringBuilder();
  for(int i=0; i< str.length(); i++){
     if(Character.isDigit(str.charAt(i))){
       num.append(str.charAt(i));
     }else{
       sum += getIntValue(num);
       num.setLength(0);
     }
  }
  sum +=getIntValue(num);
  return sum;
}

private int getIntValue(StringBuilder num){
  return num.toString().length() == 0 ? 0 : Integer.parseInt(num.toString());
}
