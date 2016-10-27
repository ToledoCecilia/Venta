
package venta;

import java.util.ArrayList;
import java.util.List;


public class Producto {
    
    
    String descripcion;
    int codigo;
    float precio;
    int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public Producto(String descripcion, int codigo, float precio, int cantidad) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Producto(){}
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad+ '}';
    }
    
    
    
}
