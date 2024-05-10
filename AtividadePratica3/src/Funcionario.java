
public abstract class Funcionario {
    
    private String nome;
    private String matricula;
    

    
    public Funcionario(){

    }
    
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    @Override
    public String toString() {
       
        return "\nNome: " + nome + "\nMatricula: " + matricula;
    }

    public abstract float calcularSalario();
    
    
}
