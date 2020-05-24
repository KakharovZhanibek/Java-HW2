package hw2.task3;

public class Notebook extends StationeryAbstract {
    private int pageCount;

    public Notebook(double price,int pageCount){
        this.setName(this.getClass().getSimpleName());
        this.setPrice(price);
        this.pageCount=pageCount;
    }
}
