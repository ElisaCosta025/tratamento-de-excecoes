/* EXERCÍCIO 1:

IllegalArgumentException é uma excessão que ocorre quando um método é chamado, e o argumento dado a este método não é valido, como por exemplo se um argumento é passado no formato errado.

NumberFormatException é um tipo de exceção que ocorre quando se tenta passar uma variável string para um tipo numérico, mas esta string possui caracteres não-numéricos/o formato certo de um int/double/long etc.

*/
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test_Excecoes {

    private static int max = 100;
  
    @Test
    public void Test_NumberFormatException(){
        Assertions.assertThrows(NumberFormatException.class, () -> {
            String s = "hello";
            int i = Integer.parseInt(s);
            System.out.println(i);
        });
    }

    @Test
    public void Test_IllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int i = 200;
            check(i);
        });
    }

    public static int check(int s){
    if (s > max){
        throw new IllegalArgumentException();
    }
    return(s);
    }
}
