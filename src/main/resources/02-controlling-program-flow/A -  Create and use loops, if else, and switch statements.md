# 02 - Controlling Program Flow
## A - Create and use loops, if/else, and switch statements
### Switch
Los tipos permitidos son los siguientes:
* int e Integer
* byte y Byte
* short y Short
* char y Character
* String
* enum values
* var (si el tipo que se resuelve es uno de los anteriores)

Los valores aceptados para los 'case' han de ser valores constantes en tiempo de compilación. Por tanto, sólo se pueden
usar literales, constantes enum o variables constantes finales que sean del mismo tipo de dato. Constante final quiere decir 
que la variable ha de tener el modificador de final, pero además, ha de ser inicializada con un valor literal en la misma expresión. 
No puede ser un valor obtenido de un método.

### For
Las variables de la sección de inicialización han de ser obligatoriamente todas del mismo tipo.

### For-Each
Los tipos de objeto permitidos en este for son:
* array
* Objeto que implemente Iterable.

