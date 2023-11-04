package fatec.poo.model;

import java.util.ArrayList;



public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto ;
    
    //atributos de multiplicidade 1 para muitos
    private ArrayList<Registro> registros;

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        registros = new ArrayList<>();
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }
  
    //métodos adicionais para a multiplicidade
    public void setRegistro(Registro r) {
        registros.add(r);
    }
}
