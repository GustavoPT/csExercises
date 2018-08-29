package com.company.Random;


class OuterDemo{
    int num;

    private class InnerDemo{
        public void print()
        {
            System.out.println("This is an inner class");
        }
    }

    void display_inner()
    {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }

}

abstract class AnonymousInner {
    public abstract void mymethod();
}


public class Main {

    public static void main(String[] args) {



    }
}
