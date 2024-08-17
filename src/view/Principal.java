package view;

import models.Fisica;
import models.Juridica;
import models.Pessoa;

public class Principal {

    public static void main(String[] args) {
            Fisica fisica = new Fisica();
            Juridica juridica = new Juridica();
            
            fisica.setNome("Maria");
            fisica.setCpf("999999");
            fisica.setEndereco("Centro");
            fisica.setTelefone("213213");
            
            juridica.setNome("Maria");
            juridica.setCnpj("999999");
            juridica.setEndereco("Centro");
            juridica.setTelefone("213213");
   
    }
    
  
}
