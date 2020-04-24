package Objetos;

import javax.swing.JOptionPane;
import static projecto.PEmpleado.arre;

public class User {
	
	String name_user,pass_user,type_user; 
	int status,i,ax;
        
        String nom,ap,am,tel,email,calle,rfc;
        int id,ni,ne,cp;
        
        public User usuarioactual;
        
       public static  User[] users = new User[200];
        
        //nom_cli,ap_cli,am_cli,tel_cli,email_cli,ni_cli,ne_cli,calle_cli,cp_cli,rfc_cli
        
	public User() {
	
	}
	public User(int id,String nom, String ap,String am,String tel,String email,
                int ni,int ne,String calle,int cp,String rfc,
                String name_user,String pass_user,String type_user,int status) {
		
                this.id=id;
                this.nom=nom;
                this.ap=ap;
                this.am=am;
                this.tel=tel;
                this.email=email;
                this.ni=ni;
                this.ne=ne;
                this.calle=calle;
                this.cp=cp;
                this.rfc=rfc;
            
                this.name_user=name_user;
		this.pass_user=pass_user;
		this.type_user=type_user;
		this.status=status;
	}
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
        
	public String getPass_user() {
		return pass_user;
	}
	public void setPass_user(String pass_user) {
		this.pass_user = pass_user;
	}
        
	public String getType_user() {
		return type_user;
	}
	public void setType_user(String type_user) {
		this.type_user = type_user;
	}
        
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getAp() {
            return ap;
        }
        public void setAp(String ap) {
            this.ap = ap;
        }

        public String getAm() {
            return am;
        }
        public void setAm(String am) {
            this.am = am;
        }

        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getCalle() {
            return calle;
        }
        public void setCalle(String calle) {
            this.calle = calle;
        }

        public String getRfc() {
            return rfc;
        }
        public void setRfc(String rfc) {
            this.rfc = rfc;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public int getNi() {
            return ni;
        }
        public void setNi(int ni) {
            this.ni = ni;
        }

        public int getNe() {
            return ne;
        }
        public void setNe(int ne) {
            this.ne = ne;
        }

        public int getCp() {
            return cp;
        }
        public void setCp(int cp) {
            this.cp = cp;
        }

        public User newUser(int id, String nom, String ap,String am,String tel,String email,
                    int ni,int ne,String calle,int cp,String rfc,
                    String name_user,String pass_user,String type_user,int status) {

                    this.setId(id);
                    this.setNom(nom);
                    this.setAp(ap);
                    this.setAm(am);
                    this.setTel(tel);
                    this.setEmail(email);
                    this.setNi(ni);
                    this.setNe(ne);
                    this.setCalle(calle);
                    this.setCp(cp);
                    this.setRfc(rfc);

                    this.setName_user(name_user);
                    this.setPass_user(pass_user);
                    this.setStatus(status);
                    this.setType_user(type_user);
                    return this;
        }

        public User[] delete(User[] arre, String name_user, int posicion){
        ax=0;
        User obj =new User();
        for(i=0; i<posicion; i++){
            if(arre[i]!=null){
                if(arre[i].getName_user().equals(name_user)){
                    if(arre[i].getStatus()==1){
                        obj=arre[i];
                        obj.setStatus(0);
                        arre[i]=obj;
                        ax=1;
                    }else{
                        JOptionPane.showMessageDialog(null, "esta eliminado");
                        ax=2;
                    }
                    i=arre.length;
                }
            }
        }
        if(ax==1){
            JOptionPane.showMessageDialog(null, "se elimino correctamente");
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se elimino");
        }
        return arre;
    }

        public User Search(User[] arre,String name_user) {
            ax=0;
            User obj =new User();
            for(i=0; i<arre.length; i++){
                if(arre[i]!=null){
                    if(arre[i].getName_user().equals(name_user)){
                        obj=arre[i];
                        ax=1;
                    }
                }
            }
            if(ax==0){
                JOptionPane.showMessageDialog(null, "NO se encontro este usuario");
            }
            return obj;
        }

        public User[] Update(User[] arre,int id, String nom, String ap,String am,String tel,String email,
                    int ni,int ne,String calle,int cp,String rfc,
                String name_user,String pass_user,String type_user,int status){
            ax=0;
            User obj = new User();
            for(i=0; i<arre.length; i++){
                if(arre[i]!=null){
                    if(arre[i].getName_user().equals(name_user)){
                        obj=arre[i];
                        obj=this.newUser(id, nom, ap, am, tel, email, ni, ne, calle, cp, rfc, name_user, pass_user, type_user, status);
                        arre[i]=obj;
                        ax=1;
                    }
                }
            }
            if(ax==1){
                JOptionPane.showMessageDialog(null, "se modificaron los datos correctamente");
            }
            return arre;
        }

        
        
        
        
        
        public  User[] llenarUsers(User usuario){
            int i=0;
            User usu = new User();
            while (i<users.length) {              
                if(users[i]==null) {
                usu=usuario;
                users[i]=usu;
		i=users.length;
                }
                i++;
            }
            return users;
        }
        
        public User logear(String nom_user, String pass_user){
            ax=0;
            User obj =new User();
            for(i=0; i<users.length; i++){
                if(users[i]!=null){
                    if(users[i].getName_user().equals(nom_user) && users[i].getPass_user().equals(pass_user)){
                        obj=users[i];
                        usuarioactual=users[i];
                        ax=1;
                    }
                }
            }
            if(ax==0){
                JOptionPane.showMessageDialog(null, "NO se encontro este usuario");
            }
            return obj;
        }

        
        
        /*mostrar
        public String toString() {
                    StringBuilder sr = new StringBuilder();
                    sr.append("\n Id: " + id);
                    sr.append("\n Nombre: " + nom);
                    sr.append("\n apellido paterno: " + ap);
                    sr.append("\n apellido materno: " + am);
                    sr.append("\n Telefono: " + tel);
                    sr.append("\n Email: " + email);
                    sr.append("\n No. exterior: " + ne);
                    sr.append("\n No. interior: " + ni);
                    sr.append("\n Calle: " + calle);
                    sr.append("\n CP: " + cp);
                    sr.append("\n RFC: " + rfc);

                    sr.append("\n Nombre de usuario: " + name_user);
                    sr.append("\n Password: " + pass_user);
                    sr.append("\n tipo de usuario: " + type_user);
                    sr.append("\n Status: " + status);

                    return sr.toString();
            }

        public void mostrar(User arr[]) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i]!=null) {
                System.out.println(arr[i]);
                }
            }
        }
*/
        
        
}
