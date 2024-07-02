package Bank;

public class Main {
    public static void main(String[] args) {
        Cliente marcos = new Cliente();
        marcos.setNomeCliente("Marcos Carrijo");

        Conta cc = new ContaCorrente(marcos);
        cc.depositar(100);


        Conta poupanca = new ContaPoupanca(marcos);
        poupanca.depositar(50);

        cc.transferir(100, poupanca);
        poupanca.transferir(50, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}