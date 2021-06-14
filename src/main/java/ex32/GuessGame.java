package ex32;

import java.util.Scanner;

public class GuessGame {

    public int pickNumber(int difficulty){
        if(difficulty==1){
            return (int)(Math.random()*9+1);
        }else if(difficulty==2){
            return (int)(Math.random()*99+1);
        }else {
            return (int) (Math.random() * 999 + 1);
        }
    }

}
