public class contabancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("depositos realizado. saldo atual: " + saldo);
        } else {
            System.out.println("valor de deposito invalido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque realizado. saldo atual: " + saldo);
        } else {
            System.out.println("valor de saque invalido ou saldo insuficiente");
        }
    }
    public double getSaldo(){
        return saldo;
    }
}
