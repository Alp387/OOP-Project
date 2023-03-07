// nach dem Verschieben der Klasse ins Package "model" benötigen wir einen Import,
// damit ausserhalb des Packages Zugriff auf die Klasse haben. So wie wir fürs Testen
// die Testklasse jupiter importiert haben

import model.Student;
import model.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Student[] studentenArray = new Student[4];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);
        studentenArray[3] = new Student("Robin", "Security", 666);

        StudentDB neueStudentDB = new StudentDB(studentenArray);

        List<Student> studentList = new ArrayList<>();


        studentList.add(0, new Student("Mario", "deb", 147));
        studentList.add(1, new Student("Luigi", 148));
        studentList.add(2, new Student("Wario", 149));

        System.out.println(studentList.get(1));

        for (Student student : studentList) {
            System.out.println(student);
        }




//        System.out.println(neueStudentDB.toString());
//        System.out.println(neueStudentDB.toString2());
//
//        System.out.println(neueStudentDB.randomStudent());
        System.out.println("____Exceptions____");
        //System.out.println(neueStudentDB.findById(123));

//        Student guerbuezHasan = new Student();

// so haben wir Zugriff auf die public Variablen gehabt. Nächster Schritt war es
// die Variablen auf private zu setzen mit und getter/setter Methoden zu arbeiten

//guerbuez/*Hasan.name = "Hasan Alperen Gürbüz";
//guerbuezHasan.fachbereich = 1;
//guerbuezHasan.matrikelNummer = 123456;
//
//        System.out.println(guerbuezHasan.name);
//        System.out.println(guerbuezHasan.fachbereich);
//        System.ou*/t.println(guerbuezHasan.matrikelNummer);

// Ab hier haben wir getter/setter Methoden erstellt
//
//        guerbuezHasan.setName("Hasan Alperen Gürbüz");
//        guerbuezHasan.setId(123456);
//        guerbuezHasan.setFachbereich("Informatik");
//        System.out.println(guerbuezHasan.getName());
//        System.out.println(guerbuezHasan.getId());
//        System.out.println(guerbuezHasan.getFachbereich());
//
//        Student liasGuerbuez = new Student("Lias Gürbüz", "Gurkenwissenschaften", 03032022);
//        System.out.println(liasGuerbuez.getName());
//        ;
//        System.out.println(liasGuerbuez.toString());
//        System.out.println(guerbuezHasan.toString());
//
//        if (guerbuezHasan.equals(liasGuerbuez)) {
//            System.out.println("Is the same");
//        } else {
//            System.out.println("not the same");
//        }
//        if (guerbuezHasan.equals(guerbuezHasan)) {
//            System.out.println("Is the same");
//        } else {
//            System.out.println("not the same");
    }
}
