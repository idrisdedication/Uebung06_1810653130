package Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe5 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Abdullatif", 1810653130, 2018));

        studentList.add(new Student("Idris Ihvan Inayetullah", 1010653130, 2017));

        studentList.add(new Student("Mahmut Efendi Hazretleri", 1110653130, 2016));

        for (Student s: studentList){

            System.out.println(s);
        }
    }
}
