package hw2.task2;

import java.util.ArrayList;

public class StationeryAccounting {

    public static double Accounting(ArrayList<Stationery> stationeries){
        double sum=0;
        for (int i=0;i<stationeries.size();i++){
            sum += stationeries.get(i).price;
        }
        return sum;
    }
}
