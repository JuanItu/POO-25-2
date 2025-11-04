/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocodelembretes;

/**
 *
 * @author Felipe Marques
 */
public class Lembrete {
    private String nome;
    private String descricao;
    private Data data;
    
    public Lembrete(String nome, String descricao, Data data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }
    
    public void imprimir() {
        System.out.println("#########################################");
        System.out.println("Nome: " + nome + " - Data: " + data.getData());
        System.out.println("Descrição: " + descricao);
        System.out.println("#########################################");
    }
    
    public boolean dataEhIgual(Data data) {
        return this.data.dataEhIgual(data);
    }
    
    public boolean nomeContemSubstring(String substr) {
        if (this.nome.contains(substr))
            return true;
        
        return false;
    }
}
