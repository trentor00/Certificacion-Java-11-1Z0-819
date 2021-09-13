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
