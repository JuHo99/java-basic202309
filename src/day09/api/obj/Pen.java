package day09.api.obj;

public class Pen {

    private Company company;
    private Integer serial; // 일련번호
    private String color;
    private Long price;

    public Pen() {
    }

    public Pen(Company company, int serial, String color, long price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //equals를 Override할 때 hashCode도 Override 해야함
        if(obj instanceof Pen){
            Pen target = (Pen)obj;
            return this.serial == target.serial
                    && this.company.equals(target.company)
                    && this.color.equals(target.color);
        }
        return super.equals(obj);
    }
}
