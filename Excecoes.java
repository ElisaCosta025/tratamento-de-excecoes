/* EXERCÍCIO 1:

IllegalArgumentException é uma excessão que ocorre quando um método é chamado, e o argumento dado a este método não é valido, como por exemplo se um argumento é passado no formato errado.

NumberFormatException é um tipo de exceção que ocorre quando se tenta passar uma variável string para um tipo numérico, mas esta string possui caracteres não-numéricos/o formato certo de um int/double/long etc.

*/
class Test_Excecoes {

  private static int max = 100;
  public static void main(String[] args) 
  {
    String s = "hello";
    try {
      int i = Integer.parseInt(s);
      System.out.println(i);
    } catch (NumberFormatException e) {
      System.out.println("Valor invalido");
    }

    try {
      int i = 200;
      check(i);
    } catch (IllegalArgumentException e) {
      System.out.println("Argumento invalido");
    }
  }

  public static int check(int s)
  {
    if (s > max){
      throw new IllegalArgumentException();
    }
    return(s);
  }
}