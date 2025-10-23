//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //--------Ejercicio 1:
        System.out.println("------Ejercicio 1------");
        String titulo = "El Resplandor";  // Le añadimos un título a nuestro libro, utilizaremos un "String" para ello.
        String autor = "Stephen King";    // Hacemos lo mismo para añadir el autor del libro.
        int numPaginas= 688;              // Para implantar el número de páginas, lo haremos con un "int" ya que es un número entero.
        mostrarLibro(titulo,autor,numPaginas);   // Llamamos y definimos los valores de los parámetros.

        //--------Ejercicio 2:
        System.out.println("------Ejercicio 2------");
        System.out.println(duracionMediaCanciones(120,182,240));  //Imprimimos la función "duracionMediaCanciones" junto con los parámetros que le he establecido.



        //--------Ejercicio 3:
        System.out.println("------Ejercicio 3------");
        System.out.println(tiempoRestanteAlquiler(20, 40)); //Imprimimos la función "tiempoRestanteAlquiler" junto con los parámetros que le he establecido.



        //--------Ejercicio 4:
        System.out.println("------Ejercicio 4------");
        calcularImpuestoYDescuento(80,21,50);   //Imprimimos la función "calcularImpuestoYDescuento" junto con los parámetros que le he establecido.



        //--------Ejercicio 5:
        System.out.println("------Ejercicio 5------");
        System.out.println(porcentajeVideojuegos(20, 50));  //Imprimimos la función "porcentajeVideojuegos" junto con los parámetros que le he establecido.
    }


    static void mostrarLibro(String titulo, String autor, int numPaginas){  //Definimos la función para que contenga estos elementos.
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);     // En este punto imprimimos lo recopilado para que salga por consola.
        System.out.println("Número de páginas: " + numPaginas);

    }



    static double duracionMediaCanciones(int segCancion1, int segCancion2, int segCancion3){  //Definimos la función con los elementos requeridos por el enunciado.
        double media = (double) (segCancion1 + segCancion2 + segCancion3) /3;  //Hacemos la fórmula matemática de sumar todos los segundos de las 3 distintas canciones para luego dividirlo entre el número de canciones totales(3), para que salga la media de segundos en total. Usamos "Double" porque va a dar decimales.
        return media; //Queremos que la función nos devuelva en consola el resultado de las operaciones realizadas, por lo que le aplicamos el "return".
    }



    static int tiempoRestanteAlquiler(int semanasTotales, int diasTrascurridos){  //Definimos la función con dichos elementos anunciados en el texto.
        int diasTotales = semanasTotales * 7;  //Realizamos la fórmula matemática para pasar las semanas a días, por lo que multiplicaremos el número de semanas por 7.
        int tiempoRestante = diasTotales - diasTrascurridos; //Para conseguir el tiempo restante de alquiler, restaremos al número de días totales que tenemos, el número de días que ya han transcurrido.
        return tiempoRestante; // Y como queremos que la función nos devuelva en consola el resultado de todas las operaciones, usaremos el "return".

    }


    static void calcularImpuestoYDescuento(double precio, int impuesto, int descuento){ //Definimos la función con elementos requeridos en el enunciado.
        double precioConImpuesto =  precio + (precio * impuesto / 100.0);  //Hacemos la fórmula matemática para conseguir el precio con el impuesto ya sumado, para ello le sumaremos  al precio original, el precio de base multiplicado por el impuesto cuyo  resultado se dividirá entre 100 antes de sumárselo al precio original. Usaremos "double" porque nos dará números decimales.
        double precioConDescuento = precioConImpuesto - (precioConImpuesto * descuento / 100.0);  //Para obtener el precio con el descuento incluido, deberemos restarle al precio con el impuesto incluido, el precio con impuesto multiplicado por el descuento aplicado y a su vez dividido entre 100. Usaremos "double" porque nos dará números decimales.
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("Con impuesto: " + precioConImpuesto + "€");        //En este proceso imprimimos toda la recopilación para que salga impresa por consola.
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Con descuento: " + precioConDescuento + "€");
    }


    static double porcentajeVideojuegos(int numeroJuegos, int articulosTotales){ //Definimos la función con los elementos necesarios para realizar el enunciado.
        double porcentajeVideojuegosInventario = ((double) numeroJuegos / articulosTotales) * 100;  //Realizamos la operación matemática para obtener el porcentaje de videojuegos que hay en el inventario, para ello deberemos dividir al número de videojuegos, el total de artículos del inventario, y por último dividirlo entre 100. Usaremos "double" porque nos dará números decimales.
        return porcentajeVideojuegosInventario;  //Le decimos a la función que nos devuelva el resultado de las operación matemática hecha anteriormente.
    }
}



