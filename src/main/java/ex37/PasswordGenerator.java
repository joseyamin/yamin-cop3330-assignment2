package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordGenerator {
    ArrayList<Character> charList=new ArrayList<Character>();
    private static String possibleSpecials="!@\"#$%^&*()+?.";
    private static String possibleNumbers="1234567890";
    private static String possibleLetters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public String generatePassword(int numSpecial,int numNumbs,int numLetters){

        addLetters(numLetters);
        addSpecials(numSpecial);
        addNums(numNumbs);

        Collections.shuffle(charList);

        String finalPassword="";
        for(int i=0;i<charList.size();i++){
            finalPassword+=charList.get(i);
        }
        return finalPassword;
    }


    private void addSpecials(int amt){
        for(int i=0;i<amt;i++){
            charList.add(randomSpecials());
        }
    }
    private static char randomSpecials(){
        int randomNum=(int)(Math.random()*(possibleSpecials.length()));
        return possibleSpecials.charAt(randomNum);
    }

    private void addNums(int amt){
        for(int i=0;i<amt;i++){
            charList.add(randomNum());
        }
    }
    private static char randomNum(){
        int randomNum=(int)(Math.random()*(possibleNumbers.length()));
        return possibleNumbers.charAt(randomNum);
    }

    private void addLetters(int amt){
        for(int i=0;i<amt;i++){
            charList.add(randomLetters());
        }
    }
    private static char randomLetters(){
        int randomNum=(int)(Math.random()*(possibleLetters.length()));
        return possibleLetters.charAt(randomNum);
    }

}
