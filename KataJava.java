// Clase 1: El molde
class Personaje {
    
    // INSTRUCCIÓN 1: Encapsulamiento
    // PISTA: Oculta estos datos usando la palabra 'private' para que no sean modificados directamente desde afuera[cite: 1].
    /* COMPLETAR */ String nombre;
    /* COMPLETAR */ int nivel;

    // INSTRUCCIÓN 2: Constructor
    // PISTA: Es el bloque que da vida al objeto. Su regla de oro es que debe llamarse exactamente igual que la clase y no tiene tipo de retorno[cite: 1, 8].
    public /* COMPLETAR */(String nombre, int nivel) {
        
        // INSTRUCCIÓN 3: La palabra 'this'
        // PISTA: Usa 'this' para decirle a Java "el atributo de este objeto" y diferenciarlo del parámetro temporal que acabas de recibir[cite: 1].
        /* COMPLETAR */.nombre = nombre;
        
        if (nivel > 0) {
            this.nivel = nivel;
        } else {
            this.nivel = 1; 
        }
    }

    // Método de acceso para leer el dato de forma controlada
    public String getNombre() {
        return this.nombre;
    }
}

// Clase 2: La ejecución principal
public class KataJava {
    public static void main(String[] args) {
        
        // INSTRUCCIÓN 4: Creación del Objeto (Instanciación)
        // PISTA: Usa la palabra reservada 'new' para invocar al constructor, pasándole un nombre (String) y un nivel (int) como argumentos[cite: 1, 13].
        Personaje miHeroe = /* COMPLETAR */ Personaje("Zelda", 5);

        // Prueba final: Si todo está bien, esto imprimirá el nombre
        System.out.println("El personaje creado es: " + miHeroe.getNombre());
    }
}