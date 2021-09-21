
public class Funciones {

  /*
   * Por ahora hemos visto código que se ejecuta de arriba a abajo
   * instrucción por instrucción, sin separación entre las distintas
   * partes del código más allá de mis comentarios.
   * 
   * Esto hace que cuando creamos un programa muy largo, el código sea
   * ilegible, y muy dificil de editar, arreglar y extender.
   * 
   * Esta parte trata sobre funciones: Formas de agrupar partes de vuestro
   * código a las que podeis llamar repetidamente, que hacen que el programa
   * quede mucho más bonito.
   * 
   * Una función toma un input en la forma de parametros y suele (pero no tiene
   * por qué) devolver un output. La sintaxis es la siguiente:
   * 
   *    [public static] <tipo> <nombre_funcion> (<tipo> <nombre_param_1>, <tipo> <nombre_param_2>) {}
   *    
   * El <tipo> justo delante de la función es el tipo del output, si la función no
   * devuelve nada se utiliza la palabra "void".
   * 
   * Puede parecer que el uso de funciones es, de alguna manera, optativo,
   * NO LO ES. La separación del código en bloques lógicos es MUY IMPORTANTE
   * y el desarrollo de software REQUIERE de una cierta organización.
   * Más allá, hay cosas que simplemente serían dificilísimas de hacer sin la
   * posibilidad de llamar a trozos de código repetidamente o en 
   * circunstancias particulares.
   * 
   * Una norma de buen gusto: Intentad dividir el código en operaciones lógicas
   * pequeñas e identificables, y poned cada una de ellas en una función con
   * un nombre adecuado.
   */
  
  /**
   * Imprime un saludo al nombre dado.
   * @param nombre
   */
  public static void saludame(String nombre) {
    String saludo = "Hola, ";
    saludo = saludo + nombre + ".";
    System.out.println(saludo);
  }
  
  /**
   * Devuelve el cubo del número dado.
   * @param numero
   * @return numero^3
   */
  public static int cubo(int numero) {
    return numero * numero * numero;
  }
  
  /**
   * Devuelve el resultado de la función
   * f(x) = ax^2 + bx + c
   * para a, b, c y x dados.
   * @param a
   * @param b
   * @param c
   * @param x
   * @return ax^2 + bx + c
   */
  public static int cuadratica(int a, int b, int c, int x) {
    int resultado = (a * x * x) + (b * x) + c;
    return resultado;
  }
  
  public static String calcular_fecha(int dia_anno) {
    String fecha = "%d de %s.";
    if (dia_anno < 32) {
      fecha = String.format(fecha, dia_anno, "enero");
    } else if (dia_anno < 60) {      
      fecha = String.format(fecha, dia_anno - 31, "febrero");
    } else if (dia_anno < 91) {
      fecha = String.format(fecha, dia_anno - 59, "marzo");
    } else if (dia_anno < 121) {
      fecha = String.format(fecha, dia_anno - 90, "abril");
    } else if (dia_anno < 152) {
      fecha = String.format(fecha, dia_anno - 120, "mayo");
    } else if (dia_anno < 182) {
      fecha = String.format(fecha, dia_anno - 151, "junio");
    } else if (dia_anno < 213) {
      fecha = String.format(fecha, dia_anno - 181, "julio");
    } else if (dia_anno < 244) {
      fecha = String.format(fecha, dia_anno - 212, "agosto");
    } else if (dia_anno < 274) {
      fecha = String.format(fecha, dia_anno - 243, "septiembre");
    } else if (dia_anno < 305) {
      fecha = String.format(fecha, dia_anno - 273, "octubre");
    } else if (dia_anno < 335) {
      fecha = String.format(fecha, dia_anno - 204, "noviembre");
    } else if (dia_anno < 366) {
      fecha = String.format(fecha, dia_anno - 334, "diciembre");
    } else {
      fecha = "El día no es valido.";
    }
    return fecha;
  }
  
  public static void main(String[] args) {
  /*
   * Ahora nos podemos dar cuenta de que 'main' es en realidad
   * una función. Tiene un argumento un poco raro, que tiene algo
   * que ver con Strings.
   * 
   * Main tiene una función especial. Es la parte que se ejecuta 'automaticamente'
   * del código. Es decir, cuando le damos a 'ejecutar' o hacemos
   * java NombrePrograma
   * en la terminal después de compilar, lo que se ejecuta es la
   * función main, siempre, y ninguna otra (a no ser que se llamen
   * explicitamente).
   * 
   * Ahora podemos usar las funciones que hemos hecho,
   * tantas veces como queramos.
   * Observamos la diferencia entre devolver un valor con 'return'
   * e imprimirlo directamente en la función.
   */
    System.out.println("Función 'saludame':");
    saludame("Borja");
    saludame("Ferrero");
    
    System.out.println("\nFunción 'cubo':");
    cubo(3);
    System.out.println(cubo(3));
    
    System.out.println("\nFunción 'cuadratica':");
    System.out.println(cuadratica(1, -2, 3, -2));
    System.out.println(cuadratica(1, -2, 3, -1));
    System.out.println(cuadratica(1, -2, 3, 0));
    System.out.println(cuadratica(1, -2, 3, 1));
    System.out.println(cuadratica(1, -2, 3, 2));
   
    System.out.println("\nFunción 'calcular_fecha':");
    System.out.println(calcular_fecha(264));
    System.out.println(calcular_fecha(365));
    System.out.println(calcular_fecha(366));
  }
}
