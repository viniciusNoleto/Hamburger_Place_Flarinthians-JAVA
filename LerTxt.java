
import java.io.*;  
import java.util.ArrayList;

public class LerTxt {

  public ArrayList<String> ler(String txt) {

    File file = new File("D:/Workspace/Main/Doc/Faculdade/Semestres/5° Semestre - 2022.2/Programação Orientada a Objeto/Trabalhos/Projeto Final - Hamburgueria Flarinthians/db/" + txt + ".txt");

    try {

      // Cria um FileReader para ler o arquivo
      FileReader reader = new FileReader(file);
      BufferedReader buffer = new BufferedReader(reader);

      String str;
      ArrayList<String> values =  new ArrayList<String>();

      while ((str = buffer.readLine()) != null) { values.add(str); }
      
      // Fecha o reader
      reader.close();

      return values;

    } catch (IOException e) {

      // Imprime a mensagem de erro se houver algum problema ao ler o arquivo
      System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());

    }

    return new ArrayList<String>();
  }

  public void lerInsumos(Flarinthians empresaFlarinthians){

    ArrayList<String> insumos = this.ler("insumos");

    empresaFlarinthians.guardador.setPao(Integer.parseInt(insumos.get(0)));
    empresaFlarinthians.guardador.setBacon(Integer.parseInt(insumos.get(1)));
    empresaFlarinthians.guardador.setCarne(Integer.parseInt(insumos.get(2)));
    empresaFlarinthians.guardador.setOvo(Integer.parseInt(insumos.get(3)));
    empresaFlarinthians.guardador.setQueijo(Integer.parseInt(insumos.get(4)));
    empresaFlarinthians.guardador.setAlface(Integer.parseInt(insumos.get(5)));
    empresaFlarinthians.guardador.setCebola(Integer.parseInt(insumos.get(6)));
    empresaFlarinthians.guardador.setTomate(Integer.parseInt(insumos.get(7)));
    empresaFlarinthians.guardador.setAlho(Integer.parseInt(insumos.get(8)));
    empresaFlarinthians.guardador.setBarbecue(Integer.parseInt(insumos.get(9)));
    empresaFlarinthians.guardador.setCheddar(Integer.parseInt(insumos.get(10)));
    empresaFlarinthians.guardador.setCocaCola(Integer.parseInt(insumos.get(11)));
    empresaFlarinthians.guardador.setGuaranaAntartica(Integer.parseInt(insumos.get(12)));
    empresaFlarinthians.guardador.setSucoDeLaranja(Integer.parseInt(insumos.get(13)));
  
  }

  public void lerFuncionarios(Flarinthians empresaFlarinthians){

    ArrayList<String> funcionarios = this.ler("funcionarios");

    for(int i = 0; i<funcionarios.size()-2; i=i+3){

      if(funcionarios.get(i).equals("Gerente")){

        empresaFlarinthians.gerentes.add(new Gerente(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2)), empresaFlarinthians));
        
      }else if(funcionarios.get(i).equals("Cozinheiro(a)")){

        empresaFlarinthians.cozinheiros.add(new Cozinheiro(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
        
      }else if(funcionarios.get(i).equals("Estoquista")){
        
        empresaFlarinthians.estoquistas.add(new Estoquista(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
        
      }else if(funcionarios.get(i).equals("Atendente")){

        empresaFlarinthians.atendentes.add(new Atendente(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
      
      }

    }
    
  };

}
