# 03 - Java Object-Oriented Approach
## H - Create and use enumerations

### Enumeraciones
Es un tipo de dato con una lista de posibles resultados. Se define así:
```
public enum Mes {
ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
}
```

En los enums, se puede usar el == para comparar.

Pueden tener constructores, pero por defecto, sólo pueden ser private (no hace falta ponerlo). Suelen utilizarse para añadir un valor a cada valor de los valores del enum. Ejemplo:
```
enum Mes {
    ENERO(1), FEBRERO(2), MARZO(3);
    int data;
    Mes(int n) {
        data = n
    }
}
```
Las enumeraciones son una subclase de java.lang.Enum y, esta, proporciona estos métodos:
* values(): Devuelve un array con los valores de la enumeración
* name(): el nombre del valor
* ordinal(): posición del valor dentro de la enumeración.
* toString(): Lo mismo que name()