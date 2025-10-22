//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //--------Ejercicio 1:
        String titulo = "El Resplandor";
        String autor = "Stephen King";
        int numPaginas= 688;
        mostrarLibro(titulo,autor,numPaginas);

        //--------Ejercicio 2:
        System.out.println(duracionMediaCanciones(120,182,240));



        //--------Ejercicio 3:
        System.out.println(tiempoRestanteAlquiler(20, 40));



        //--------Ejercicio 4:
        calcularImpuestoYDescuento(80,21,50);



        //--------Ejercicio 5:
        System.out.println(porcentajeVideojuegos(20, 50));
    }


    static void mostrarLibro(String titulo, String autor, int numPaginas){
        System.out.println("------Ejercicio 1------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);

    }



    static double duracionMediaCanciones(int segCancion1, int segCancion2, int segCancion3){
        System.out.println("------Ejercicio 2------");
        double media = (double) (segCancion1 + segCancion2 + segCancion3) /3;
        return media;
    }



    static int tiempoRestanteAlquiler(int semanasTotales, int diasTrascurridos){
        System.out.println("------Ejercicio 3------");
        int diasTotales = semanasTotales * 7;
        int tiempoRestante = diasTotales - diasTrascurridos;
        return tiempoRestante;

    }


    static void calcularImpuestoYDescuento(double precio, int impuesto, int descuento){
        System.out.println("------Ejercicio 4------");
        double precioConImpuesto =  precio + (precio * impuesto / 100.0);
        double precioConDescuento = precioConImpuesto - (precioConImpuesto * descuento / 100.0);
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("Con impuesto: " + precioConImpuesto + "€");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Con descuento: " + precioConDescuento + "€");
    }


    static double porcentajeVideojuegos(int numeroJuegos, int articulosTotales){
        System.out.println("------Ejercicio 5------");
        double precioVideojuegosInventario = ((double) numeroJuegos / articulosTotales) * 100;
        return precioVideojuegosInventario;
    }
}



