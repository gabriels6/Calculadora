/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Gabriel
 */
public class Calculos {
    private Double Total = 0.0;
    private Double Numero;
    private String Operacao = "";
    
    //Métodos de cálculo
    
    
    public void Calcular(){
        
        String Operacao = getOperacao();
        
        if(Operacao.equals("Soma")){
        
            setTotal(Total += Numero); 
            
        }else if(Operacao.equals("Subtracao")){
            
            setTotal(Total -= Numero);
            
        }else if(Operacao.equals("Multi")){
            
            setTotal(Total *= Numero);
            
        }else if(Operacao.equals("Divi")){
            if(Numero != 0)setTotal(Total /- Numero);
        }

    }
       
    
    
    //Getters and Setters

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Double getNumero() {
        return Numero;
    }

    public void setNumero(Double Numero) {
        this.Numero = Numero;
    }

    public String getOperacao() {
        return Operacao;
    }

    public void setOperacao(String Operacao) {
        this.Operacao = Operacao;
    }
    
    
    
    
    
}
