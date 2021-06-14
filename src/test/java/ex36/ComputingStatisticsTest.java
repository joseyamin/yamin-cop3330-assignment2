package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void averageTest() {
        ComputingStatistics statisticComputer=new ComputingStatistics();
        ArrayList<Double> numsList=new ArrayList<Double>();
        numsList.add(100.0);
        numsList.add(200.0);
        numsList.add(1000.0);
        numsList.add(300.0);
        double expected=400;
        double actual=statisticComputer.average(numsList);
        assertEquals(expected,actual);
    }

    @Test
    void minimumTest() {
        ComputingStatistics statisticComputer=new ComputingStatistics();
        ArrayList<Double> numsList=new ArrayList<Double>();
        numsList.add(100.0);
        numsList.add(200.0);
        numsList.add(1000.0);
        numsList.add(300.0);
        double expected=100;
        double actual=statisticComputer.minimum(numsList);
        assertEquals(expected,actual);
    }

    @Test
    void maximumTest() {
        ComputingStatistics statisticComputer=new ComputingStatistics();
        ArrayList<Double> numsList=new ArrayList<Double>();
        numsList.add(100.0);
        numsList.add(200.0);
        numsList.add(1000.0);
        numsList.add(300.0);
        double expected=1000;
        double actual=statisticComputer.maximum(numsList);
        assertEquals(expected,actual);
    }

    @Test
    void stdTest() {
        ComputingStatistics statisticComputer=new ComputingStatistics();
        ArrayList<Double> numsList=new ArrayList<Double>();
        numsList.add(100.0);
        numsList.add(200.0);
        numsList.add(1000.0);
        numsList.add(300.0);
        double expected=353.55;
        double actual=statisticComputer.average(numsList);
        assertEquals(expected,actual);
    }
}