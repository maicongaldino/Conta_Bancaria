package Classes;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta contaAtual;

    public Cliente (Conta contaAtual) {
        this.contaAtual = contaAtual;
    }
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //#region Get and Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Conta getContaAtual() {
        return contaAtual;
    }
    public void setContaAtual(Conta contaAtual) {
        this.contaAtual = contaAtual;
    }
    //#endregion

    public void depositar(double valor) {
        this.contaAtual.realizaOperacao(TipoOperacao.DEPOSITO, valor);
    }

    public void sacar(double valor) {
        this.contaAtual.realizaOperacao(TipoOperacao.SAQUE, valor);
    }

    public void exibirSaldo() {
        this.contaAtual.realizaOperacao(TipoOperacao.SALDO, 0);
    }
}