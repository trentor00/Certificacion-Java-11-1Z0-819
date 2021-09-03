package es.antoniogo.java11.working_with_java_data_types;

/*
 * 01 - A: Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
 */
public class Tema01A {
    public static void main(String... args){
        literalesNumericos();
        conversionesImplicitas();
        wrappers();
        autoboxingUnboxing();
        ordenOperadores();
        promocionNumericaAlOperar();
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

    private static void wrappers() {
        //Creación de Wrappers desde primitivo
        Boolean wrapperBoolean = Boolean.valueOf(true);
        Byte wrapperByte = Byte.valueOf((byte) 1);
        Short wrapperShort = Short.valueOf((short) 100);
        Integer wrapperInteger = Integer.valueOf(100);
        Long wrapperLong = Long.valueOf(100);
        Float wrapperFloat = Float.valueOf((float) 100);
        Double wrapperDouble = Double.valueOf(100.0);
        Character wrapperCharacter = Character.valueOf('a');

        //Pasar wrappers a primitivo
        boolean primitiveBoolean = wrapperBoolean.booleanValue();
        byte primitiveByte = wrapperByte.byteValue();
        short primitiveShort = wrapperShort.shortValue();
        int primitiveInt = wrapperInteger.intValue();
        long primitiveLong = wrapperLong.longValue();
        float primitiveFloat = wrapperFloat.floatValue();
        double primitiveDouble = wrapperDouble.doubleValue();
        char primitiveChar = wrapperCharacter.charValue();

        //Convertir de String a primitivo
        primitiveBoolean = Boolean.parseBoolean("true");
        primitiveByte = Byte.parseByte("1");
        primitiveShort = Short.parseShort("100");
        primitiveInt = Integer.parseInt("100");
        primitiveLong = Long.parseLong("100");
        primitiveFloat = Float.parseFloat("100");
        primitiveDouble = Double.parseDouble("100");

        //Convertir de String a Wrapper
        wrapperBoolean = Boolean.valueOf("true");
        wrapperByte = Byte.valueOf("1");
        wrapperShort = Short.valueOf("100");
        wrapperInteger = Integer.valueOf("100");
        wrapperLong = Long.valueOf("100");
        wrapperFloat = Float.valueOf("100.1");
        wrapperDouble = Double.valueOf("100.1");

    }

    private static void autoboxingUnboxing() {
        //Autoboxing
        Boolean wrapperBoolean = true;
        Byte wrapperByte = (byte) 1;
        Short wrapperShort = (short) 100;
        Integer wrapperInteger = 100;
        Long wrapperLong = (long) 100;
        Float wrapperFloat = 100.0f;
        Double wrapperDouble = 100.0;
        Character wrapperCharacter = 'a';

        //Unboxing
        boolean primitiveBoolean = wrapperBoolean;
        byte primitiveByte = wrapperByte;
        short primitiveShort = wrapperShort;
        int primitiveInt = wrapperInteger;
        long primitiveLong = wrapperLong;
        float primitiveFloat = wrapperFloat;
        double primitiveDouble = wrapperDouble;
        char primitiveChar = wrapperCharacter;
    }

    private static void ordenOperadores() {
        int gato = 3;
        int perro = ++gato * 5 / gato--;
        System.out.println("gato is " + gato); //3
        System.out.println("perro is " + perro); //5
    }

    private static void promocionNumericaAlOperar() {
        short s1=1, s2=2;
        //short s3 = s1 + s2; //Esto no compila debido a la tercera regla, ya que se promocionan en int
        short s3 = (short) (s1 + s2); //De esta manera si funcionaría.
    }
}
