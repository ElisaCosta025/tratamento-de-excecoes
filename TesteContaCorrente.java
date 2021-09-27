import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste de conversão de unidades")
public class Teste_ConversaoDeUnidadesDeArea {
    
    @Test
    public void Conversao_Test_setValor(){
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            c.setValorLimite(-2);
        });
    }

    @Test
    public void Conversao_Test_Depositar(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            c.depositar(-2);
        });
    }

    @Test
    public void Conversao_Test_Sacar(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            c.sacar(-2);
        });
    }
}
