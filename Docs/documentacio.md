# Documentacion sobre el programa UD5P1

Aqui se les ve a explicar como funciona por dentro el codigo y el funcionamiento de las clases y objetos que hay.

## Clases 

Las clases en este programa se divien entre 4, main, herramientas, menu y restaurante. De las cuales empezaremos con herramientas siendo la mas indispensable.

#### Herramientas

Dentro de esta clase que se divide entre 5 objetos, primeramente se constituye de tres importaciones de java que son javax.swing.*, java.util.ArrayList y java.util.Scanner. Estas importaciones sirven en orden para la creacion de los JOptionPane, para los ArrayList y el Scanner. Las clases son las siguientes: Primero la de "añadirRestaurante" que como su nombre indica sirve la introduccion de los restaurante en el arraylist, que se inicializa para despues con un constructor ir llamando a cada uno de los datos requeridos para añadir al completo un restaurante, por ultimo en añadir tenemos una excepcion que su funcion es para cuando en los datos de tipo int y float no se le puedan añadir una cadena de texto y salte un mensaje de error. De segundo tenemos el objeto de "mostrarRestaurante" que con un bucle fori, recorre el arraylist para que muestre despues de manera ordenada todos los nombres introducidos con el metodo anterior de añadir. Tercero tenemos el metodo de "eliminarRestaurantes" que primero se inicia con un bucle fori para mostrar todos los nombres de los restaurantes nuevamente para despues con un bucle foreach y condiciones de introducir un nombre de algun restaurante y que coincida con alguno ya creado en su arraylist se permita ser eliminado si coincide, si no llega a coincidir saltar un mensaje de error diciendo que no existe tal nombre y si se elimina correctamente mostrara otro mensaje diciendo que si se ha eliminado. De cuarta tenemos la clase de "editarRestautante", que lo que primero nos muestra es una opcion para introducir algun nombre de los restaurantes ya creados, asi medienta un bucle foreach y que el nombre seleccionado sea igual al nombre que este en el arraylist daria paso al siguiente metodo. Por ultimo el metodo "opcionEdicionRestaurante" el cual es llamado en el metodo anterior para dar a enseñer un segundo menu para seleccionar el dato a modificar del restaurante deseado, lo primero que se hace es un switch con varios caso que los cuales cada uno sirve para modificar cada dato posible del restaurante, dependiendo de la opcion que se elija en el switch se ultilizar los setters especificos para cada uno de los datos. 

#### Restaurante

Dentro de esta clase lo que tenemos en esta clase seria los atributos del programa los cuales serian los datos a introducir en los restaurante, despues tenemos al constructor para utilizar los getter y setters en otras clases y por los primos set y get de cada uno de los atributos.

#### Menu

En esta clase menu lo que tendriamos es que son dos metodos los cuales el primero llamado "mostrarMenu" realiza en un bucle while un menu con JOptionpane para la utilizacion de cada uno de los metedos de la clase Herramientas y su llamado, despues tenemos un switch para la eleccion de los metedos anteriores asi del caso 1 al 4 se van llamando a cada uno de esos metodos, tenemos el caso 5 o mas bien el Q que cierra el programa por completo. Por ultimo tenemos el metodo "menuEdicion" que crea un menu para el metodo de "editarRestaurante" de la clase Herramientas.

#### Main

Por ultimo y no menos importante la clase ejecutable main que se constituye por una sola linea llamando al metodo "mostratMenu" de la clase Menu. Ejecutando el programa dando asi el inicio de ello.

Giovanni Latella 1ºDAM 