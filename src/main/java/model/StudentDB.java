package model;

import java.util.Arrays;

public class StudentDB {

    private Student[] studentArray;


    public StudentDB() {

    }

    public StudentDB(Student[] studentenArray) {
        this.studentArray = studentenArray;
    }

    public Student[] getAllStudents() {
        return this.studentArray;
    }

    @Override
    public String toString() {
        String ausgabe = "";
        for (int i = 0; i <studentArray.length; i++){
            ausgabe = ausgabe + "ID: " + studentArray[i].getId() +
                    " Name: " + studentArray[i].getName() + " ";

        }
        return ausgabe;
    }
}
