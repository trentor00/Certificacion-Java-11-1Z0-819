# 01 - Working with Java data types
## A - Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
### Identificadores
* Se puede usar como identificador cualquier combinación de letras, números, $ y _
* No puede empezar por número
### Literales numéricos
* **Octal**: Empieza por '0'
* **Hexadecimal**: Empieza por '0x'
* **Binario**: Empieza por '0b'

Se puede utilizar _ pero no al principio, final o junto al punto decimal.

Los literales enteros son int por defecto, para que sea long hay que poner la 'l' al final.

Los literales decimales son double por defecto, para que sea float hay que poner la f

### Conversiones
Todos los primitivos son convertibles entre si, excepto los booleanos.

#### Conversión implícita
El tipo de destino ha de ser de igual o mayor tamaño que el de origen. Hay dos excepciones:
* El tipo de origen es numérico y el de destino es char.
* El tipo de destino es entero y el origen es decimal.

### Wrappers
Encapsulan tipos primitivos como objetos. Tienen el mismo nombre que el primitivo pero con la inicial en mayúscula a
excepción de char que es Character. Son Inmutables.

#### Cómo se crean
Se pueden crear usando su propio constructor, por ejemplo:
```
Integer i = new Integer(100);
Integer i2 = new Integer("100");
 ```
pero su uso está desaconsejado porque al hacerlo de esa manera, perdemos características como la caché.


Por tanto, la manera correcta es a partir del método estático valueOf. Aquí todos los disponibles según la clase:
* `Boolean.valueOf(true)`
* `Byte.valueOf((byte) 1)`
* `Short.valueOf((short) 100)`
* `Integer.valueOf(100)`
* `Long.valueOf(100)`
* `Float.valueOf((float) 100)`
* `Double.valueOf(100.0)`
* `Character.valueOf('a')`
 
#### Pasar a primitivo
Para pasar un wrapper a primitivo se utiliza el método xxxValue(). Un ejemplo:
```
Integer iObjeto = Integer.valueOf(100);
int iPrimitivo = iObjeto.intValue();
```

#### Convertir de String a primitivo
Se utiliza el método estático parseXXX(""). Lista de ejemplos:
* `Boolean.parseBoolean("true")`
* `Byte.parseByte("1")`
* `Short.parseShort("100")`
* `Integer.parseInt("100")`
* `Long.parseLong("100")`
* `Float.parseFloat("100")`
* `Double.parseDouble("100")`

#### Convertir de String a Wrapper
* `Boolean.valueOf("true")`
* `Byte.valueOf("1")`
* `Short.valueOf("100")`
* `Integer.valueOf("100")`
* `Long.valueOf("100")`
* `Float.valueOf("100.1")`
* `Double.valueOf("100.1")`

#### Autoboxing
Es la conversión automática que hace Java entre un primitivo y su clase envoltorio.
Por ejemplo:
`Integer i = 100;`

#### Unboxing
Es justo la operación contraria a la anterior, es decir, la conversión automática entre una clase envoltorio y su primitivo. Ejemplo:
```
Integer iObjeto = Integer.valueOf(100);
int iPrimitivo = iObjeto;
```

### Operadores
Orden de precedencia según el operador:
* Post-unary operators (expression++, expression--)
* Pre-unary operators (++expression, --expression)
* Other unary operators (-,!,~,+,-, (type))
* Multiplicación/División/Módulo (*,/,%)
* Suma/Resta (+,-)
* Shift operators (<<, >>, >>>)
* Relacionales (<,>,<=, >=, instanceof)
* Igualdad (==, !=)
* Lógicos (&, ^,|)
* Lógicos cortocircuitos (&&, ||)
* Ternarios (?:)
* Asignación (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)

#### Promoción numérica
1. Si dos valores tienen diferente tipo, Java promocionará el valor más pequeño al tipo del más grande.
2. Si uno de los valores es entero y el otro es decimal, Java promocionará el entero al tipo del decimal.
3. Tipos pequeños como byte, short y char, primero se promocionarán siempre a int aunque los dos sean del mismo tipo.
4. Por último, el resultado devuelto será el del tipo promocionado.

Ojo que la regla número 3 no aplica a los operadores unarios.