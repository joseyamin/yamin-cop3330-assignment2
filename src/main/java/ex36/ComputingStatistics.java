package ex36;

import java.util.ArrayList;

public class ComputingStatistics {
    public double average(ArrayList<Double> numsList){
        double total=0;
        for(int i=0;i<numsList.size();i++){
            total+=numsList.get(i);
        }
        return total/numsList.size();
    }
    public double minimum(ArrayList<Double> numsList){
        double min=0;
        for(int i=0;i<numsList.size();i++){
            if(i==0){
                min=numsList.get(0);
            }else{
                if(numsList.get(i)<min){
                    min=numsList.get(i);
                }
            }
        }
        return min;
    }
    public double maximum(ArrayList<Double> numsList){
        double max=0;
        for(int i=0;i<numsList.size();i++){
            if(i==0){
                max=numsList.get(0);
            }else{
                if(numsList.get(i)>max){
                    max=numsList.get(i);
                }
            }
        }
        return max;
    }
    public double std(ArrayList<Double> numsList){
        ArrayList squaredMeans=new ArrayList<Double>();
        double mean=average(numsList);
        for(int i=0;i<numsList.size();i++){
            squaredMeans.add(Math.pow(numsList.get(i)-mean,2));
        }
        double result=Math.sqrt(average(squaredMeans));
        result=Math.round(result*100);
        return result/100;
    }

}
