package student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    List<Integer> marks = new ArrayList<>();

    Student(){
        for(int i=1;i<=5;i++){
            marks.add(Integer.valueOf(i));
        }
    }
    Student(int marks[]){
        for(int i=0; i<marks.length; i++){
            this.marks.add(Integer.valueOf(marks[i]));
        }
    }

}