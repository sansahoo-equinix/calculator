package calculator;

public class Divide extends Calculator{

    public Divide(double x, double y){
        double quotient = divide(x,y);
        addHistory(""+x+" / "+y+" = "+quotient);
        System.out.println(quotient);
    }
    public Divide(long x, long y){
        double quotient = divide(x,y);
        addHistory(""+x+" / "+y+" = "+quotient);
        System.out.println(quotient);
    }

    public double divide(double x, double y){
        return x/y;
    }
    public double divide(long x, long y){
        return x/y;
    }
}