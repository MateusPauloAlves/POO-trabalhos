package fatec.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class Registro {
    //atributos
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    
    //atributos de multiplicidade 1
    private Hospede hospede;
    private Recepcionista recepcionista;
    private Quarto quarto;
    
    //atributo de multiplicidade 1..*
    private ArrayList<ServicoQuarto> servicoQuarto;
    
    //método construtor
    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        this.servicoQuarto = new ArrayList<>();
    }
    
    //métodos set e get
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }
    
    
    //outros métodos da classe
    public void reservarQuarto(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        hospede.setRegistro(this);
        this.quarto = quarto;
        quarto.reservar();
    }
    
    public double liberarQuarto() {
        int diasHospedados = (int) dataEntrada.until(dataSaida).getDays();
        double valorLiberacao = quarto.liberar(diasHospedados);
        
        double totalServicos = 0;
        for(int i = 0; i < servicoQuarto.size(); i++) {
            totalServicos += servicoQuarto.get(i).getValor();
        }
        
        return (valorLiberacao + (1 * hospede.getTaxaDesconto()/100) + totalServicos);
    }
    
    
    //métodos adicionais para multiplicidade
    public void addServicoQuarto(ServicoQuarto Q) {
        servicoQuarto.add(Q);
    }
    
}
