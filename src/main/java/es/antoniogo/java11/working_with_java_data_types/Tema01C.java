package es.antoniogo.java11.working_with_java_data_types;

public class Tema01C {
    public static void main(String[] args) {
        inference();
    }

    private static void inference() {
        var i = 100; //Aquí el tipo es int
        var d = Double.valueOf("100.1") ; // Aquí el tipo es Double

        //var n = null; //No se puede asignar null ya que no se puede inferir el tipo
        //var a=100, b=100; //No se puede usar en asignación multiple, aunque tenga valor como es el caso

        //var a = {1,2,3}; //No se puede utilizar en la inicialización corta de arrays
        var a = new int[]{1,2,3 }; //Correcto
    }
}
