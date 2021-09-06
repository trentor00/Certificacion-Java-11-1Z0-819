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
```
int length();
```

#### charAt()
Permite devolver el carácter de una posición específica. La firma del método es:
```
char charAt(int index);
```

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
Devuelve una subcadena a partir de los índices pasados por parámetro.
El primer parámetro indica desde donde empieza.
El segundo parámetro, que es opcional, indica donde se termina (no se incluye).
Si se indica 2,2 devuelve una cadena vacía y si se pasa, devuelve una excepción.
Las firmas son:
```
String substring(int beginIndex);
String substring(int beginIndex, int endIndex);
```

#### toLowerCase() y toUpperCase()
Sirven para poner en minúsculas y mayúsculas. Las firmas son:
```
String toLowerCase();
String toUpperCase();
```

#### equals() y equalsIgnoreCase()
Sirven para comparar si dos cadenas de caracteres son iguales o no. La primera es case sensitive y la segunda no. Las firmas son:
```
boolean equals(Object obj);
boolean equalsIgnoreCase(String str);
```
Como dato curioso, el parámetro de equals es Object porque es el método que se sobreescribe de él. 
Si se pasa cualquier cosa que no sea un String, dará falso.

#### startsWith() y endsWith()
Indican si la cadena tiene el prefijo o sufijo pasado por parámetro. Importante recordar que Java es CaseSensitive.
Las firmas son:
```
boolean startsWith(String prefix);
boolean endsWith(String suffix);
```

#### replace()
Reemplaza un carácter o cadena por otra. Hay un método para char y otro para CharSequence. Las firmas son:
```
String replace(char oldChar, char newChar);
String replace(CharSequence target, CharSequence replacement);
```

#### contains()
Indica si el String contiene o no la cadena pasada por parámetro. La firma es:
```
boolean contains(CharSequence charSeq);
```

#### trim(), strip(), stripLeading() y stripTrailing()
Sirven para eliminar los espacios en blanco del principio y/o del final. trim() y strip() son básicamente lo mismo
pero este último soporta Unicode. Espacio en blanco se considera, tanto los espacios como los saltos de línea o los tabulados.

El método stripLeading() lo hace sólo por la izquierda y, el método stripTrailing() lo hace sólo por la derecha. Las firmas son:
```
String strip();
String stripLeading();
String stripTrailing();
String trim();
```

#### intern()
Sirve para devolver el String del pool de Strings, en caso de no estar, lo añade.
```
String intern();
```

### StringBuilder
La principal diferencia con String es que sí que es mutable y la mayoría de métodos devuelven una referencia a si mismo para que sean encadenados.
Se pueden crear de 3 maneras:
```
new SringBuilder();
new StringBuilder("hola");
new StringBuilder(5);
```
El primero lo crea vacío, el segundo con el contenido del parámetro y el último, también lo crea vacío, pero le da pistas a Java
de cual va a ser el tamaño para temas de rendimiento.

### Métodos importes de StringBuilder
#### chartAt(), indexOf(), length() y substring()
Son exactamente igual que en String. Ojo que substring devuelve String y no StringBuilder.

#### append()
Sirve para añadir al final de la cadena lo pasado por parámetro. Una de las firmas es:
```
StringBuilder append(String str);
```
Aquí lo importante es que devuelve una referencia a si mismo, permitiendo el encadenamiento. Hay unos 10 métodos diferentes, uno más o menos para cada tipo de parámetro de entrada.

#### insert()
Es como el anterior pero se ha de indicar la posición donde se quiere añadir. Una de las firmas, ya que hay varias como antes:
```
StringBuilder insert(int offset, String str);
```

#### delete() y deleteCharAt()
Es el opuesto del insert. El segundo sólo borra el de la posición concreta. Las firmas son:
```
StringBuilder delete(int startIndex, int endIndex);
StringBuilder deleteCharAt(int index);
```
En el segundo, si se indica una posición fuera de rango, devuelve una excepción. En cambio, el delete, es mucho más flexible y no lo hace, 
entiendiendo que quieres indicar el final de la cadena.

#### replace()
Funciona diferente al método de String. Aquí primero hace un eliminar de las posiciones, y luego añade justo donde dejó de eliminar. La firma es:
```
StringBuilder replace(int startIndex, int endIndex, String newString);
```

#### reverse()
De la vuelta a la cadena. La firma es:
```
StringBuilder reverse();
```

#### toString()
Para convertir un StringBuilder en String. La firma es:
```
String toString();
```

### Igualdad
A diferencia de String, en StringBuilder no está sobreescrito el método equals, y por tanto funcionará sólo para comparar referencias.
Si se compara con un == un String y un StringBuilder, da un error de compilación.