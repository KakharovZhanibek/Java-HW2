package hw2.task3;

public class Ruler extends StationeryAbstract {
    private int size;

    public Ruler(double price,int size){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.size=size;
    }
}
