package view;


import models.Pessoa;

public class Principal {

    public static void main(String[] args) {
       
    Pessoa pessoa = new Pessoa(1,"Tereza");
    Pessoa pessoa2 = new Pessoa(2,"Joaquim");

    
    System.out.println(pessoa.getNome());
    System.out.println(pessoa2.getNome());
              
    }
    
  
}
