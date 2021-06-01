public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    //static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta -> " + this.numero);
    }

    public void deposita(double valor) {
        if(valor <= 0) {
            System.out.println("Não pode depositar valor menor ou igual a 0");
            return;
        }
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
            return false;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Número da conta não pode ser valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Agencia não pode ser valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
