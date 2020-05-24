package hw2.task3;

public class Paper extends StationeryAbstract {
    private String format;

    public Paper(double price,String format){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.format=format;
    }
}
