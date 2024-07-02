package Bank;

public abstract class Conta implements OperacoesConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUECIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUECIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComunsContas() {
        System.out.printf(String.format("Titular: %s", this.cliente.getNomeCliente()));
        System.out.printf(String.format("\nAgencia: %d", this.agencia));
        System.out.printf(String.format("\nNº Conta: %d", this.numeroConta));
        System.out.printf(String.format("\nSaldo: %.2f", this.saldo));
        System.out.println("\n=== Fim extrato === ");
    }
}
