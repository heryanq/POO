/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

/**
 *
 * @author aluno
 */
public class Bichinho {

    private String nome;
    private Boolean fome;
    private Boolean saude;
    private int idade;

    public Bichinho(String xnome, Boolean xfome, Boolean xsaude, int xidade) {
        this.nome = xnome;
        this.fome = xfome;
        this.saude = xsaude;
        this.idade = xidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getFome() {
        return fome;
    }

    public void setFome(Boolean fome) {
        this.fome = fome;
    }

    public Boolean getSaude() {
        return saude;
    }

    public void setSaude(Boolean saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
