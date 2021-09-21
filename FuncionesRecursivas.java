
public class FuncionesRecursivas {
  
  /*
   * Hay una forma más de hacer operaciones muchas veces, 
   * pero es un poco especial.
   * Se trata de llamar a una función desde dentro de sí
   * misma. Será, por tanto, una función recursiva.
   * 
   * He aquí una para imprimir el factorial de un número,
   * que es uno de los ejemplos clásicos para esto.
   */
  
  public static long factorial(int i) {
    if (i == 1) {
      return 1;
    } else {
      return i * factorial(i - 1);
    }
  }
  
  public static void main(String[] args) {
    System.out.println(factorial(20));
  }
}
