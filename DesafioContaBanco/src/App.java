import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        System.out.print("========= BEM VINDO AO BANCO CARVIIT =========\n");

        System.out.print("\nDigite seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("\nDigite o número da sua conta bancária: ");
        int numeroDaConta = input.nextInt();
        
        input.nextLine();

        System.out.print("\nDigite o número da sua agência bancária: ");
        String agencia = input.nextLine();

        System.out.print("\nDigite o seu saldo: R$ ");
        double saldo = input.nextDouble();

        ContaTerminal cliente1 = new ContaTerminal(agencia, nome, saldo, numeroDaConta);

        System.out.println(cliente1.toString());

        input.close();
        
    }
}
