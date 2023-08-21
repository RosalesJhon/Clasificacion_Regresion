public class Regresion {

    public static void main(String[] args) {
        // Datos: Tamaño de la casa y precio
        double[][] datos = {{1400, 245000}, {1600, 312000}, {1800, 279000}, {1200, 308000}};

        // modelo de Regresión
        double interseccion = 50000; // Valor inicial
        double pendiente = 150; // Valor inicial

        //datos a predecir
        double tamanoCasaNuevo = 1500;
        
        // Realizar la predicción del precio
        double precioPredicho = interseccion + pendiente * tamanoCasaNuevo;

        System.out.println("Precio de la casa predicho: $" + precioPredicho);
    }
}
