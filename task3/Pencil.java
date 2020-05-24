package hw2.task3;

public class Pencil extends StationeryAbstract {
    private String bodyFrom;

    public Pencil(double price,String bodyFrom){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.bodyFrom=bodyFrom;
    }
}
