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
public class bombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double quantidadeAbastecida;

    public double getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(double quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

    public bombaCombustivel(double quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

    public bombaCombustivel(String xtipoCombustivel, double xvalorLitro, double xquantidadeCombustivel) {
        this.tipoCombustivel = xtipoCombustivel;
        this.valorLitro = xvalorLitro;
        this.quantidadeCombustivel = xquantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    public int abastecerPorValor() {
        return (int) (this.valorLitro * this.quantidadeCombustivel);
    }
    
    public int abastecerPorLitro() {
        return (int) (this.quantidadeCombustivel / this.valorLitro);
    }
    
    public void alterarQuantidadeCombustivel() {
        this.quantidadeCombustivel -= this.quantidadeAbastecida;
    }
    
}
