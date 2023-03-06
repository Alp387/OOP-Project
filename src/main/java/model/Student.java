package model;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private String fachbereich;

    public Student() {

    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, String fachbereich, int id) {
        this.name = name;
        this.fachbereich = fachbereich;
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "" + this.name + ", " + this.fachbereich + ", " + id;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getFachbereich() {
        return this.fachbereich;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && fachbereich.equals(student.fachbereich);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fachbereich);
    }
}
