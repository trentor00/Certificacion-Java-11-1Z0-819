# 03 - Java Object-Oriented Approach
## A - Declare and instantiate Java objects including nested class objects, and explain objects' lifecycles (including creation, dereferencing by reassignment, and garbage collection)

### Clase anidada
Es una clase que está definida dentro de otra. Hay 4 tipos:
* Clase estándar
* Clase estática
* Clase local a método
* Clase anónima

#### Clase anidada estándar
Se define como un miembro más de otra clase. Ejemplo:
```
class Externa {
    class Interna {
    }
}
```
Para instanciar una clase interna se requiere de un objeto de la externa. Ejemplo:
```
Externa externa = new Externa();
Externa.Interna interna = externa.new Interna(); 
```
Una clase interna puede utilizar cualquier modificador de acceso.

#### Clase anidada estática
Se define como un miembro estático. Ejemplo:
```
class Externa {
    static class Interna {
    }
}
```
Para instanciar una clase estática interna no se requiere de un objeto de la externa. Ejemplo:
```
Externa.Interna interna = new Externa.Interna();
```
La clase estática interna, sólo puede acceder a otros miembros estáticos de la clase Externa.

#### Clase local a método
Se define dentro de un método de la clase externa. Ejemplo:
```
class Externa {
    void method() {
        class Interna{
        }
    }
}
```
Sólo se puede instanciar desde el interior del método y, además, no tiene acceso a otras variables locales del método, a no ser que sean finales o efectivamente finales.

#### Clase anónima
No tienen nombre. Heredan de una clase existente o implementan una interfaz. Se define al vuelo, en la misma instrucción de instanciación. Ejemplo:
```
Runnable rb = new Runnable() {
    public void run() {
    }
}
```