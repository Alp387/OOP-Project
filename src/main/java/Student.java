public class Student {

    private int matrikelNummer;
    private String name;
    private String fachbereich;

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public String getName() {
        return name;
    }

    public String getFachbereich() {
        return fachbereich;

    }

    public void setMatrikelNummer(int neueMatrikelNummer) {
        matrikelNummer = neueMatrikelNummer;
    }

    public void setName(String neuerName) {
        name = neuerName;
    }

    public void setFachbereich(String neuerFachbereich) {
        fachbereich = neuerFachbereich;
    }
}
