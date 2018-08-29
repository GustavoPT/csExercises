package Programs.libgdxcourse;

import java.util.*;
public class Overload {

    private static class Enemy
    {
        private int health;
        private String weapon;

        public Enemy(int health,String weapon)
        {
            this.health = health;
            this.weapon = weapon;
            System.out.println("Enemy constructor called");
        }

        public int getHealth(){ return health;}
        public void setHealth(int health){ this.health = health; }
        public String getWeapon() { return weapon;}
        public void setWeapon(String weapon) {this.weapon = weapon;}
        public void attack() {System.out.println("attacking with :" + weapon);}

    }

    private static class Pikeman extends Enemy
    {
        private int armor;

        public Pikeman(int health,int armor)
        {
            super(health,"pike");
            this.armor = armor;
            System.out.println("pikeman constructor called");
        }
    }

    private static class Archer extends Enemy
    {
        public int arrowCount;

        public Archer(int health,int arrowCount)
        {
            super(health,"bow");
            this.arrowCount = arrowCount;
            System.out.println("Another constructor called");
        }

        public int getArrowCount(){ return this.arrowCount;}
        public void setArrowCount(int arrowCount) {this.arrowCount = arrowCount;}
        @Override
        public void attack()
        {
            if(arrowCount <= 0) {
                System.out.println("No more arrows");
            } else{
                super.attack();
                arrowCount--;
                System.out.println("arrows left = "+ arrowCount);
            }
        }
    }

    interface Healable
    {
        void heal(int amount);

    }

    class Pistolero extends Enemy implements Healable{
        private int bulletCount = 0;

        public Pistolero(int health)
        {
            super(health,"pistol");
        }

//        @Override
//        public void attack(Enemy enemy)
//        {
//            if(bulletCount >= 0)
//            {
//
//            }
//        }
        public void heal(int amount)
        {

        }
    }

    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("jimmy");
        names.add("anthony");

        for(String name:names)
        {
            System.out.println("name = " + name + " uppercase= " + name.toUpperCase());
        }

        Scanner in = new Scanner(System.in);

        Enemy pikeman = new Pikeman(100,100);
        pikeman.attack();

        Archer archer = new Archer(100,0);
        archer.attack();

    }

    private static int subtract(int a, int b)
    {
        return a - b;
    }
    private static int subtract(int a, int b, int c)
    {
        return a - b - c;
    }

    private static int mul(int a, int b)
    {
        return a * b;
    }

    private static float mul(float a,float b)
    {
        return a * b;
    }
}