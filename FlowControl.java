
public class FlowControl {
  /*
   * Bien, sabemos como almacenar valores en variables, imprimirlos,
   * hacer operaciones básicas y agrupar esas operaciones en funciones.
   * 
   * Pero ¿y si quisieramos hacer una operación SOLO SI una condición se cumple?
   * Para esto existen los bloques condicionales if/else. Nos permiten plantear 
   * una condición, el código que se ejecuta si la condición se cumple, y el código
   * que se ejecuta si no se cumple.
   * 
   * Veamos un ejemplo:
   */
  
  public static int tres_x_mas_uno(int x) {
    if (x % 2 == 0) {
      return (int) x / 2;
    } else {
      return 3 * x + 1;
    }
  }
  
  /*
   * ¿Y si tenemos más condiciones?
   * Dado un número queremos el número más bajo del 1 al 10
   * que lo divida de forma entera, y si no existe, queremos saberlo,
   * (la función puede devolver -1, por ejemplo)
   */
  
  public static byte minimo_divisor_diez(int x) {
    if (x % 2 == 0) {
      return 2;
    } else if (x % 3 == 0) {
      return 3;
    } else if (x % 5 == 0) {
      return 5;
    } else if (x % 7 == 0) {
      return 7;
    } else {
      return -1;
    }
  }
  
  /*
   * Veamos un ejemplo más completo. Queremos saber la bebida que ponerle a
   * alguien cuando llega a un bar. Sabemos su edad, el pais en el que estamos,
   * y observamos cuanto ha bebido hasta ahora.
   * Sabemos lo siguiente:
   *  - Todas las personas en UK piden té.
   *  - Todos los menores de edad (en otro pais) piden Fanta de Naranja.
   *  - Los mayores de edad en EEUU piden bourbon.
   *  - Los mayores de edad en España piden cerveza.
   *  - Si detectamos que un cliente mayor de edad, no debería beber más, 
   *    siempre le servimos zumo de tomate.
   *  - A cualquier otro caso le ponemos Sprite.
   * Mayoría de Edad:
   *  - EEUU: 21 años.
   *  - El resto del mundo: 18 años.
   */
  
  /*
   * Primero creamos una función para saber si alguien es mayor de edad.
   */
  public static boolean mayor_edad(byte edad, String pais) {
    if (pais == "EEUU") {
      return edad >= 21;
    } else {
      return edad >= 18;
    }
  }
  
  public static String bebida(byte edad, String pais, boolean camina_recto) {
    if (pais == "UK") {
      return "Té";
    } else if (mayor_edad(edad, pais)) {
      if (!camina_recto) {
        return "Zumo de Tomate";
      } else if (pais == "USA") {
        return "Bourbon";
      } else if (pais == "España") {
        return "Cerveza";
      } else {
        return "Sprite";
      }
    } else {
      return "Fanta de naranja";
    }
  }
  
  /*
   * Cambiemos las normas del problema anterior, ahora nuestro bar mundial
   * no admite menores y no se preocupa por borrachos, solo nos preocupa la nacionalidad,
   * ¡y ganar dinero! $.$
   * Extendamos ahora las posibilidades de bebida para distintos paises:
   *  España -> Sangría
   *  UK -> Té
   *  EEUU -> Coca-cola
   *  México -> Tequila
   *  Argentina -> Mate
   *  Rusia -> Vodka
   *  Irlanda -> Guinness
   *  Francia -> Vino
   *  Alemania -> Lager
   *  Botswana -> Chibuku
   *  Japón -> Sake
   *  Taiwan -> Boba
   *  Korea la mala -> Soju
   *  Korea la buena -> Soju (pero producido en Pyongyang)
   *  Laos -> Lao-Lao
   *  Malasia -> Teh Tarik
   *  Australia -> LLB
   *  Indonesia -> Café de Java
   *  Otro -> Agua
   */
  
  /*
   * Java nos ofrece una manera de hacer un if como este de una manera
   * ligeramente más facil.
   * Usamos switch/case.
   */
  
  public static String bebida_pais(String pais) {
    String bebida;
    
    switch (pais) {
      case "España": 
        bebida =  "Sangría"; 
        break;
      case "UK": 
        bebida =  "Té"; 
        break;
      case "EEUU": 
        bebida =  "Coca-cola"; 
        break;
      case "México": 
        bebida =  "Tequila"; 
        break;
      case "Argentina": 
        bebida =  "Mate"; 
        break;
      case "Rusia": 
        bebida =  "Vodka"; 
        break;
      case "Irlanda": 
        bebida =  "Guinness"; 
        break;
      case "Francia": 
        bebida =  "Vino"; 
        break;
      case "Alemania": 
        bebida =  "Lager"; 
        break;
      case "Botswana": 
        bebida =  "Chibuku"; 
        break;
      case "Japón": 
        bebida =  "Sake"; 
        break;
      case "Taiwan": 
        bebida =  "Boba"; 
        break;
      case "Korea del Sur":
      case "Korea del Norte": 
        bebida =  "Soju"; 
        break;
      case "Laos": 
        bebida =  "Lao-Lao"; 
        break;
      case "Malasia": 
        bebida =  "Teh Tarik"; 
        break;
      case "Australia": 
        bebida =  "LLB"; 
        break;
      case "Indonesia": 
        bebida =  "Café de Java"; 
        break;
      default: 
        bebida =  "Agua"; 
        break;
    }
    return bebida;
  }
  
  /*
   * Por último vamos a hacer que nuestro programa pete.
   * Hay muchas formas de hacerlo, pero por ahora, vamos a
   * dividir entre cero.
   */
  
  public static double divide_cero(int i) {
    double solucion = i / 0;
    return solucion;
  }
  
  /*
   * Y ahora vamos a intentar evitar que el código pete, con un try/catch.
   */
  public static double intenta_dividir_cero(int i) {
    try {
      return divide_cero(i);
    } catch (ArithmeticException E){
      return -1;
    }
  }
  
  public static void main(String[] args) {
    // Puedes llamar a las funciones aquí para comprobar sus resultados.
    System.out.println(divide_cero(2)); 
  }
}
