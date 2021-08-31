package es.antoniogo.java11.controlling_program_flow;

/*
 * 01 - A: Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
 */
public class Tema01A {
    public static void main(String... args){
        literalesNumericos();
    }

    private static void literalesNumericos() {
        //Literales numéricos
        int octal = 011; //Los números octales empiezan por 0. En este caso es el número 9 en decimal.
        System.out.println("011 en octal es: "+octal);

        int hexadecimal = 0xB; //Los números hexadecimales empiezan por 0x. En este caso es el número 11 en decimal.
        System.out.println("0xB en hexadecimal es:"+hexadecimal);

        int binario = 0b11; //Los números binarios empiezan por 0b. En este caso es el número 3 en decimal.
        System.out.println("0x11 en hexadecimal es:"+binario);
    }
}
