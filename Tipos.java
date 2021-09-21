import utils.Utils;

public class Tipos {
  
  public static void main(String[] args) {
  /* 
   * Estos son todos los 'tipos básicos' de Java, cada uno
   * esta pensado para almacenar una información distinta,
   * y ocupa un espacio en memoria distinto.
   * Los que más vais a utilizar son:
   *  - int
   *  - double
   *  - boolean
   */ 
    
    byte mini_entero = 127;                 // Su gato 
    short enterito = 32767;                 // Tú   
    int entero = 0x7FFFFFFF;                // Su padre
    long gran_entero = 0x7FFFFFFFFFFFFFFFl; // Su ex
    float decimal32 = 23.48902f;            // Su profesor de mates
    double decimal64 = 9293.39358018391212; // O.o
    boolean si_o_no = true;                 // ¿Te tienes que preocupar?
    char letra = 'a';                       // ¡Comillas simples!
    
  /*
   * Ahora vamos a imprimir los valores por consola y descubrir
   * que es lo que hace a estos tipos tan distintos.
   * 
   * Para esta parte vamos a juegar un juego. 
   * ¿Qué aparecerá en consola?
   */
    
    // 1. Le pasamos un número directamente.
    System.out.println(34);
    Utils.pause();
    // 2. Le pasasmos la variable 'mini_entero'.
    System.out.println(mini_entero);
    Utils.pause();
    // 3. Le pasamos la variable 'entero'.
    System.out.println(entero);
    Utils.pause();
    // 4. Le sumamos uno a 'mini_entero'.
    mini_entero += 1;
    System.out.println(mini_entero);
    Utils.pause();
    // 5. Le pasamos la variable 'decimal64'.
    System.out.println(decimal64);
    Utils.pause();
    // 6. Le pasamos la variable 'si_o_no' negada.
    System.out.println(!si_o_no);
    Utils.pause();
    // 7. Le pasasmos la variable 'letra'.
    System.out.println(letra);
    Utils.pause();
    // 8. Le pasasmos la variable 'letra' más uno.
    System.out.println(letra + 1);
    Utils.pause();
    // 9. Le pasasmos la variable 'letra' más uno convertida en un caracter.
    System.out.println((char)(letra + 1));
    Utils.pause();
    
  /*
   * Hay un 'tipo' más que vais a usar, pero es un poco raro. 
   * Son las cadenas de caracteres o Strings. Y su nombre se escribe con
   * la primera letra en mayusculas. Esto es raro, pero es porque no son un tipo básico,
   * son varios 'char's puestos uno detrás del otro y se comportan de forma distinta.
   * Esto lo vereis en Programación II. Por ahora, para almacenar frases, simplemente
   * cread Strings. ¡Con comillas dobles!
   */
    
    String saludo = "Hola, buenos días";
    System.out.println(saludo);
    
    /*
     * Os dejo unos ejemplos de operadores entre algunos tipos:
     */
    
    int suma = 3 + 5;
    int resta = 4 - 19;
    int producto = 4 * 8;
    double division = 56 / 6;
    int modulo = 68 % 5;
    
    /*
     * Y algunas cosas extra:
     */
    
    boolean menor_o_igual = 4 <= 5; // true
    boolean mayor = 1 > 6;          // false
    boolean distinto = 2 != 9;      // true
    
    suma += 13;
    resta -= 5;
    suma ++;
    resta --;
    
    byte flags = 7 & 120;
    byte flags2 = 7 | 120;
  }
}
