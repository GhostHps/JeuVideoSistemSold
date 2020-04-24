package Objetos;


import javax.swing.JOptionPane;

public class Product {
	
	int key_prod,stock,power, status;
	Gender genero;
	Marca marca;
	Provider proveedor;
	TipeProd tipo_prod;
	
	String name_prod,tipe_con,class_game,est_game;
	double price,cost;
	//extras
	//int key_gen,key_brand,key_tp,id_prov;
	int i, ax;
	
	public Product() {
		
	}
        
        //cve_gen,cve_mar,cve_tp,id_prov,sta_prod)
	public Product(int key_prod,String name_prod,double price,double cost,int stock,
                int power,String tipe_con,String class_game,String est_game,
                Gender genero,Marca marca,Provider proveedor,TipeProd tipo_prod, int status) {
		this.key_prod=key_prod;
                this.name_prod=name_prod;
                this.price=price;
		this.cost=cost;
		this.stock=stock;
		this.power=power;
		this.tipe_con=tipe_con;
		this.class_game=class_game;
		this.est_game=est_game;
		this.genero=genero;
                this.marca=marca;
                this.proveedor=proveedor;
                this.tipo_prod=tipo_prod;
                this.status=status;
	}
	public int getKey_prod() {
		return key_prod;
	}
	public void setKey_prod(int key_prod) {
		this.key_prod = key_prod;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

	public String getName_prod() {
		return name_prod;
	}
	public void setName_prod(String name_prod) {
		this.name_prod = name_prod;
	}

	public String getTipe_con() {
		return tipe_con;
	}
	public void setTipe_con(String tipe_con) {
		this.tipe_con = tipe_con;
	}

	public String getClass_game() {
		return class_game;
	}
	public void setClass_game(String class_game) {
		this.class_game = class_game;
	}

	public String getEst_game() {
		return est_game;
	}
	public void setEst_game(String est_game) {
		this.est_game = est_game;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

    public Gender getGenero() {
        return genero;
    }
    public void setGenero(Gender genero) {
        this.genero = genero;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Provider getProveedor() {
        return proveedor;
    }
    public void setProveedor(Provider proveedor) {
        this.proveedor = proveedor;
    }

    public TipeProd getTipo_prod() {
        return tipo_prod;
    }
    public void setTipo_prod(TipeProd tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
	
        
        
	public Product newproduct(int key_prod,String name_prod,double price,double cost,int stock,
                int power,String tipe_con,String class_game,String est_game,
                Gender genero,Marca marca,Provider proveedor,TipeProd tipo_prod, int status) {
		
		this.setKey_prod(key_prod);
                this.setName_prod(name_prod);
                this.setPrice(price);
		this.setCost(cost);
		this.setStock(stock);
		this.setPower(power);
		this.setTipe_con(tipe_con);
		this.setClass_game(class_game);
		this.setEst_game(est_game);
                this.setGenero(genero);
                //buscamos marca
                //devuelve un objeto marca
                //el objeto lo llamo desde los paramentros 
                //y este objeto se auto guardara en su this
                this.setMarca(marca);
                this.setProveedor(proveedor);
                this.setTipo_prod(tipo_prod);
                this.setStatus(status);
		return this;
	}
	
        public Product[] delete(Product[] arre, int key_prod){
        ax=0;
        Product obj =new Product();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey_prod()==key_prod){
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
    
    public Product Search(Product[] arre,int key_prod) {
	ax=0;
        Product obj =new Product();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey_prod()==key_prod){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro este producto");
        }
        return obj;
    }
    
    public Product SearchNombre(Product[] arre,String Name_prod) {
	ax=0;
        Product obj =new Product();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getName_prod().equals(Name_prod)){
                    obj=arre[i];
                    ax=1;
                }
            }
        }
        if(ax==0){
            JOptionPane.showMessageDialog(null, "NO se encontro este producto");
        }
        return obj;
    }
    
    public Product[] Update(Product[] arre, int key_prod,String name_prod,double price,double cost,int stock,
                int power,String tipe_con,String class_game,String est_game,
                Gender genero,Marca marca,Provider proveedor,TipeProd tipo_prod, int status){
        ax=0;
        Product obj = new Product();
        for(i=0; i<arre.length; i++){
            if(arre[i]!=null){
                if(arre[i].getKey_prod()==key_prod){
                    obj=arre[i];
                    obj=this.newproduct(key_prod, name_prod, price, cost, stock, power, tipe_con, class_game, est_game,
                            genero, marca, proveedor, tipo_prod, status);
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
    
    public void descontar(){
        
    }
    
    /*mostrar
    public String toString() {
		StringBuilder sr = new StringBuilder();
		sr.append("\n Clave: " + key_prod);
		sr.append("\n nombre: " + name_prod);
                sr.append("\n precio: " + price);
                sr.append("\n costo: " + cost);
                sr.append("\n stock: " + stock);
                sr.append("\n potencia: " + power);
                sr.append("\n tipo de consola: " + tipe_con);
                sr.append("\n clasificacion: " + class_game);
                sr.append("\n estudio: " + est_game);
                sr.append("\n genero: " + genero);
                sr.append("\n marca: " + marca);
                sr.append("\n proveedor: " + proveedor);
                sr.append("\n tipo de producto: " + tipo_prod);
		sr.append("\n status: " + status);
		
		return sr.toString();
	}
	
	public void mostrar(Product arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
			System.out.println(arr[i]);
			}
		}
	}
        
        */
        
}
