package hw2.task1;

import java.util.Objects;

public class Pen {

    private String name;
    private PenType penType;
    private String bodyFrom;


    public Pen(String name,PenType penType,String bodyFrom){
        this.name=name;
        this.penType=penType;
        this.bodyFrom=bodyFrom;
    }
    public String getName(){
        return this.name;
    }
    public String getPenType(){
        return this.penType.name();
    }
    public String getBodyFrom(){
        return this.bodyFrom;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(name, pen.name) &&
                penType == pen.penType &&
                Objects.equals(bodyFrom, pen.bodyFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, penType, bodyFrom);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", penType=" + penType +
                ", bodyFrom='" + bodyFrom + '\'' +
                '}';
    }
}
