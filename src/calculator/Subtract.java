package calculator;

public class Subtract extends Calculator{

    public Subtract(double x, double y){
        double difference = subtract(x,y);
        addHistory(""+x+" - "+y+" = "+difference);
        System.out.println(difference);
    }
    public Subtract(long x, long y){
        long difference = subtract(x,y);
        addHistory(""+x+" - "+y+" = "+difference);
        System.out.println(difference);
    }
    public double subtract(double x, double y){
        return x-y;
    }
    public long subtract(long x, long y){
        return x-y;
    }
}