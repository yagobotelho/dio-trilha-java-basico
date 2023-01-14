public class Main {

    public static void main(String[] args) {
        Cliente mariana = new Cliente();
        mariana.setNome("mariana");

        Conta corrente = new ContaCorrente(mariana);
        Conta poupanca = new ContaPoupanca(mariana);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}