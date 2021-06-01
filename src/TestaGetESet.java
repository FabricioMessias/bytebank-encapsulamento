public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(0001, 1234);
        conta.setNumero(1334);
        System.out.println(conta.getNumero());

        conta.setAgencia(1237);
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();
        // paulo.nome = "Paulo Silveira";
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);

        conta.setSaldo(200.0);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Desenvolvedor");

        //são a mesma -> Referência <-
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}
