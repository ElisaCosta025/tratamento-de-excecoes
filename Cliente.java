class DadoInvalidoException extends IllegalArgumentException {
    public DadoInvalidoException(String string) {
    }
} 
class ClienteJaExistenteException extends IllegalArgumentException {
    public ClienteJaExistenteException(String string) {
    }
}
class ClienteInexistenteException extends IllegalArgumentException {
    public ClienteInexistenteException(String string) {
    }
}
class RepositorioException extends RuntimeException {
    public RepositorioException(String string) {
    }
}

public class Cliente {
    private String nome;
    private int CPF;

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cpf) throws DadoInvalidoException{
        int length = String.valueOf(cpf).length();
        if (length != 11) {
            throw new DadoInvalidoException("Número inválido");
        } else{
            CPF = cpf;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws DadoInvalidoException{
        int length = nome.length();
        if (length > 747 || length <= 0){
            throw new DadoInvalidoException("Nome inválido");
        }
        else{
            this.nome = nome;
        }
    }
}

class CadastroCliente{
    private Cliente[] clientes = new Cliente[10];

    public void Insere(String s, int cpf){

        for (int i = 0; i < (clientes.length); i++) {
            if (clientes[i].getNome() == s){
                throw new ClienteJaExistenteException("Cliente ja se encontra na lista");
            }
            if (clientes[i] == null) {
                clientes[i] = new Cliente();
                try {
                    clientes[i].setNome(s);
                } catch (DadoInvalidoException e) {
                    System.out.println(e.getMessage());
                }
                try {
                    clientes[i].setCPF(cpf);
                } catch (DadoInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            } 
        }
        throw new RepositorioException("Lista de clientes está cheia.");
    }
    public Cliente busca(String s) throws ClienteInexistenteException{
        for (Cliente c : clientes){
            if (c.getNome() == s){
                return c;
            }
        }
        throw new ClienteInexistenteException("Não há cliente com este nome");
    }
}
