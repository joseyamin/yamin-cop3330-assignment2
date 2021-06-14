package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class Contest{
    ArrayList contestList=new ArrayList();

    public void addInputNames(){
        Scanner in=new Scanner(System.in);
        String name="...";
        while(!name.isEmpty()){
            System.out.print("Enter a name: ");
            name=in.nextLine();
            contestList.add(name);

        }
    }
    public String generateWinner(){
        return contestList.get(randomContestIndexGenerator()).toString();
    }
    public int randomContestIndexGenerator(){
        return (int)(Math.random()*contestList.size());
    }
}
