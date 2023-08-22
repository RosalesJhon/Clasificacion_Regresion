// nodo de árbol binario
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class Preorden {
    // Función para realizar una travesía en preorden
    public static void travesiaPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Visitar el nodo actual
            travesiaPreorden(nodo.izquierdo);   // Recorrer el subárbol izquierdo
            travesiaPreorden(nodo.derecho);     // Recorrer el subárbol derecho
        }
    }

    public static void main(String[] args) {
        // Crear el árbol binario
        Nodo raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);
        raiz.izquierdo.izquierdo = new Nodo(4);
        raiz.izquierdo.derecho = new Nodo(5);

        // Realizar una travesía en preorden desde la raíz
        System.out.print("Travesía en Preorden: ");
        travesiaPreorden(raiz);
    }
}
