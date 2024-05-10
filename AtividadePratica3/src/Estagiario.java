


public class Estagiario extends Funcionario implements Trabalhavel{

    private int hrtran;
    private String supervisor;

    

    public Estagiario() {
   
    }


    public Estagiario(String nome, String matricula, int hrtran, String supervisor) {
        super(nome, matricula);
        this.hrtran = hrtran;
        this.supervisor = supervisor;
    }


    public int getHrtran() {
        return hrtran;
    }


    public void setHrtran(int hrtran) {
        this.hrtran = hrtran;
    }


    public String getSupervisor() {
        return supervisor;
    }


    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }


    @Override
    public float calcularSalario() {
        float pagahora = 7.67f;
        float salario = hrtran * pagahora;
        return salario;
    }

    @Override
public String trabalhar() {
    
    return "Trabalhando";
}



@Override
public String relatarProgresso() {
    
    return "O café está pronto";
}

@Override
    public String toString() {

        return super.toString() + "\nSupervisor: "+ supervisor + "\nPagamento: " + calcularSalario();
    }
    
}
