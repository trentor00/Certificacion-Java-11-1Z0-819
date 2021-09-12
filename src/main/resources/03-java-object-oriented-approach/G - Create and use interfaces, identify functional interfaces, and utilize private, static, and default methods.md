# 03 - Java Object-Oriented Approach
## G - Create and use interfaces, identify functional interfaces, and utilize private, static, and default methods
### Interfaz
Una interfaz es un conjunto de métodos abstractos. También puede incluir constantes, que serán públicas y estáticas.
Cómo los métodos de una interfaz, sólo pueden ser públicos y abstractos, se pueden omitir las palabras abstract y public.
En el caso de las constantes, también se puede omitir public, final y static.

#### Novedades de Java 8 y 9
Se puede implementar una implementación por defecto. Para ello, se define el método con default.

Se pueden añadir métodos estáticos, pero ojo, este método está asociado a la interfaz y no se hereda a las clases que implementan la interfaz.

Se pueden añadir métodos privados, que sirven para ser utilizados desde métodos defaults. Pueden ser también static.

#### Polimorfismo con interfaces
Funciona de la misma manera que con las clases.

#### Problema de herencia múltiple
Si una clase implementa dos interfaces con el mismo método default, está obligada  a sobreescribirlo.

### Interfaz funcional
Es un concepto que define que una interfaz sólo tiene un único método abstracto.

La gracia de esto, es que se pueden crear implementaciones a través de expresiones lambdas.

Ojo que los métodos abstractos que coinciden con los métodos heredados de Object, no se tienen en cuenta de cara a saber si 
es funcional o no.
