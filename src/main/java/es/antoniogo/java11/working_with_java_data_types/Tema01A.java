package es.antoniogo.java11.working_with_java_data_types;

/*
 * 01 - A: Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
 */
public class Tema01A {
    public static void main(String... args){
        literalesNumericos();
        conversionesImplicitas();
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

    private static void conversionesImplicitas() {
        byte b = 1;
        short s = b; //Conversión implícita de byte a short
        int i = s; //Conversión implícita de short a int
        long l = i; //Conversión implícita de int a long

        float f = l; //Conversión implícita de long a float.
        // Este caso es curioso, porque aunque el tamaño en bytes de un long son 64 y el de float son 32,
        // se puede hacer porque se pierde precisión pero no magnitud. Ejemplo:
        long longLargo = Long.MAX_VALUE;
        float floatDelLongLargo = longLargo;
        System.out.println("Long largo: "+longLargo);
        System.out.println("Float del long largo: "+floatDelLongLargo);

        double d = f; //Conversión implícita de float a double

        //char c = i; //No se puede pasar de un número a char.
        //int i2 = f; //No se puede pasar de un decimal a un entero con conversión

    }
}
