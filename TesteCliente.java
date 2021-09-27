import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste de conversão de unidades")
public class Teste_ConversaoDeUnidadesDeArea {
    
    @BeforeEach
    public void Inicializa_Cadastro(){
        CadastroCliente CC = new CadastroCliente();
    }


    @Test
    public void Cliente_Test_Busca(){
        
        Assertions.assertThrows(ClienteInexistenteException.class, () -> {
            CC.busca("Blablabla");
        });
    }

    @Test
    public void Cliente_Test_Set(){
        Cliente c = new Cliente();
        Assertions.assertThrows(DadoInvalidoException.class, () -> {
            c.setCPF(-215);
        });
    }

    @Test
    public void Cliente_Test_Insere(){
        CC.Insere("Joao", 00000000000);
        Assertions.assertThrows(ClienteJaExistenteException.class, () -> {
            CC.Insere("Joao", 00000000000);
        });
    }
}
