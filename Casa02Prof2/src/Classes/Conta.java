package Classes;

public class Conta {
    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;

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
    //#endregion

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