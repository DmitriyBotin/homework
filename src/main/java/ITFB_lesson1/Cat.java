package ITFB_lesson1;

public class Cat {
    //private default protected public
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    //32min

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void meow() {
        System.out.println(name + " meow");
    }

}
