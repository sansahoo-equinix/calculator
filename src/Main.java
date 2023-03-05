import calculator.*;
import student.*;
public class Main {
    public static void main(String[] args) {

        Calculator c = new calculator.Add(2,5.0);
        Calculator c1 = new calculator.Add(3,5.0);
        Calculator c2 = new calculator.Add(4,5.0);
        Calculator c3 = new calculator.Add(5,5.0);
        Calculator c4 = new calculator.Add(6,5.0);
        Calculator c5 = new calculator.Add(7,5.0);

//        Calculator.printHistory(); // prints all the history
        Calculator.printHistory(3); // prints the last 3 operations

        Student s = new student.Add();

    }
}