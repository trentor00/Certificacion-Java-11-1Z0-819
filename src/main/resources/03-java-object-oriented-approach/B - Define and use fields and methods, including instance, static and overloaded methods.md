# 03 - Java Object-Oriented Approach
## B - Define and use fields and methods, including instance, static and overloaded methods

### Sobrecarga de métodos
Una clase puede contener varios métodos con el mismo nombre, pero tienen que tener un número o tipo de parámetros diferente.
Ojo que esto no es una sobre escritura.

#### Orden de elección de métodos posibles
1. Coincidencia exacta
2. Promoción de tipos
3. Autoboxing

Si hay ambigüedad, se dará un error de compilación.

#### Paso de parámetros
En Java, el paso por parámetros se hace por copia. Cuando se pasan primitivos, se copia el valor del dato, mientras que si se pasan
objetos, se copia la referencia del objeto.

#### Métodos estáticos
En su propia clase, sólo puede llamar a miembros que también sean static.

#### Atributos estáticos
Se comparten por todas las instancias de esa clase.

#### Bloques estáticos
Sólo se ejecutan una vez durante toda la vida de una clase.
