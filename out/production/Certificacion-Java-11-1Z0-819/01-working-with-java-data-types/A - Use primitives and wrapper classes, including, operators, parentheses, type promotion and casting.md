# 01 - Working with Java data types
## A - Use primitives and wrapper classes, including, operators, parentheses, type promotion and casting
### Identificadores
* Se puede usar como identificador cualquier combinación de letras, números, $ y _
* No puede empezar por número
### Literales numéricos
* **Octal**: Empieza por '0'
* **Hexadecimal**: Empieza por '0x'
* **Binario**: Empieza por '0b'

Se puede utilizar _ pero no al principio, final o junto al punto decimal.

Los literales enteros son int por defecto, para que sea long hay que poner la 'l' al final.

Los literales decimales son double por defecto, para que sea float hay que poner la f

### Conversiones
Todos los primitivos son convertibles entre si, excepto los booleanos.

#### Conversión implícita
El tipo de destino ha de ser de igual o mayor tamaño que el de origen. Hay dos excepciones:
* El tipo de origen es numérico y el de destino es char.
* El tipo de destino es entero y el origen es decimal.