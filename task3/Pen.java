package hw2.task3;

import hw2.task1.PenType;

public class Pen extends StationeryAbstract {
    private PenType penType;

    public Pen(double price,PenType penType){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.penType=penType;
    }
}
