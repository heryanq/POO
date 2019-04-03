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
public class TV {
    private int canal;
    private int volume;
    private String erroCanal;
    private String erroVolumeMaximo;
    private String erroVolumeMinimo;

    public TV(int xcanal, int xvolume) {
        this.canal = xcanal;
        this.volume = xvolume;
        this.erroCanal = "Canal não existente";
        this.erroVolumeMaximo = "Volume máximo atingido";
        this.erroVolumeMinimo = "Volume mínimo atingido";
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String escolherCanal() {
        if (this.canal > 0 && this.canal < 500) {
            System.out.println(this.canal);
        }
        return this.erroCanal;
    }
    
    public String aumentarVolume(int acrescimo) {
        if (this.volume + acrescimo < 0) {
            return this.erroVolumeMinimo; 
        } else if (this.volume + acrescimo > 100) {
            return this.erroVolumeMinimo;
        }
        else {
            System.out.println(this.volume + acrescimo);
        }  
        return null;
    }
        

    public String abaixarVolume(int decrescimo) {
        if (this.volume + decrescimo < 0) {
            return this.erroVolumeMinimo; 
        } else if (this.volume + decrescimo > 100) {
            return this.erroVolumeMinimo;
        }
        else {
            System.out.println(this.volume + decrescimo);
            return null;
        }
    }
}
