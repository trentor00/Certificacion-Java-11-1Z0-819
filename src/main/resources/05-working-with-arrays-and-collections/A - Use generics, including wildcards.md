# 05 - Working with Arrays and Collections
## A - Use generics, including wildcards

### Genéricos
Cuando se define un parámetro de tipo genérico, se usa el comodín "?"

Se puede especificar que la clase solo admita objetos de un determinado subtipo o supertipo. 
Para subclase se usa extends, y para superclase se usa super.
Ejemplos:
```
class NuevaClase<T extends Number> {
}
class NuevaClase<T super Long> {
}
```
Esto también se puede utilizar para los parámetros de tipo genérico.

Ojo que se puede especificar el comodín "?" en el tipo que se define. Ejemplo:
```
NuevaClase<Number> var1 = new NuevaClase<Integer>(); //Error.
NuevaClase<Number> var2 = new NuevaClase<>(); //Correcto.
NuevaClase<?> var3 = new NuevaClase<Integer>(); //Correcto.
```

#### Métodos genéricos
Aunque una clase no sea genérica, puede incluir métodos que utilicen un tipo genérico.
Para ello, se ha de indicar el tipo así:
```
public <T> void metodo(T param){...}
public <T extends Number> void metodo(T param){...}
public <T> T metodo() {...}
```
