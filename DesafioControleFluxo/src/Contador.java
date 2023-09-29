import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");

            int parametro1 = input.nextInt();

            System.out.print("Digite o segundo parâmetro: ");

            int parametro2 = input.nextInt();

            input.close();

            contar(parametro1,parametro2);

        } catch (InputMismatchException e) {

            System.out.println("\n>>> Parâmetro inválido, digite um parâmetro válido <<<");

        } catch(ParametrosInvalidosException e){

            System.out.println("\n >>> O segundo parâmetro deve ser maior que o primeiro <<<");
        } catch(Exception e){

            e.printStackTrace();
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {

            throw new ParametrosInvalidosException();
        } else {

            int contagem = parametroDois - parametroUm;

            System.out.println("\n======== C O N T A D O R ========\n");

            for (int i = 0; i < contagem; i++) {

                System.out.print(i + " ");

            }

        }

    }

}
