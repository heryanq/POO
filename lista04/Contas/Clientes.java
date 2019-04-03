package Contas;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    
    private String nome;
    private String cpf;
    private List contas;

    public Clientes(String xnome, String xcpf) {
        this.nome = xnome;
        this.cpf = xcpf;
        contas = new ArrayList<CCorrente>();
    }

    public void addContas(CCorrente conta) {
        contas.add(conta);
    }
    
    public List getContas() {
        return contas;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    @Override
    public String toString() {
        return (this.nome + ": ");
    }
    
    public String imprimaClientes() {
        if (this.contas.size() < 1) {
            System.out.println(getNome() + ": " + "Não há contas para esse cliente ainda");
        }
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(getNome() + ": " + contas.get(i));
        }
        return "";
    }
    
}
