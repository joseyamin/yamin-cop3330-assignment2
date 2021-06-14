package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generatePassword() {
        PasswordGenerator passwordGenerator=new PasswordGenerator();

        for(int i=0;i<100;i++){
            int randomMin=(int)(Math.random()*5+1);
            int randomAmtSpecial=(int)(Math.random()*10+5);
            int randomAmtNums=(int)(Math.random()*5+1);
            String pass=passwordGenerator.generatePassword(randomAmtSpecial,randomAmtNums,calculateAmtOfLetters(randomMin,randomAmtSpecial,randomAmtNums));
            assertTrue(validPassword(pass,randomMin,randomAmtSpecial,randomAmtNums));
        }
    }

    boolean validPassword(String pass,int min,int special,int nums){
        if(!(pass.length()>=min)){
            return false;
        }
        int foundNums=0;
        int foundSpecial=0;
        for(int i=0;i<pass.length();i++){
            if(Character.isDigit(pass.charAt(i))){
                foundNums++;
            }else if(Character.isAlphabetic(pass.charAt(i))){

            }else{
                foundSpecial++;
            }
        }
        if(special!=foundSpecial || nums!=foundNums){
            return false;
        }

        return true;
    }

    private static int calculateAmtOfLetters(int minLength,int amtSpecial,int amtNums){
        int totalAdded=amtNums+amtSpecial;
        if(minLength<=2*totalAdded){
            return totalAdded;
        }else{
            return (totalAdded)+(minLength-totalAdded);
        }
    }
}