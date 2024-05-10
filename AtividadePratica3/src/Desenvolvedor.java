

public class Desenvolvedor extends Funcionario implements Trabalhavel  {
    
    private String lingdomina;

   

    public Desenvolvedor() {
        
    }



    public Desenvolvedor(String nome, String matricula, String lingdomina) {
        super(nome, matricula);
        this.lingdomina = lingdomina;
    }

    
    public String getLingdomina() {
        return lingdomina;
    }



    public void setLingdomina(String lingdomina) {
        this.lingdomina = lingdomina;
    }

    
    @Override
    public float calcularSalario() {
        float pagahora = 14.5f;
        float salario = 8 * pagahora;
        return salario;
    }

    @Override
    public String trabalhar() {
   
    return "Criando softwares";
    }


    @Override
    public String relatarProgresso() {
        
        return "Sites em desenvolvimento";
    }

    @Override
    public String toString() {

        return super.toString() + "\nLinguagens que domina"+ lingdomina +"\nPagamento: " + calcularSalario();
    }
}
