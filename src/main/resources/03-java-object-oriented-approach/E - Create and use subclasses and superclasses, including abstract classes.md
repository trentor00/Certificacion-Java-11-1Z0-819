# 03 - Java Object-Oriented Approach
## E - Create and use subclasses and superclasses, including abstract classes

### Herencia
Todas las clases heredan Object, ya sea de forma directa o indirecta. Si una clase no hereda nada, el compilador la hace heredar de Object.
Por tanto, todas las clases disponen de los métodos de Object que son:
* toString()
* equals()
* hashCode()

No existe la herencia múltiple. Los miembros privados no son accesibles por la clase hija. Para evitar que una clase sea heredada,
se puede utilizar "final".

#### Constructores en Herencia
Toda clase incluye de forma implícita en sus constructores, como primera línea, la instrucción super(); que lo que hace es llamar
al constructor sin parámetros de la super clase. Ojo que esté definido ya que sino habrá un error de compilación.

Si se especifica como primera línea this a otro constructor, entonces no se añade esa llamada a super() de forma automática.
No puede haber this() y super() a la vez, ya que siempre han de ser la primera línea.

### Sobreescritura de métodos
Las reglas de la sobreescritura son:
* El nombre y la lista de parámetros debe ser idéntica.
* El ámbito debe ser igual o menos restrictivo.
* El tipo de devolución debe ser igual o un subtipo del original.
* No puede propagar excepciones que no estén definidas en el método superior. No afecta a Runtime.

### Asignaciones
Se puede asignar una referencia a un objeto del objeto de un tipo en una variable del tipo de la superclase. Ejemplo:
```
Object obj = new Integer(1);
```
#### Llamadas a métodos
Con la referencia anterior, sólo se pueden llamar a métodos del objeto, pero sólo a aquellos  que han sido heredados o sobreescritos.
Por tanto, no se pueden llamar a métodos propios de Integer.

#### Casting
Se puede volver a recuperar el tipo original haciendo un casting. Ejemplo:
```
Integer in = (Integer) obj;
```
Ojo que el compilar permite hacer casting a cualquier subclase del tipo de objeto, pero si el tipo guardado no coincide, 
habrá una excepción de ClassCastException. Ejemplo:
```
Long l = (Long) obj;
```

### Clases Abstractas
Utilizan la palabra reservada "abstract", tanto la clase como los métodos que lo sean. 

