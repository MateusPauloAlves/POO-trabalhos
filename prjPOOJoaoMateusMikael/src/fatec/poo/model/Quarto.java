
package fatec.poo.model;

/**
 * @author mikae
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;

    public Quarto(String tipo, double valorDiaria) {
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }

    public void reservar(){
        this.situacao = true;
    }
    
    public double liberar(int dias){
        this.reservar();
        double valorHospedagem = dias * valorDiaria;
        totalFaturado =+ valorDiaria;
        return valorHospedagem;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    
}
