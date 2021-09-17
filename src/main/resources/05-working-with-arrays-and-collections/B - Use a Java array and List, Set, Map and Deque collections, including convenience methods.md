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

