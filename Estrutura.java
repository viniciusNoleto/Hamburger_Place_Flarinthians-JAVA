import java.util.Scanner;
import java.util.ArrayList;


public class Estrutura {

    public static void estruturaDeFuncionarios(Scanner scan, EscTxt etxt){
        
        ArrayList<Funcionario> funcionarios =  new ArrayList<Funcionario>();

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

            String cargoFuncionario = "";
            if(optionCargo == 1){
                cargoFuncionario = "Gerente";

            }else if(optionCargo == 2){
                cargoFuncionario = "Cozinheiro(a)";
                
            }else if(optionCargo == 3){
                cargoFuncionario = "Estoquista";
                
            }else if(optionCargo == 4){
                cargoFuncionario = "Atendente";
                
            }
            scan.nextLine();
    

            System.out.println("Agora, escolha um nome para seu novo funcionário!");
            
            String nomeFuncionario = scan.nextLine();
            
            System.out.println("O(A) " + nomeFuncionario + " será contradado como " + cargoFuncionario);

            System.out.println("Agora, escolha um salário para seu novo funcionário!");

            double salarioFuncionario = scan.nextDouble();

            while(salarioFuncionario <= 0){
                System.out.println("Valor inválido, digite novamente");
                salarioFuncionario = scan.nextDouble();
            }
            
            if(optionCargo == 1){
                funcionarios.add(new Gerente(nomeFuncionario, salarioFuncionario));

            }else if(optionCargo == 2){
                funcionarios.add(new Cozinheiro(nomeFuncionario, salarioFuncionario));
                
            }else if(optionCargo == 3){
                funcionarios.add(new Estoquista(nomeFuncionario, salarioFuncionario));
                
            }else if(optionCargo == 4){
                funcionarios.add(new Atendente(nomeFuncionario, salarioFuncionario));
                
            }

            System.out.println("Deseja contratar mais funcioários?");
            System.out.println("1: Sim");
            System.out.println("0: Não");


            int inputContratar = scan.nextInt();

            while(inputContratar != 1 && inputContratar != 0){
                System.out.println("Valor inválido, digite novamente");
                inputContratar = scan.nextInt();
            }
            
            contratar = inputContratar;

        }

        System.out.println("Estruturação de Funcionários de Hamburgueria Flarinthians finalizada ;)");

        etxt.escreverFuncionarios(funcionarios);

    }

    public static void estruturaDeInsumos(Scanner scan, EscTxt etxt){

        System.out.println("Segundo, vamos echer o estoque ;)");

        ArrayList<Integer> insumos =  new ArrayList<Integer>();


        System.out.println("Defina a quantidade de Pao:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Bacon:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Carne:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Ovo:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Queijo:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Alface:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Cebola:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Tomate:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Alho:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Barbecue:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Cheddar:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Coca-Cola:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Guarana Antartica:");
        insumos.add(scan.nextInt());
        
        System.out.println("Defina a quantidade de Suco de Laranja:");
        insumos.add(scan.nextInt());

        etxt.escreverInsumos(insumos);

        System.out.println("Estoque renovado Hamburgueria Flarinthians finalizada ;)");

    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        EscTxt etxt = new EscTxt();
        
        System.out.println("Olá, bem vindo(a) ao sistema de estruturação de Hamburgueria Flarinthians!");

        estruturaDeFuncionarios(scan, etxt);

        estruturaDeInsumos(scan, etxt);

        scan.close();
		
	}

}
