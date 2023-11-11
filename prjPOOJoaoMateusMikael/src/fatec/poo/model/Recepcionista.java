/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author joao
 */
public class Recepcionista extends Pessoa {
    private int regFunc;
    private String turno;
    
    //atributos de multiplicidade
    private ArrayList<Registro> registros;

    public Recepcionista(int regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        registros = new ArrayList<>();
    }

    public void setTurno(String turno) {
        this.turno = turno ;
    }

    public int getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    
    //métodos para a multiplicidade
    public void addRegistro(Registro r) {
        registros.add(r);
    }
    
}
