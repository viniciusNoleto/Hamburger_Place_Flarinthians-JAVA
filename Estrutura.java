import java.util.Scanner;

public class Estrutura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

		System.out.println("Olá, bem vindo(a) ao sistema de estruturação de Hamburgueria Flarinthians!");
        System.out.println("Primeiro, vamos contratar funcionários ;)");

        int contratar = 1;
        while(contratar == 1){

            System.out.println("Escolha uma dentre as opções de cargos para a contratação");
            System.out.println("1: Gerente");
            System.out.println("2: Cozinheiro(a)");
            System.out.println("3: Estoquista");
            System.out.println("4: Atendente");
    

            int optionCargo = scan.nextInt();

            while(optionCargo != 1 && optionCargo != 2 && optionCargo != 3 && optionCargo != 4){
                System.out.println("Valor inválido, digite novamente");
                optionCargo = scan.nextInt();
            }
    
            System.out.println("Agora, escolha um nome para seu novo funcionário!");
            
            String nomeFuncionario = scan.nextLine();
            

            System.out.println("Agora, escolha um salário para seu novo funcionário!");

            double salarioFuncionario = scan.nextDouble();

            while(salarioFuncionario <= 0){
                System.out.println("Valor inválido, digite novamente");
                salarioFuncionario = scan.nextDouble();
            }
    
            if(optionCargo == 1){

            }else if(optionCargo == 2){

            }else if(optionCargo == 3){

            }else if(optionCargo == 4){

            }



            System.out.println("Deseja contratar mais funcioários?");
            System.out.println("1: Sim");
            System.out.println("0: Não");


            int inputContratar = scan.nextInt();

            while(contratar != 1 && contratar != 0){
                System.out.println("Valor inválido, digite novamente");
                inputContratar = scan.nextInt();
            }
            
            contratar = inputContratar;

        }

        System.out.println("Estruturação de Hamburgueria Flarinthians finalizada ;)");

	}

}
