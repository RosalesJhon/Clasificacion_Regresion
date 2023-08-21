public class Clasificacion {

    public static void main(String[] args) {
        // Datos: Horas de estudio y resultado del examen (1 = aprobado, 0 = reprobado)
        double[][] datos = {{2.5, 1}, {1.5, 0}, {3.0, 1}, {0.5, 0}};

        // Parámetros del modelo de Regresión Logística (coeficientes)
        double[] coeficientes = {1.0, -2.0}; // Valores iniciales

        // datos a predecir
        double horasEstudioNuevo = 2.0;
        
        // Calcular la puntuación del modelo
        double puntuacion = coeficientes[0] + coeficientes[1] * horasEstudioNuevo;

        // Aplicar la función sigmoide para obtener la probabilidad
        double probabilidad = 1 / (1 + Math.exp(-puntuacion));

        // Clasificación: Si la probabilidad es mayor o igual a 0.5 se considera aprobado; de lo contrario reprobado
        int resultadoPredicho = (probabilidad >= 0.5) ? 1 : 0;

        System.out.println("Resultado predicho: " + resultadoPredicho);
    }
}
