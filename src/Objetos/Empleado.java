package Objetos;

import javax.swing.JOptionPane;

public class Empleado extends User{
    User user=new User();
        public Empleado() {
	
	}
        
	public Empleado(int id,String nom, String ap,String am,String tel,String email,
                int ni,int ne,String calle,int cp,String rfc,
                String name_user,String pass_user,String type_user,int status) {
		
            super(id, nom, ap, am, tel, email, ni, ne, calle, cp, rfc, name_user, pass_user, type_user, status);
            
	}
        

        
        
}
