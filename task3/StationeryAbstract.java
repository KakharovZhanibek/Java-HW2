package hw2.task3;

import java.util.Comparator;

public abstract class StationeryAbstract{
    private String name;
    private double price;

    public  String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static Comparator<StationeryAbstract>stationeryNameComparator=new Comparator<StationeryAbstract>() {
        @Override
        public int compare(StationeryAbstract o1, StationeryAbstract o2) {
            String name1 = o1.getName().toLowerCase();
            String name2 = o2.getName().toLowerCase();
            return name1.compareTo(name2);
        }
    };
    public static Comparator<StationeryAbstract>stationeryPriceComparator=new Comparator<StationeryAbstract>() {
        @Override
        public int compare(StationeryAbstract o1, StationeryAbstract o2) {
            double price1 = o1.getPrice();
            double price2 = o2.getPrice();
            return (int)(price1 - price2);
        }
    };

}
