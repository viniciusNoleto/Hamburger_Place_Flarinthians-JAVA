
import java.io.*;
import java.util.ArrayList;

public class EscTxt {
  
  public void escrever(String txt, ArrayList<String> lines) {

    File file = new File("D:/Workspace/Main/Doc/Faculdade/Semestres/5° Semestre - 2022.2/Programação Orientada a Objeto/Trabalhos/Projeto Final - Hamburgueria Flarinthians/db/" + txt + ".txt");
        
    try {
      // Cria um FileWriter para escrever no arquivo
      PrintWriter writer = new PrintWriter(new FileWriter(file));
      
      // Escreve a string no arquivo
      for(int i=0; i < lines.size(); i++){
        writer.println(lines.get(i));
      }

      // Fecha o writer
      writer.close();
    } catch (IOException i) {
      // Imprime a mensagem de erro se houver algum problema ao escrever no arquivo
      System.out.println("Ocorreu um erro ao escrever no arquivo: " + i.getMessage());
    }

  }
  
  public void escreverInsumos(ArrayList<Integer> insumos) {

    ArrayList<String> insumosString = new ArrayList<String>();
    
    for(int i=0; i < insumos.size(); i++){
      insumosString.add(Integer.toString(insumos.get(i)));
    }

    this.escrever("insumos", insumosString);

  }

  public void escreverFuncionarios(ArrayList<Funcionario> funcionarios){

    ArrayList<String> funcionariosInfo = new ArrayList<String>();

    for(int i=0; i < funcionarios.size(); i++){
      funcionariosInfo.add(funcionarios.get(i).getCargo());
      funcionariosInfo.add(funcionarios.get(i).getNome());
      funcionariosInfo.add(Double.toString(funcionarios.get(i).getSalario()));
    }

    this.escrever("funcionarios", funcionariosInfo);

  }

}
