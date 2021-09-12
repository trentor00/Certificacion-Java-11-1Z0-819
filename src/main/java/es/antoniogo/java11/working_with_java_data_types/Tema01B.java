package es.antoniogo.java11.working_with_java_data_types;

public class Tema01B {
    public static void main(String[] args) {
        concatenacion();
    }

    private static void concatenacion() {
        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); //ab
        System.out.println("a" + "1"); //a1
        System.out.println(1 + 2 + "a"); //3a
        System.out.println("a" + 1 + 2); //a12
    }
}