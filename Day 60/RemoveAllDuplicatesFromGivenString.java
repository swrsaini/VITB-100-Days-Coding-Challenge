class Solution {
    String removeDuplicates(String str) {
     
     String ans = "";
     for(int i = 0; i<str.length(); i++){
         String c = str.charAt(i) + "";
         if(!ans.contains(c))
         ans+=c;
     }
     return ans;
        
    }
}