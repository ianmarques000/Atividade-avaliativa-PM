
package Clinica;

public class Atendimento {

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeAnimal
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * @param nomeAnimal the nomeAnimal to set
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the nomeTutor
     */
    public String getNomeTutor() {
        return nomeTutor;
    }

    /**
     * @param nomeTutor the nomeTutor to set
     */
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Atendimento(int codigo, String nomeAnimal, String especie, String nomeTutor, String data, String horario, String status, String observacoes) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.status = status;
        this.observacoes = observacoes;
    }
    private int codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String status;
    private String observacoes;
    
    public void exibirAtendimento(){
    System.out.println(codigo + nomeAnimal); 
    }
}
