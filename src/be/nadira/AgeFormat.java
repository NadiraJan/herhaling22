package be.nadira;

public class AgeFormat {
    public static void main(String[] args) {
        int age = 2;
       // System.out.println("age is " + age +" years old");
        String AGE_AS_STRING = Integer.toString(age);
        System.out.println(AGE_AS_STRING.getClass().getSimpleName());
        System.out.println(((Object) age).getClass().getSimpleName());
    }
}
