package Bank;

import java.util.List;

public class Agencia {
    private String nome;
    private List<Conta> contas;

    public Agencia(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

}
