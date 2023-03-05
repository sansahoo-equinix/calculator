package calculator;

public class Add extends Calculator{

    public Add(double x, double y){
        double sum = add(x,y);
        addHistory(""+x+" + "+y+" = "+sum);
        System.out.println(sum);
    }
    public Add(long x, long y){
        long sum = add(x,y);
        addHistory(""+x+" + "+y+" = "+sum);
        System.out.println(sum);
    }

    public double add(double x, double y){ return x+y; }
    public long add(long x, long y){
        return x+y;
    }
}