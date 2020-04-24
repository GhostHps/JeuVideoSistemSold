
package Objetos;

import javax.swing.JOptionPane;

public class Marca {
    
    //insertar getters y setters
    private int clave;
    private String nombre;
    private int status;
    int i,ax;
    
    public Marca(){
        
    }
    
    public Marca(int clave, String nombre, int status){
        this.clave=clave;
        this.nombre=nombre;
        this.status=status;
    }
    
    public void setClave(int clave){
        this.clave=clave;
    }
    public int getClave(){
        return clave;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
    public Marca nuevo(int clave, String nombre, int status){
        this.setClave(clave);
        this.setNombre(nombre);
        this.setStatus(status);
        
        return this;
    }
    
    //0 apagado 1 prendido
    public Marca[] delete(Marca[] arre, int clave){
        ax=0;
        Marca obj =new Marca();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getClave()==clave){
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
    
    public Marca Search(Marca[] arre,int clave) {
	ax=0;
        Marca obj =new Marca();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getClave()==clave){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro esta marca");
        }
        return obj;
    }
    
    
        public Marca SearchNombre(Marca[] arre,String nom) {
	ax=0;
        Marca obj =new Marca();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getNombre().equals(nom)){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro esta marca");
        }
        return obj;
    }
    
    public Marca[] Update(Marca[] arre, int clave, String nombre, int status){
        ax=0;
        Marca obj = new Marca();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getClave()==clave){
                    obj=arre[i];
                    obj=this.nuevo(clave, nombre, status);
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
		sr.append("\n Clave: " + clave);
		sr.append("\n nombre: " + nombre);
		sr.append("\n status: " + status);
		
		return sr.toString();
	}
	
	public void mostrar(Marca arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
			System.out.println(arr[i]);
			}
		}
	}
        
*/

        
        
}
