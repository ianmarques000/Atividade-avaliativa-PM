package Clinica;

public class Veterinario{
    
    private String nome;
    private String CPF;
    private String Especialidade;
    private String Telefone;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Especialidade
     */
    public String getEspecialidade() {
        return Especialidade;
    }

    /**
     * @param Especialidade the Especialidade to set
     */
    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public Veterinario(String nome, String CPF, String Especialidade, String Telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.Especialidade = Especialidade;
        this.Telefone = Telefone;
    }
    
    

}