public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void trarnferir(double valor, Conta contaDestino);

}
