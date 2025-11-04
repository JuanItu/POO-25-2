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
class Data {
    private byte dia;
    private byte mes;
    private short ano;
    
    public Data(byte d, byte m, short a) {
        dia = d;
        mes = m;
        ano = a;
    }
    
    public byte getDia() {
        return dia;
    }
    
    public byte getMes() {
        return mes;
    }
    
    public short getAno() {
        return ano;
    }
    
    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public boolean dataEhIgual(Data data) {
        if (this.getDia() == data.getDia() &&
            this.getMes() == data.getMes() &&
            this.getAno() == data.getAno())
            return true;
        
        return false;
    }
}
