
package venta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Factura extends Comprobante{
    
    List<Producto> productos = new ArrayList();
    float total;
    Cliente cliente;
    
    public Factura(String tipo, Fecha fecha, Cliente cliente, int numero) {
        
        this.tipo = tipo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.numero = numero;
        
    }

    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProdustos(List<Producto> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
        setTotal(getTotal() + p.getPrecio()* p.getCantidad());
       

}
    public void mostrarProducto(){
        
        for (Producto p: productos){
            System.out.printf("\nCodigo: %d Descripcion: %s Precio: %5.2f Cantida = %d", p.getCodigo(), 
                   p.getDescripcion(), p.getPrecio(), p.getCantidad());
        
        }
        /*/
       Iterator <Producto> iter = productos.iterator();
       while (iter.hasNext()){
           Producto p = iter.next();
           System.out.printf("\nCodigo: %d Descripcion: %s Precio: %5.2f Cantida = %d", p.getCodigo(), 
                   p.getDescripcion(), p.getPrecio(), p.getCantidad());
           
                /*/
        
       }
    
    
    
    public void mostrar(){
        System.out.printf("Tipo: %s Numero: %d Fecha: %d/%d/%d", getTipo(), getNumero(), getFecha().getDia(), 
                getFecha().getMes(), getFecha().getAño());
        
        System.out.printf("\n Cliente:\n");
        System.out.printf("Codigo: %d   Razon Social: %s ", cliente.getCodigo(), cliente.getRazon_social());
        System.out.printf("\n Producto: \n");
        
        mostrarProducto();
        System.out.printf("\nTotal: %5.2f", getTotal());
    }
    
    
}
