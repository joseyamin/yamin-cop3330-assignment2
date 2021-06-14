package ex24;

public class Anagram {
    public boolean isAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        //check if there is equal amounts of each chars
        int amtChar=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    amtChar++;
                }
                if(str1.charAt(i)==str2.charAt(j)){
                    amtChar--;
                }
            }
            if(amtChar!=0){
                return false;
            }
        }
        return true;
    }
}
