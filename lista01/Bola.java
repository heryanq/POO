/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

public class Bola {
    private String cor;
    private int tamanho;
    private String material;

    public Bola(String xcor, int xtamanho, String xmaterial) {
        this.cor = xcor;
        this.tamanho = xtamanho;
        this.material = xmaterial;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
