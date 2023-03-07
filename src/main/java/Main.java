// nach dem Verschieben der Klasse ins Package "model" benötigen wir einen Import,
// damit ausserhalb des Packages Zugriff auf die Klasse haben. So wie wir fürs Testen
// die Testklasse jupiter importiert haben

import model.Student;
import model.StudentDB;

public class Main {

    public static void main(String[] args) {


        Student[] studentenArray = new Student[3];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);

        StudentDB neueStudentDB = new StudentDB(studentenArray);

//        System.out.println(neueStudentDB.toString());
//        System.out.println(neueStudentDB.toString2());
//
//        System.out.println(neueStudentDB.randomStudent());
        System.out.println(neueStudentDB.findById(1));

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
