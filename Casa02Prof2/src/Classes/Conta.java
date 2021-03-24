package Classes;

public class Conta {
    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;
    private int idConta;
    private Cliente cliente;

    //#region Get and set
    public TipoOperacao getOperacao() {
        return operacao;
    }
    public double getValorOperacao() {
        return valorOperacao;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getIdConta() {
        return idConta;
    }
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //#endregion

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        cliente.setContaAtual(this);
    }
    public Conta(int idConta, Cliente cliente) {
        this(cliente);
        setIdConta(idConta);
    }

    public void realizaOperacao(TipoOperacao operacao, double valor) {
        this.operacao = operacao;
        this.valorOperacao = valor;

        if (operacao == TipoOperacao.SAQUE)
        {
            if (valor <= saldo)
            {
                this.saldo = this.saldo - valor;
                System.out.printf("\nSaque de %.2f R$ realizado com sucesso !!!\n\n", valor);
            }
            else
            {
                System.out.println("Não há saldo suficiente para realizar o saque.");
            }
        }
        else
        {
            if (operacao == TipoOperacao.DEPOSITO)
            {
                this.saldo = this.saldo + valor;
                System.out.printf("\nDepósito de %.2f R$ realizado com sucesso !!!\n\n", valor);
            }
            else
            {
                if (operacao == TipoOperacao.SALDO)
                {
                    System.out.printf("\nSeu saldo é de %.2f R$\n\n", saldo);
                }
            }  
        }
    }
}