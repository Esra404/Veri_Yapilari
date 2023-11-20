package VizeHazirlik.TekYonluBagliListe.usman;

public class Student {

    String name;
    String fname;

    int note;
    public Student(String name, String fname, int note) {
        this.name = name;
        this.fname = fname;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}
