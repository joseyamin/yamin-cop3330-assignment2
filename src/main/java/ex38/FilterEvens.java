package ex38;

public class FilterEvens {
    public int[] filterEvenNumber(int array[]){
        int numOfEvens=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                numOfEvens++;
            }
        }

        int newArray[]=new int[numOfEvens];
        int p=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                newArray[p]=array[i];
                p++;
            }
        }
        return newArray;
    }
}
