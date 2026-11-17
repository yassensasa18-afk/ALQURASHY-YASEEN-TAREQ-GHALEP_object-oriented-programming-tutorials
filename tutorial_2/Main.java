public class Main {

    public static void main(String[] args) {

        Person p0 = new Person("Ahmad", "P001");
        Person p1 = new Student("Yaseen", "S001");
        Person p2 = new Lecturer("Nazmirul", "L001");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }

}
