package Aufgabe5;

public class Student {

    private String name;
    private int martrikelnummer;
    private int jahrgang;

    public Student(String name, int martrikelnummer, int jahrgang) {

        this.name = name;

        this.martrikelnummer = martrikelnummer;

        this.jahrgang = jahrgang;
    }

    @Override
    public String toString (){

        return String.format("Name: %s \nMartrikelnummer: %d \nJahrgang: %d\n\n", getName(), getMartrikelnummer(), getJahrgang());
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMartrikelnummer() {

        return martrikelnummer;
    }

    public void setMartrikelnummer(int martrikelnummer) {

        this.martrikelnummer = martrikelnummer;
    }

    public int getJahrgang() {

        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {

        this.jahrgang = jahrgang;
    }
}