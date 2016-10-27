
package venta;



public class Venta {

    
    public static void main(String[] args) {
        
        Fecha hoy = new Fecha(15,3,2015);
        Producto p1 = new Producto("Cafe con leche", 1, (float) 8, 2);
        Producto p2 = new Producto("Media Lunas", 2, (float) 2, 4);
        Cliente c = new Cliente(1, "Juana");
        Factura f = new Factura("F", hoy, c, 1);
        f.agregarProducto(p1);
        f.agregarProducto(p2);
        f.mostrar();
           
    }
    
}
