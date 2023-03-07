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

    public Student randomStudent() {

        return this.studentArray[(int) (Math.random() * studentArray.length)];
    }

    public Student findById(int id) {
        Student ausgabeStudent = null;

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getId() == id) {
                ausgabeStudent = studentArray[i];
            }


        }
        return ausgabeStudent;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

    public String toString2() {
        String ausgabe = "";
        for (int i = 0; i < studentArray.length; i++) {
            ausgabe = ausgabe + "ID: " + studentArray[i].getId() +
                    " Name: " + studentArray[i].getName() + "\n";

        }
        return ausgabe;
    }
}
