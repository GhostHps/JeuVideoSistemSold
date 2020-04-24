package Objetos;

import javax.swing.JOptionPane;

public class TipeProd {
	
	String name;
	int status,pos=0,i,key, ax;
	
	public TipeProd(int key,String name,int status) {
		this.key=key;
		this.name=name;
		this.status=status;
	}
	public TipeProd() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
public TipeProd nuevo(int key, String name, int status){
        this.setKey(key);
        this.setName(name);
        this.setStatus(status);
        
        return this;
    }
    
    //0 apagado 1 prendido
    public TipeProd[] delete(TipeProd[] arre, int key){
        ax=0;
        TipeProd obj =new TipeProd();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey()==key){
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
    
    public TipeProd Search(TipeProd[] arre,int key) {
	ax=0;
        TipeProd obj =new TipeProd();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey()==key){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro este tipo de producto");
        }
        return obj;
    }
    
    public TipeProd[] Update(TipeProd[] arre, int key, String name, int status){
        ax=0;
        TipeProd obj = new TipeProd();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey()==key){
                    obj=arre[i];
                    obj=this.nuevo(key, name, status);
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
		sr.append("\n Clave: " + key);
		sr.append("\n nombre: " + name);
		sr.append("\n status: " + status);
		
		return sr.toString();
	}
	
	public void mostrar(TipeProd arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
			System.out.println(arr[i]);
			}
		}
	}*/
}
