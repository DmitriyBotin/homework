package ITFB_lesson1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat2 = new Cat("Murzik", "Black", 4);
        Cat cat = new Cat("Barsik", "White", 2);

        cat.setName("A");
        System.out.println(cat.getName());


        cat.info();
        cat2.info();

    }
}

