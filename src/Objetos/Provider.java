package Objetos;

import javax.swing.JOptionPane;

public class Provider {
	
	int id_prov,ni_prov,ne_prov,cp_prov,status,ax;
	int i;
	String name_prov,ap_prov, am_prov,tel_prov,mail_prov,street_prov;
	
	public Provider() {
		
	}
	public Provider(int id_prov,String name_prov,String ap_prov, String am_prov, String tel_prov,String mail_prov,
                String street_prov,int ni_prov,int ne_prov,int cp_prov,int status) {
		this.id_prov=id_prov;
                this.name_prov=name_prov;
		this.ap_prov=ap_prov;
                this.am_prov=am_prov;
		this.tel_prov=tel_prov;
		this.mail_prov=mail_prov;
		this.street_prov=street_prov;
		this.ni_prov=ni_prov;
		this.ne_prov=ne_prov;
		this.cp_prov=cp_prov;
		this.status=status;
	}
	public int getId_prov() {
		return id_prov;
	}
	public void setId_prov(int id_prov) {
		this.id_prov = id_prov;
	}
	public int getNi_prov() {
		return ni_prov;
	}
	public void setNi_prov(int ni_prov) {
		this.ni_prov = ni_prov;
	}
	public int getNe_prov() {
		return ne_prov;
	}
	public void setNe_prov(int ne_prov) {
		this.ne_prov = ne_prov;
	}
	public int getCp_prov() {
		return cp_prov;
	}
	public void setCp_prov(int cp_prov) {
		this.cp_prov = cp_prov;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getName_prov() {
		return name_prov;
	}
	public void setName_prov(String name_prov) {
		this.name_prov = name_prov;
	}
	public String getAp_prov() {
		return ap_prov;
	}
	public void setAp_prov(String ap_prov) {
		this.ap_prov = ap_prov;
	}
	public String getAm_prov() {
		return am_prov;
	}
	public void setAm_prov(String am_prov) {
		this.am_prov = am_prov;
	}
        public String getTel_prov() {
		return tel_prov;
	}
	public void setTel_prov(String tel_prov) {
		this.tel_prov = tel_prov;
	}
	public String getMail_prov() {
		return mail_prov;
	}
	public void setMail_prov(String mail_prov) {
		this.mail_prov = mail_prov;
	}
	public String getStreet_prov() {
		return street_prov;
	}
	public void setStreet_prov(String street_prov) {
		this.street_prov = street_prov;
	}
	
	public  Provider newprov(int id_prov,String name_prov,String ap_prov,String am_prov,String tel_prov,String mail_prov,
                String street_prov,int ni_prov,int ne_prov,int cp_prov,int status) {
		this.setName_prov(name_prov);
		this.setAp_prov(ap_prov);
		this.setAm_prov(am_prov);
                this.setTel_prov(tel_prov);
		this.setMail_prov(mail_prov);
		this.setStreet_prov(street_prov);
		this.setId_prov(id_prov);
		this.setNi_prov(ni_prov);
		this.setNe_prov(ne_prov);
		this.setCp_prov(cp_prov);
		this.setStatus(status);
                
		return this;
	}
        
	public Provider[] delete(Provider[] arre, int id){
        ax=0;
        Provider obj =new Provider();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getId_prov()==id){
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
    
    public Provider Search(Provider[] arre,int id) {
	ax=0;
        Provider obj =new Provider();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getId_prov()==id){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro este proveedor");
        }
        return obj;
    }
    
    public Provider[] Update(Provider[] arre,int id_prov,String name_prov,String ap_prov,String am_prov,
            String tel_prov,String mail_prov,
                String street_prov,int ni_prov,int ne_prov,int cp_prov,int status){
        ax=0;
        Provider obj = new Provider();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getId_prov()==id_prov){
                    obj=arre[i];
                    obj=this.newprov(id_prov, name_prov, ap_prov,am_prov,
                            tel_prov, mail_prov, street_prov, ni_prov, ne_prov, cp_prov, status);
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
    
    
    /*mostrar
    public String toString() {
		StringBuilder sr = new StringBuilder();
		sr.append("\n id: " + id_prov);
		sr.append("\n nombre: " + name_prov);
		sr.append("\n apellido paterno: " + ap_prov);
		sr.append("\n apellido paterno: " + am_prov);
                sr.append("\n telefono: " + tel_prov);
                sr.append("\n email: " + mail_prov);
                sr.append("\n calle: " + street_prov);
                sr.append("\n no. exterior: " + ne_prov);
                sr.append("\n no. interior: " + ni_prov);
                sr.append("\n codigo postal: " + cp_prov);
                sr.append("\n status: " + status);
                
		return sr.toString();
	}
	
	public void mostrar(Provider arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
			System.out.println(arr[i]);
			}
		}
	}*/
}
