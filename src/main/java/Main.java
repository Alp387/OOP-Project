// nach dem Verschieben der Klasse ins Package "model" benötigen wir einen Import,
// damit ausserhalb des Packages Zugriff auf die Klasse haben. So wie wir fürs Testen
// die Testklasse jupiter importiert haben

import model.Student;

public class Main {

    public static void main(String[] args) {

        Student guerbuezHasan = new Student();

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

        guerbuezHasan.setName("Hasan Alperen Gürbüz");
        guerbuezHasan.setMatrikelNummer(123456);
        guerbuezHasan.setFachbereich("Informatik");
        System.out.println(guerbuezHasan.getName());
        System.out.println(guerbuezHasan.getMatrikelNummer());
        System.out.println(guerbuezHasan.getFachbereich());

        Student liasGuerbuez = new Student("Lias Gürbüz", "Gurkenwissenschaften", 03032022);
        System.out.println(liasGuerbuez.getName());
        ;
        System.out.println(liasGuerbuez.toString());
        System.out.println(guerbuezHasan.toString());

        if (guerbuezHasan.equals(liasGuerbuez)) {
            System.out.println("Is the same");
        } else {
            System.out.println("not the same");
        }
        if (guerbuezHasan.equals(guerbuezHasan)) {
            System.out.println("Is the same");
        } else {
            System.out.println("not the same");
        }
    }
}
