package Programs.r1;

public class Main {

    static class Person {
        public String name = "tom";

        public void printName()
        {
            System.out.println(this.name);
        }
    }

    static class Student {

    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Person p1 = new Person();

        p1.printName();
    }
}

