import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     
   Scanner ler = new Scanner(System.in);

    String nome, curso, periodo;
    int matricula;
    double notaAV1, notaAV2, notaAVE;

    public NotasAlunos(String nome, String curso, String periodo, int matricula, double notaAV1, double notaAV2, double notaAVE){

      super();
      this.nome = nome;
      this.curso = curso;
      this.periodo = periodo;
      this.matricula = matricula;
      this.notaAV1 = notaAV1;
      this.notaAV2 = notaAV2;
      this.notaAVE = notaAVE;
    }
    public void alterarnotaAV1(double notaAV1){
      this.notaAV1 = notaAV1;
    }
    public void alterarnotaAV2(double notaAV2){
      this.notaAV2 = notaAV2;
    }
    public void alterarnotaAVE(double notaAVE){
      this.notaAVE = notaAVE;
    }
    public void avaliarnotaAV1(double notaAV1){
      this.notaAV1 = notaAV1;
    }
    public void avaliarnotaAV2(double notaAV2){
      this.notaAV2 = notaAV2;

      System.out.println("Se a soma de notaAV1 e notaAV2 for maior ou igual a 60 pontos, o aluno é Aprovado");
    }
  
  }
}