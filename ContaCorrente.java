import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste de conversão de unidades")
class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public void sacar(float valor) throws IllegalArgumentException{
        if (valor > limite || valor < 0){
            throw new IllegalArgumentException("Valor invalido de saque");
        }
        else {
            saldo -= valor;
        }
    }
    public void depositar(float valor) throws IllegalArgumentException{
        if (valor > valorLimite || valor < 0){
            throw new IllegalArgumentException("Valor invalido de depósito");
        }
        else {
            saldo += valor;
        }
    }
    public void setValorLimite(float valor) throws IllegalArgumentException{
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido para valor limite");
        }
        else {
            valorLimite = valor;
        }
    }

    public float getSaldo() {
        return saldo;
    }
}
