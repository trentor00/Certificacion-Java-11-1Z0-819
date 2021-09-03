# 01 - Working with Java data types
## B - Handle text using String and StringBuilder classes
Son inmutables e implementan la interfaz CharSequence. Si se crean usando literales, internamente tienen una caché igual que las clases Wrapper.
###  Concatenación
Se utiliza el operador +. Hay que tener en cuenta la siguiente regla:
1. Si ambos operandos son numéricos, entonces + significa suma.
2. Si alguno de los operandos es String, + significa concatenación.
3. La expresión siempre se evalua de izquierda a derecha.

Ejemplos:
```
    System.out.println(1 + 2); //3
    System.out.println("a" + "b"); //ab
    System.out.println("a" + "1"); //a1
    System.out.println(1 + 2 + "a"); //3a
    System.out.println("a" + 1 + 2); //a12
```
### Métodos importantes de String
Un String es una secuencia de caracteres y la primera posición siempre es la 0.

#### length()
Devuelve el número de caracteres del String. La firma del método es:
`int length();`

#### charAt()
Permite devolver el carácter de una posición específica. La firma del método es: 
`char charAt(int index);`

Si se accede a una posición fuera del rango del String, entonces se devolverá la siguiente excepción:
```
java.lang.StringINdexOutOfBoundsExcepcion: String index out of range: 4
```
#### indexOf()
Busca la posición del caracter o String pasado por parámetro. También acepta la posición a partir de la que buscar. Las firmas son:
```
int indexOf(int ch);
int indexOf(int ch, int fromIndex);
int indexOf(String str);
int indexOf(String str, int fromIndex);
```
Como detalle importante, aunque el parámetro de ch es int, en realidad está hecho para que se pasen char.
Otro detalle importante es que si no se encuentra nada, no se devuelve una excepción sino que se devuelve -1.

#### substring()
