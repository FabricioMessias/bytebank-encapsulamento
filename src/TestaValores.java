public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(225, 12345);
       // Conta ContaConstrutorPadrao = new Conta();

        conta.setAgencia(-50);
        conta.setNumero(-330);
        conta.deposita(-300);

        System.out.println("Número da Agencia -> " + conta.getAgencia());

        Conta conta2 = new Conta(225, 23456);
        Conta conta3 = new Conta(225, 34567);

        System.out.println("O Total de contas criadas foram -> " + Conta.getTotal());

    }
}
