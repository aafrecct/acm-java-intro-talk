import utils.Utils;

public class Arrays {
  
  /*
   * A veces es útil agrupar datos del mismo típo, por ejemplo,
   * para crear vectores, o matrices, o para devolver más de un valor
   * en una función.
   * 
   * Para esto usamos arrays. Vamos a ver como se devuelve un array
   * de una función.
   */
  
  public static int[] tres_suguientes_numeros (int i) {
    int[] solucion = {i + 1, i + 2, i + 3};
    return solucion;
  }
  
  /*
   * Eso está bien, pero no siempre vamos a saber los valores del array 
   * nada más lo creamos. ¿Podemos crear un array vacío e irlo llenando?
   * Más o menos. Los arrays tienen que tener una longitud predefinida, y
   * se llenan con 0s o null's al principio.
   * Vamos a crear un array vacio y crear una función para llenarlo.
   */
  
  static int[] array = new int[10];
  static byte insert = 0;
  
  public static void mete_en_array(int i) {
    array[insert ++] = i;
  }

  public static void print_array(int[] array) {
    System.out.print('[');
    for (int i = 0; i < array.length - 1; ++i) {
      System.out.print(array[i]);
      System.out.print(", ");
    }
    System.out.print(array[array.length - 1]);
    System.out.println(']');
  }
  
  public static void main(String[] args) {
    print_array(tres_suguientes_numeros(20)); 
    Utils.pause();
    
    print_array(array);
    Utils.pause();
    
    mete_en_array(4);
    mete_en_array(2);
    mete_en_array(7);
    mete_en_array(1);
    mete_en_array(2);
    mete_en_array(9);
    mete_en_array(4);
    mete_en_array(8);
    mete_en_array(3);
    mete_en_array(8);
    
    print_array (array);
    Utils.pause();
    
    /*
     * Cambiemos ahora un item dentro de un array.
     * ¡Cuidado! ¡El primer item tiene índice 0!
     */
    
    array[2] = 420;
    array[9] <<= 2;
    array[0] ^= 6;
    
    print_array (array);
  }
}
