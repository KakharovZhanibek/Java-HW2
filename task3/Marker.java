package hw2.task3;

public class Marker extends StationeryAbstract{
    private String color;

    public Marker(double price,String color){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.color=color;
    }
}
