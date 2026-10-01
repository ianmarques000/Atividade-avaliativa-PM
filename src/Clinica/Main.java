package Clinica;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cadastro de atendimento, Comece pelo nome do animal: ");   
        String nomeAnimal = s.nextLine();
        System.out.println("Espécie do animal: ");   
        String especie = s.nextLine();
        System.out.println("Nome do Tutor: ");   
        String nomeTutor = s.nextLine();
        System.out.println("Data: ");   
        String data = s.nextLine();
        System.out.println("Horario: ");   
        String horario = s.nextLine();
        System.out.println("Observações: ");   
        String observacoes = s.nextLine();
        int codigo = 0;
        String status;
        
        Atendimento atendimento = new Atendimento(codigo = 0, nomeAnimal, especie, nomeTutor, data, horario, status = "em andamento", observacoes);
        
        System.out.println("Preencha as informações do veterinário, comece pelo nome: ");   
        String nome = s.nextLine();
        System.out.println("CPF: "); 
        String CPF = s.nextLine();
        System.out.println("Especialidade: "); 
        String Especialidade = s.nextLine();   
        System.out.println("Telefone: "); 
        String telefone = s.nextLine();
        
        Veterinario veterinario = new Veterinario(nome, CPF, Especialidade, telefone);
        
        System.out.println("Preencha as informações do sala, comece pelo numero: ");   
        String numero = s.nextLine();
        System.out.println("Bloco: "); 
        String bloco = s.nextLine();
        System.out.println("Capacidade: "); 
        int capacidadeMaxima = s.nextInt();   
        System.out.println("Tipo: "); 
        String tipo = s.nextLine();
        ArrayList<Atendimento> atendimentos = new ArrayList<>();
        atendimentos.add(atendimento);
        Sala sala = new Sala(numero, bloco, capacidadeMaxima, tipo, veterinario, atendimentos);
        sala.exibirAtendimentos();
    }
    
}
