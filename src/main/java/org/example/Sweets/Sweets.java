package org.example.Sweets;

public abstract class Sweets {
    public   String sweetname;
    public double weight;
    public int cost;

    public Sweets(String sweetname, double weight, int cost) {
        this.sweetname = sweetname;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "sweetname='" + sweetname + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
