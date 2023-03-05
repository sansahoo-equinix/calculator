package calculator;

public class Multiply extends Calculator{

    public Multiply(double x, double y){
        double product = multiply(x,y);
        addHistory(""+x+" * "+y+" = "+product);
        System.out.println(product);
    }
    public Multiply(long x, long y){
        long product = multiply(x,y);
        addHistory(""+x+" * "+y+" = "+product);
        System.out.println(product);
    }

    public double multiply(double x, double y){
        return x*y;
    }
    public long multiply(long x, long y){
        return x*y;
    }
}