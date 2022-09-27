public class Main {

    public static void main(String[] args) {

        Person p1 = new Person ("Mike", "Tyson");
        Person p2 = new Person("Saad","Masood");

        Person[] names = new Person [2];

        names[0] = p1;
        names[1] = p2;

        PersonHandler ppl = new PersonHandler(names);

        System.out.println(ppl.forLoop());
        System.out.println(ppl.whileLoop());
        System.out.println(ppl.forEachLoop());



    }








}
