package calculator;
import java.util.*;
public class Calculator {
    static List<String> history = new ArrayList<>();
    public void addHistory(String s){
        history.add(s);
    }
    public static void printHistory(){
        for(int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }
    public static void printHistory(int len){

        for(int i = history.size()-1; i >= 0 && len>0; i--,len--) {
            System.out.println(history.get(i));
        }
    }
}