package Classes;

import Formularios.frmLogin;

public class SistemaVenda{
    
    public static void main(String[]args){
        Dados clsdados=new Dados();
        
        frmLogin Login=new frmLogin();
        Login.setDados(clsdados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        
        
    }
   
    
}



