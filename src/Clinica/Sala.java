package Clinica;

import java.util.ArrayList;
public class Sala {

    /**
     * @return the atendimentos
     */
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    /**
     * @param atendimentos the atendimentos to set
     */
    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    /**
     * @return the veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * @param veterinario the veterinario to set
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    private String numero;
    private String bloco;
    private int capacidadeMaxima;
    private String tipo;
    private Veterinario veterinario;
    private ArrayList<Atendimento> atendimentos;

    public Sala(String numero, String bloco, int capacidadeMaxima, String tipo, Veterinario veterinario, ArrayList atendimentos) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMaxima = capacidadeMaxima;
        this.tipo = tipo;
        this.veterinario = veterinario;
        this.atendimentos = atendimentos;
    }
    
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bloco
     */
    public String getBloco() {
        return bloco;
    }

    /**
     * @param bloco the bloco to set
     */
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    /**
     * @return the capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * @param capacidadeMaxima the capacidadeMaxima to set
     */
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirAtendimentos(){
    for (Atendimento a: atendimentos)
        System.out.println(a);
    }
}
