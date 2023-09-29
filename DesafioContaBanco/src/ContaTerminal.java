public class ContaTerminal {

    private String agencia;
    private String nomeCliente;
    private double saldo;
    private int numeroDaConta;
    
    public ContaTerminal(String agencia, String nomeCliente, double saldo, int numeroDaConta){

        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;

    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    @Override
    public String toString(){
        return "\nOlá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", número da conta " + this.numeroDaConta + "e seu saldo de R$ " + this.saldo + " já está disponível para saque.";
    }
    
}
