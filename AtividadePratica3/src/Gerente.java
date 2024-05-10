public class Gerente extends Funcionario implements Trabalhavel {
    private float bonus;
    private String equipe;

    

    public Gerente() {

    }

    public Gerente(String nome, String matricula, float bonus, String equipe) {
        super(nome, matricula);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public float calcularSalario() {
        float pagahora = 23.4f;
        float salario = bonus * 8 * pagahora;
        return salario;
    }

    @Override
    public String trabalhar() {

        return "Gerenciando funcionarios";
    }

    @Override
    public String relatarProgresso() {

        return "Trabalho qause feito";
    }

    @Override
    public String toString() {

        return super.toString() + "\nIntegrante da equipe "+ equipe +"\nPagamento: " + calcularSalario();
    }
}
