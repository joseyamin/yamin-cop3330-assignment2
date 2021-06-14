package ex33;

public class Magic8Ball {
    private String phraseChoices[]={"Yes,","No,","Maybe,","Ask again later."};

    public String generateAnswer(){
        return phraseChoices[generateRandomNum()];
    }

    private static int generateRandomNum(){
        return (int)(Math.random()*4);
    }

}
