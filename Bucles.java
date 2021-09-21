import java.util.Iterator;

public class Bucles {
  
  /*
   * Por último vamos a ver como hacer muchas operaciones similares
   * sin tener que escribirlas una a una.
   * Este concepto se llama 'bucles'/'loops' y en Java hay 2-4 formas
   * de hacerlo, dependiendo de como lo veas.
   * En general, vais a oir dos palabras cuando os hablen de bucles:
   * 'for' y 'while'.
   * 
   * Vamos a empezar por 'while' que es en general un poco más fácil de
   * entender. Un bucle while, tiene una condición, es decir, una 
   * expresión que evalua a un valor boolean. Mientras ese valor boolean
   * sea True, se seguirá ejecutando, cuando pase a ser False, parará.
   * 
   * Veamos un ejemplo.
   */
  
  static String[] menu = {
      "Pipza",
      "Borgir",
      "Cola",
      "Crossan",
      "Leis",
      "Kofi"
  };
  
  public static int numero_a_pedir(String plato) {
    int i = 0;
    boolean found = false;
    while (!found) {
      found = plato == menu[i];
      ++i;
    }
    return --i;
  }
  
  /*
   * Hay otra alternatica llamada do/while, que siempre se ejecuta
   * por lo menos 1 vez antes de evaluar la condición.
   */
  public static void ejemplo_do_while() {
    int i = 1;
    do {
      System.out.println(i);
      i <<= 1;
    } while (i > 0);
  }
  
  /*
   * El otro tipo de bucle también tiene dos formas. 'for' y 'for/each'.
   * Veamos primero un 'for' normal.
   * 
   * For es un bucle muy util cuando sabemos de antemanto cuantas veces
   * va a ejecutarse el código. Entre parentesis tiene 3 expresiones:
   *  - La variable con la que vamos a contar.
   *  - La condición de parada.
   *  - La acción que hacer al final de cada vuelta.
   *  
   * Vamos a conseguir los primeros 50 terminos de la secuencia:
   * a(n) = 5n + 3 
   */
  
  public static void cinco_n_mas_tres() {
    for (int n = 1; n <= 50; ++n) {
      System.out.println(5 * n + 3); 
    }
  }
  
  /*
   * El bucle for/each se usa exclusivamente para recorrer una colección de
   * datos (como un array, por ejemplo), y (casi) siempre la vamos a recorrer entera.
   */
  
  public static void print_all_menu() {
    System.out.println("---EL MEMENÚ---"); 
    for (String item : menu) {
      System.out.println(item); 
    }
  }
  
  public static void main(String[] args) {
  }
  
}
