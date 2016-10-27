
package venta;


public class Cliente {
    
    int codigo;
    String razon_social;

    public Cliente(int codigo, String razon_social) {
        this.codigo = codigo;
        this.razon_social = razon_social;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
    
    
    
}
