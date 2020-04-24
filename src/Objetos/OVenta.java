
package Objetos;

import java.util.Date;
import javax.swing.JOptionPane;
import projecto.Venta;

public class OVenta {
    
    private int cve_vta, sta_vta;
    private String nomusu_cli;
    Product producto;
    int cantidad;
    double subtotal;
    static OVenta[] ventas= new OVenta[100];
    
    int posicion=0;
    
    public OVenta() {
    }
    
    public OVenta(int cve_vta, String nomusu_cli, int sta_vta, Product producto, int cantidad,double subtotal){
        this.cve_vta=cve_vta;
        this.nomusu_cli=nomusu_cli;
        this.sta_vta=sta_vta;
        this.producto=producto;
        this.cantidad=cantidad;
        this.subtotal=subtotal;
    }

    public int getCve_vta() {
        return cve_vta;
    }

    public void setCve_vta(int cve_vta) {
        this.cve_vta = cve_vta;
    }

    public int getSta_vta() {
        return sta_vta;
    }

    public void setSta_vta(int sta_vta) {
        this.sta_vta = sta_vta;
    }

    public String getNomusu_cli() {
        return nomusu_cli;
    }

    public void setNomusu_cli(String nomusu_cli) {
        this.nomusu_cli = nomusu_cli;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    
    
    
    
    
    public OVenta nuevaVenta(int cve_vta, String nomusu_cli, int sta_vta, Product product, int cantidad, double subtotal){
        this.setCve_vta(cve_vta);
        this.setNomusu_cli(nomusu_cli);
        this.setSta_vta(sta_vta);
        this.setProducto(product);
        this.setCantidad(cantidad);
        this.setSubtotal(subtotal);
        
        return this; 
    } 
       
    public OVenta Search(OVenta[] arre,int key) {
	int ax=0;
        OVenta obj =new OVenta();
        for(int i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getCve_vta()==key){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro la venta");
        }
        return obj;
    }
    
    
    public OVenta[] retornArre(){
        return ventas;
    }
    
    public void llenarArre(OVenta venta){
        OVenta venta2 = new OVenta();
        venta2=venta;
        ventas[posicion]=venta2;
        posicion++;
    }
    
    
    
    
    
    
}
