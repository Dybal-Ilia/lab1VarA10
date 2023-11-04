package bsu.rfe.java.group7.lab1.Dybal.varA9;

public class Lemonade extends Food{

    public String getTaste() {
        return taste;
    }

    public void setFilling(String taste) {
        this.taste = taste;
    }

    private String taste;
    public Lemonade(String taste) {
        super("Лимонад");
        this.taste = taste;
    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Lemonade)) return false; // Шаг 2
            return taste.equals(((Lemonade)arg0).taste); // Шаг 3
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " выпит");
    }
    @Override
    public String toString(){
        return "Лимонад со вкусом " + taste;
    }
}

