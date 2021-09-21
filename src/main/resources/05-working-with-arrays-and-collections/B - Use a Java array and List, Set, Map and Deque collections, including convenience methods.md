# 05 - Working with Arrays and Collections
## B - Use a Java array and List, Set, Map and Deque collections, including convenience methods

### Array
Una vez se define su tamaño, no se puede modificar. En la declaración, no se puede indicar el tamaño. El valor por defecto es null.

Cada posición del array, se inicializa con el valor por defecto del tipo. Se crean así:
```
int i[] = new int[10];
```
Se puede declarar, instanciar e inicializar un array en una misma instruccion:
```
int []i = new int[]{1,2,3}
int i[] = {1,2,3}
```
Los arrays tienen una propiedad length, ojo que no es un método sino un atributo. Ejemplo:
```
int tamaño = i.length;
```

#### Arrays irregulares
Se pueden dejar las últimas dimensiones sin asignar tamaño. Pero ojo con no dejar intermedias sin asignar. Ejemplo:
```
int i[][] = new int[2][];
```
Posteriormente se puede inicializar la segunda dimensión:
```
i[1]= new int[4];
```
No se puede asignar un array de int a un array de long. Ojo que aquí no hay castings ya que son objetos.

La forma abreviada no se puede utilizar para crear arrays de forma pospuesta. Ejemplo no correcto:
```
int [][] i = new int[2][];
i[0]=new int[]{1,2,3}; //Esto es correcto
i[0]={1,2,3}; //Esto es incorrecto
```
### Lists
* Se ordenan por orden de entrada.
* Implementan la interfaz List, y esta, a su vez, Collections.
* Son clases genéricas.
* La clase principal de List es ArrayList

#### Formas de crear una lista
* Instancias de ArrayList
```
List<Integer> numeros = new ArrayList<>();
```
* A partir del método asList de Arrays
```
List<Integer> numeros = Arrays.asList(3,54,7,5);
```
Detalle importante es que es de tamaño genérico y no se pueden ni añadir ni eliminar elementos.

* A partir del método of() de List
```
List<Integer> numeros = List.of(3,5,7);
```
Ojo que es inmutable,y no se permite ni la eliminación, ni la modificación, ni inserción. Además tampoco se pueden poner nulls.
Así que por ejemplo, no se puede ordenar.

* A partir del método copyOf() de List
```
List<Integer> numeros2 = List.copyOf(numeros);
```
Pasa lo mismo que con el caso anterior.

#### Métodos de List
##### add()
Añade un elemento a la lista y lo pone al final de la misma. En el caso de indicar posición, se mueven los elementos hacia atrás.
Las firmas del método son:
```
boolean add(T param);
boolean add(int pos, T param);
```
Si la posición no existe, se dará una excepción.

##### set
Sustituye el elemento existente en la posición por el nuevo. Lo que se devuelve es el anterior. 
La firma del método:
```
T set(int pos, T param);
```

##### size
Devuelve el tamaño de la lista.
La firma del método:
```
int size();
```

##### get
Devuelve el elemento de la posición. Ojo que si se sale del rango, habrá excepción.
La firma del método:
```
T get(int pos);
```

##### remove
Hay dos métodos, el primero elimina el elemento de la posición indicada y si la posición no existe, dará error.
El segundo, en caso de no existir el elemento pasado por parámetro, dará false. Si hay más de uno, sólo quita el primero.
Las firmas son:
```
T remove(int pos);
boolean remove(Object ob);
```

### Maps
* Cada elemento tiene una clave única asociada.
* No tienen orden
* Implementan la interfaz Map
* Son clases genéricas
* La clase principal de Map es HashMap

#### Formas de crear un Map
* Instancias de HashMap
```
Map<Intenger, String> map = new HashMap<>();
```

* A partir del método ofEntries() de Map
```
Map<Integer, String> map = Map.ofEntries(
    Map.entry(1, "Gavà"),
    Map.entry(2, "Viladecans")
);
```
Ojo que es inmutable, y no se permite ni la eliminación, ni la modificación, ni inserción. Además tampoco se pueden poner nulls.

* A partir del método copyOf de Map
```
Map<Integer, String> map2 = Map.copyOf(map);
```
Pasa lo mismo que con el caso anterior.

#### Métodos de Map
##### put
Sirve para añadir elementos a la colección. Si ya existe la clave, al sustituye. La firma es:
```
T put(K clave, T dato);
```
Ojo que se permiten claves null

##### putIfAbsent
Sólo la añade si no existe o si existe pero es null la clave. La firma es:
```
T putIfAbsent(K clave, T dato);
```

##### get
Devuelve el dato de la clave. Si no hay, devuelve null. La firma es:
```
T get(K clave)
```

##### size
Devuelve el tamaño del map.
La firma del método:
```
int size();
```

##### remove
Elimina el dato que tiene la clave asociada y devuelve el elemento que se elimina. La firma es:
```
T remove(Object clave);
```

##### containsKey
Indica si hay un elemento con esa clave asociada. La firma es:
```
boolean containsKey(K clave);
```

##### containsValue
Indica si el elemento está en el Map. La firma es:
```
boolean containsValue(T valor);
```

### Sets
* Los elementos no tienen posición ni clave. Los elementos no se pueden repetir.
* Se utiliza el método equals y hashcode para determinar la igualdad
* Implementan la interfaz Set
* Son clases genéricas
* La clase principal es HashSet

#### Formas de crear un Set
* Instancias de HashSet
```
Set<Srtring> sets = new HashSet<>();
```

* A partir del método of() de Set:
```
Set<String> sets = Set.of("A", "B");
```
Ojo que es inmutable, y no se permite ni la eliminación, ni la modificación, ni la inserción. Además, tampoco se pueden poner nulls.

* A partir del método copyOf de Set
```
Set<String> nuevo = Set.copyOf(sets);
```
Pasa lo mismo que con el anterior.

#### Métodos de Set
##### add
Sirve para añadir elementos al conjunto. Si ya existe, no lo añade. La firma es:
```
boolean add(T dato);
```
Devuelve true si lo ha podido añadir.

##### remove
Elimina el elemento si existe en la colección. La firma del método es:
```
boolean remove(T dato);
```

##### size
Devuelve el tamaño del conjunto. La firma del método es:
```
int size();
```

##### contains
Devuelve true si existe el elemento en el conjunto. La firma es:
```
boolean contains(Object obj);
```

### Deque
* Se pueden añadir elementos por ambos extremos.
* Implementa la interfaz Deque, que a su vez hereda de Queue.
* Son clases genéricas.
* La clase principal es ArrayDeque

#### Formas de crear un Deque
No hay métodos de factoría.
```
Deque<String> deque = new ArrayDeque<>();
Deque<String> deque = new LinkedList<>();
```

#### Métodos de Deque
##### add
Añade el dato al final, por tanto se comporta como una cola. La firma es:
```
boolean add(T dato);
```

##### push
Añade el dato al principio, por tanto se comporta como una pila. La firma es:
```
boolean push(T dato);
```

##### poll
Extrae y elimina el elemento de la cabecera. La firma es:
```
E poll();
```

##### remove
Hace lo mismo que poll. La firma es:
```
E remove();
```

##### peek
Devuelve el elemento de la cabecera sin eliminarlo. La firma es:
```
E peek();
```

##### element
Lo mismo que peek. La firma es:
```
E element();
```

##### size
Permite saber el tamaño. La firma es:
```
int size();
```

