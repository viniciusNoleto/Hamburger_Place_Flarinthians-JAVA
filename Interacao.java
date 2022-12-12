import java.util.Scanner;
import java.util.Random;

public class Interacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

		System.out.println("Olá, bem vindo a Hamburgueria Flarinthians!");
        System.out.println("Qual é o seu nome?");

        String nomeCliente = scan.nextLine();

        Cliente c = new Cliente(nomeCliente);

        Flarinthians f = new Flarinthians();
        LerTxt ltxt = new LerTxt();
        EscTxt etxt = new EscTxt();

        ltxt.lerFuncionarios(f);
        ltxt.lerInsumos(f);

        if(f.gerentes.size() > 0 && f.cozinheiros.size() > 0 && f.estoquistas.size() > 0 && f.atendentes.size() > 0){

            Gerente g = f.gerentes.get(0);
            Cozinheiro cz = f.cozinheiros.get(0);
            Estoquista est = f.estoquistas.get(0);
            Atendente a = f.atendentes.get(0);
    
            double totalConta = 0;
    
            System.out.println(a.getNome() + ": Olá " + c.getNome() + "! Boa noite, o que o(a) senhor(a) deseja?");
            
            int fazerPedido = 1;
            while(fazerPedido == 1){
    
                System.out.println(a.getNome() + ": Nós temos em nosso cardápio os hamburgueres:");
                System.out.println("1: X-Plameiras, R$ 00,00");
                System.out.println("2: X-Bota Fogo, R$ 00,00");
                System.out.println("3: X-Corinthians, R$ 00,00");
                System.out.println("4: X-Vasco, R$ 00,00");
                System.out.println("5: X-São Paulo, R$ 00,00");
                System.out.println("6: X-Flamengo, R$ 00,00");
                System.out.println("7: X-Brasileirão, R$ 00,00");
        
                int optionHamburger = scan.nextInt();
        
                while(optionHamburger != 1 && optionHamburger != 2 && optionHamburger != 3 && optionHamburger != 4 && optionHamburger != 5 && optionHamburger != 6 && optionHamburger != 7){
                    System.out.println("Valor inválido, digite novamente");
                    optionHamburger = scan.nextInt();
                }
        
                System.out.println(a.getNome() + ": Ótimo! Qual opção de molho o(a) senhor(a) deseja? Não se preocupe, não é cobrado.");
                System.out.println(a.getNome() + ": Nós temos três opções:");
                System.out.println("1: Molho Libertadores (Barbecue)");
                System.out.println("2: Molho Cariocão (Cheddar)");
                System.out.println("3: Molho Mundial (Alho)");
        
                int optionMolho = scan.nextInt();
        
                while((optionMolho != 1 && optionMolho != 2 && optionMolho != 3) || (optionMolho == 3 && optionHamburger ==1)){
                    if(optionMolho == 3 && optionHamburger ==1){
                        System.out.println(a.getNome() + ": Desculpe, mas não é possível incluir o Molho Mundial ao X-Palmeiras...");
                    }
                    System.out.println("Valor inválido, digite novamente");
        
                    optionMolho = scan.nextInt();
                }
        
                System.out.println(a.getNome() + ": Por último, o(a) senhor(a) aceita uma bebida?");
                System.out.println(a.getNome() + ": Nós temos três opções:");
                System.out.println("1: Coca Cola");
                System.out.println("2: Guaraná Antartica");
                System.out.println("3: Suco de Laranja");
                System.out.println("4: (nenhum)");
        
                int optionBebida = scan.nextInt();
        
                while(optionBebida != 1 && optionBebida != 2 && optionBebida != 3 && optionBebida != 4){
                    System.out.println("Valor inválido, digite novamente");
                    optionBebida = scan.nextInt();
                }
        
                System.out.println("-- Atendente " + a.getNome() + " anotou o seu pedido...");
        
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
        
                boolean pedidoOK = false;
                Estocavel h = null;
                Estocavel m = null;
                Estocavel b = null;
                try{
        
                    if(optionHamburger == 1){
                        h = new XPalmeiras();
                    }else if(optionHamburger == 2){
                        h = new XBotaFogo();
                    }else if(optionHamburger == 3){
                        h = new XCorinthians();
                    }else if(optionHamburger == 4){
                        h = new XVasco();
                    }else if(optionHamburger == 5){
                        h = new XSaoPaulo();
                    }else if(optionHamburger == 6){
                        h = new XFlamengo();
                    }else if(optionHamburger == 7){
                        h = new XBrasileirao();
                    }
                    
                    h.checarEstoque();
                    
                    if(optionMolho == 1){
                        m = new MolhoLibertadores();
                    }else if(optionMolho == 2){
                        m = new MolhoCariocao();
                    }else if(optionMolho == 3){
                        m = new MolhoMundial();
                    }
                    
                    m.checarEstoque();
        
                    if(optionBebida == 1){
                        b = new CocaCola();
                    }else if(optionBebida == 2){
                        b = new GuaranaAntartica();
                    }else if(optionBebida == 3){
                        b = new SucoDeLaranja();
                    }
                    
                    if(b != null){
                        b.checarEstoque();
                    }
        
                    pedidoOK = true;
    
                    h.retirar();
                    totalConta += h.getValor();
                    m.retirar();
                    totalConta += m.getValor();
                    if(b != null){
                        b.retirar();
                        totalConta += b.getValor();
                    }
        
                }catch (EstoqueInsuficienteException e){
        
                    System.out.println(a.getNome() + e.getMessage());
    
                    if(f.estoquistas.size() > 1){
    
                        System.out.println(g.getNome() + ": Olá, mil perdões pelo ocorrido de não haver material para o seu lanche...");
                        System.out.println(g.getNome() + ": Demitirei o estoquista " + est.getNome() + " IMEDIATAMENTE!!");
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("-- " + est.getNome() + " se aproxima ...");
                        System.out.println(est.getNome() + ": Você arruinou a minha vida...");
    
                        g.demitirEstoquista(0);
    
                    }else{
    
                        System.out.println(g.getNome() + ": A(O) " + a.getNome() + " me chamou sobre não ter material pro seu lanche.... meu irmão(ã) é o que tem pra hoje, no vizinho também vende... se tá achando ruim vai pra lá");
    
                    }
        
                }
        
                if(pedidoOK){
                    System.out.println(a.getNome() + ": Deseja fazer mais um pedido?");
                }else{
                    System.out.println(a.getNome() + ": Deseja refazer seu pedido?");
                }
                System.out.println("1: Sim");
                System.out.println("0: Não");
        
                fazerPedido = scan.nextInt();
        
                while(fazerPedido != 1 && fazerPedido != 0){
                    System.out.println("Valor inválido, digite novamente");
                    fazerPedido = scan.nextInt();
                }
    
            }
    
            System.out.println("-- O(A) cozinheiro(a) " + cz.getNome() + " prepara o seu pedido...");
    
            System.out.println(g.getNome() + ": Olá, como estava o lanche?");
    
            System.out.println("1: Comer asfalto seria mais gostoso");
            System.out.println("2: Olha... tem que melhorar muito pra ficar ruim");
            System.out.println("3: Estava ok");
            System.out.println("4: Estava uma delícia, dê parabens ao cozinheiro");
            System.out.println("5: Eu senti como se um anjo viesse a terra e preparasse um lanche para mim");
    
            int optionNota = scan.nextInt();
    
            while(optionNota != 1 && optionNota != 2 && optionNota != 3 && optionNota != 4 && optionNota != 5){
                System.out.println("Valor inválido, digite novamente");
                optionNota = scan.nextInt();
            }
    
    
            if(f.cozinheiros.size() > 1){
    
                if(optionNota == 1){
                    System.out.println(g.getNome() + ": Pois eu vou demiti-lo NESTE INSTANTE! Isto é um absurdo!");
                    g.demitirCozinheiro(optionNota);
                }else if(optionNota == 2){
                    System.out.println("-- " + g.getNome() + " vai até o(a) cozinheiro(a) " + cz.getNome() + " ...");
                    System.out.println(g.getNome() + ": Você não é digno da alta gastronomia da Hamburgueria Flarinthians...");
                    g.demitirCozinheiro(0);
                }else{
                    System.out.println(g.getNome() + ": Excelente! Venha mais vezes pois o nosso objetivo é sempre melhorar.");
                }
    
            }else{
    
                if(optionNota < 3){
                    System.out.println("-- " + g.getNome() + " conta à " + cz.getNome() + " o que foi falado pelo cliente...");
                    System.out.println("-- " + cz.getNome() + " se aproxima de você...");
                    System.out.println(cz.getNome() + ": VEM FAZER ENTÃO!!!!");
                    System.out.println("-- " + cz.getNome() + " joga os utensilhos de cozinha no chão e vai embora...");
                    System.out.println(g.getNome() + ": É muito difícil empreender no Brasil");
                }else{
                    System.out.println(g.getNome() + ": Volte sempre!");
                }
    
            }
    
            System.out.println(a.getNome() + ": Sua conta deu um total de " + totalConta + ", como será sua forma de pagamento?");
    
            System.out.println("1: Crédito");
            System.out.println("0: Débito");
    
            int cartao = scan.nextInt();
    
            while(cartao != 1 && cartao != 0){
                System.out.println("Valor inválido, digite novamente");
                cartao = scan.nextInt();
            }
    
            int randomInt = rand.nextInt(11); // 0 - 10
    
            if(randomInt < 4){
                System.out.println("-- Seu cartão recusa várias vezes e você sai correndo com " + g.getNome() + ", " + cz.getNome() + " e " + est.getNome() + " atrás de você por todo a a rua até cansarem");
            }else{
                System.out.println("Você paga sua conta e volta para casa");
            }
            
            etxt.escreverInsumos(f.relatorio());
    
            scan.close();

        }else{
            System.out.println("Infelizmente a Flarinthians está fechada por falta de funcionários");
        }
	}

}
