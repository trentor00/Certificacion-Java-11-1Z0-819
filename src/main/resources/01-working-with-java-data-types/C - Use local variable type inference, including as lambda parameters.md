# 01 - Working with Java data types
## C - Use local variable type inference, including as lambda parameters

### Inferencia de tipos
Es la declaración de variables locales sin indicar explícitamente el tipo. Para ello se utiliza la palabra var. Esto
no significa que no haya tipo, sino que este es inferido por el compilador a partir del valor asignado a la variable.
Ejemplos:
```
var i = 100; //Aquí el tipo es int
var d = Double.valueOf("100.1") // Aquí el tipo es Double
```
Detalles importes:
* Sólo se puede usar en variables locales
* Es obligatorio asignar explícitamente un valor a la variable
* No se puede asignar null
* No se puede utilizar en declaraciones multiples
* En arrays no puede utilizarse con iniciación abreviada:
  * `var a = {1,2,3 } //Incorrecto`
  * `var a = new int[]{1,2,3 } //Correcto`