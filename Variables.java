
public class Variables {
  
  public static void main(String[] args) {
  /*
   * Java es un lenguaje "imperativo".
   * Esto quiere decir que en general cada linea es una instrucción
   * que le estamos dando al ordenador.
   * Para darle instrucciones necesitamos saber que palabras y simbolos
   * entiende Java y que hacen cada una de esas palabras.
   * Vamos a empezar con como usar números en un programa.  
   *
   * Para ver los resultados vamos a imprimir los valores por consola.
   * Para 'imprimir' usamos una funcion propia de Java:
   *    System.out.println()
   * Es rara, pero entenderemos un poco mejor porqué es así cuando
   * demos Programación II.
   */
    
    // El 2 es un número entero.
    System.out.println(2);
    
    // Podemos sumar dos números enteros.
    System.out.println(2 + 1);
    
    // Podemos multiplicarlos.
    System.out.println(2 * 4);
    
    // Y podemos hacer otras operaciones.
    System.out.println(11 % 5);
    
    // Podemos ponerles nombres a los datos que vamos a usar.
    int nota_en_progra = 10;
    System.out.println(nota_en_progra);
    
    // Y esos nombres viven dentro de sus bloques.
    int variable_sana = 1;
    {
      int variable_no_sana = 0;
      System.out.println("Dentro del bloque:");
      System.out.println(variable_sana);
      System.out.println(variable_no_sana);
    }
    System.out.println("Fuera del bloque:");
//    System.out.println(variable_sana);
//    System.out.println(variable_no_sana);
    
    // Tambien podemos crear constantes, nombres para datos que NO PUEDEN CAMBIAR.
    final double PI = 22 / 7;
//    PI = 3.141592;
  }  
}
