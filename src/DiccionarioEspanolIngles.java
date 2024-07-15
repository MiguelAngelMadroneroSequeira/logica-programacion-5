import java.util.*;

public class DiccionarioEspanolIngles {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("hola", "hello");
    diccionario.put("adiós", "goodbye");
    diccionario.put("gracias", "thank you");
    diccionario.put("por favor", "please");
    diccionario.put("sí", "yes");
    diccionario.put("no", "no");
    diccionario.put("perro", "dog");
    diccionario.put("gato", "cat");
    diccionario.put("casa", "house");
    diccionario.put("libro", "book");
    diccionario.put("agua", "water");
    diccionario.put("comida", "food");
    diccionario.put("música", "music");
    diccionario.put("escuela", "school");
    diccionario.put("ciudad", "city");
    diccionario.put("trabajo", "work");
    diccionario.put("familia", "family");
    diccionario.put("amigo", "friend");
    diccionario.put("tiempo", "time");
    diccionario.put("silla", "chair");
    diccionario.put("mesa", "table");

    // Escoger 5 palabras al azar
    List<String> palabras = new ArrayList<>(diccionario.keySet());
    Collections.shuffle(palabras);
    List<String> palabrasAleatorias = palabras.subList(0, 5);

    Scanner scanner = new Scanner(System.in);
    int correctas = 0;
    int incorrectas = 0;

    // Preguntar al usuario la traducción
    for (String palabra : palabrasAleatorias) {
      System.out.print("¿Cuál es la traducción de '" + palabra + "' en inglés? ");
      String respuestaUsuario = scanner.nextLine().trim();

      if (diccionario.get(palabra).equalsIgnoreCase(respuestaUsuario)) {
        System.out.println("¡Correcto!");
        correctas++;
      } else {
        System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
        incorrectas++;
      }
    }

    System.out.println("Resultados finales:");
    System.out.println("Respuestas correctas: " + correctas);
    System.out.println("Respuestas incorrectas: " + incorrectas);

    scanner.close();
  }
}
