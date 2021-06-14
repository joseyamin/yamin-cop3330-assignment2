package ex25;

public class PasswordStrength {
    public int passwordValidator(String password){
        //if it has less then 8 it falls into weak passwords
        if(password.length()<8){
            //check if it is a number only password
            boolean numOnly=true;
            for(int i=0;i<password.length();i++){
                if (!Character.isDigit(password.charAt(i))){
                    numOnly=false;
                }
            }
            //if it is number only return 0 for very weak else 1 for weak
            if(numOnly){
                return 0;
            }else{
                return 1;
            }
        }
        //count all types of chars
        int numbers = 0;
        int letters=0;
        int specials=0;
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                numbers++;
            }else if(Character.isAlphabetic(password.charAt(i))){
                letters++;
            }else{
                specials++;
            }
        }
        //if it has all then return 3 for very strong else 2 for strong
        if(numbers>0 && letters>0 && specials>0){
            return 3;
        }else{
            return 2;
        }
    }
}
