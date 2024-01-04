


//Super Classe - Classe PAI

public abstract class Conta implements IConta {

    //Com o PROTECTED as classes filhas conseguem acessa-lás

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 0234;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }



    protected int agencia;
    protected int numero;
    protected int saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void trarnferir(double valor, Conta contaDestino) {

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo()  {
        return saldo;
    }

}


