/* 
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab

*/

public String stringSplosion(String str) {
  
  if(str == null || str.length() ==1)
   return str;
   
   StringBuilder result = new StringBuilder();
   StringBuilder subStringSoFar = new StringBuilder();
   
   for(int i=0;i<str.length();i++){
     subStringSoFar.append(str.charAt(i));
     result.append(subStringSoFar);
   }
   
   return result.toString();
}
