package model;

import java.util.Objects;

public class Student {

    private int matrikelNummer;
    private String name;
    private String fachbereich;

    public Student() {

    }

    public Student(String name, String fachbereich, int matrikelNummer) {
        this.name = name;
        this.fachbereich = fachbereich;
        this.matrikelNummer = matrikelNummer;
    }

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "" + this.name + ", " + this.fachbereich + ", " + matrikelNummer;
    }


    public int getMatrikelNummer() {
        return this.matrikelNummer;
    }

    public String getName() {
        return this.name;
    }

    public String getFachbereich() {
        return this.fachbereich;

    }

    public void setMatrikelNummer(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
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
        return matrikelNummer == student.matrikelNummer && name.equals(student.name) && fachbereich.equals(student.fachbereich);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrikelNummer, name, fachbereich);
    }
}
