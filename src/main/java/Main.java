// nach dem Verschieben der Klasse ins Package "model" benötigen wir einen Import,
// damit ausserhalb des Packages Zugriff auf die Klasse haben. So wie wir fürs Testen
// die Testklasse jupiter importiert haben

import model.Student;
import model.StudentDB;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {


        Student[] studentenArray = new Student[4]; //Normaler Array
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);
        studentenArray[3] = new Student("Robin", "Security", 666);

        StudentDB neueStudentDB = new StudentDB(studentenArray);

        List<Student> studentList = new ArrayList<>(); //ArrayList


        studentList.add(0, new Student("Mario", "deb", 147));
        studentList.add(1, new Student("Luigi", 148));
        studentList.add(2, new Student("Wario", 149));

        System.out.println(studentList.get(1));

        System.out.println("-----------------");

        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("-----------HashMap----------");

        Map<Integer, Student> studentList3 = new HashMap<>(); //Map erstellen
                        //1 und 2 stehen jeweils für Key
        studentList3.put(1, new Student("Max", "IT", 123));  //objekt in dem fall Student hinzugefügt
        studentList3.put(2, new Student("Moritz", "IT", 241));

        System.out.println(studentList3.get(1));   //sout student mit Key 1

        studentList3.remove(1);  //Student mit Key 1 wird entfernt
        System.out.println("---------");
        System.out.println(studentList3.get(1));
        studentList3.put(1, new Student("Max wieder", "IT", 123)); //put füght neuen Student Hinzu ,
        studentList3.put(2, new Student("Moritz wieder", "IT", 241)); //oder überschreibt vorhandenen

        System.out.println("---Komplette Map---");
            //Hier wird jeder eintrag (entry) in der Map ausgegeben
        for (Map.Entry<Integer, Student> entry : studentList3.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }




//        System.out.println(neueStudentDB.toString());
//        System.out.println(neueStudentDB.toString2());
//
//        System.out.println(neueStudentDB.randomStudent());
 //      System.out.println("____Exceptions____");
        //System.out.println(neueStudentDB.findById(123));

//       Student guerbuezHasan = new Student();

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
