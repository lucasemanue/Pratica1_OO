public class EmpregoFaculdade {
  private String nome;
  private double salario;
  private int horasAula;

  public EmpregoFaculdade(String nome, double salario, int horasAula){
    super();
    this.nome = nome;
    this.salario = salario;
    this.horasAula = horasAula;
    
  }
   double getGastos(){
  return this.salario + (this.horasAula*40);
  }

   String getInfo(){
   return "nome: " + this.nome + " com salário " + 
   this.salario + (this.salario*40);

     
       }
}