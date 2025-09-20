/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo10_tp6;

/**
 *
 * @author Grupo10 TP6 Altamirano Karina Gianfranco Antonacci Matías Bequis
 * Marcos Ezequiel Dave Natalia Quiroga Dorzan Alejo Franzinni Tatiana
 */
public class TestProductoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductoManager manager = new ProductoManager();
        
        manager.agregar(new Producto(1001,"Arroz Integral","comestible", 2500, 100));
        manager.agregar(new Producto(1002,"Detergente Líquido", "Limpieza",3500, 50));
        manager.agregar(new Producto (1003, "Perfume Floral", "Perfumería", 5600, 25));
        manager.agregar(new Producto(1004, "Aceite de Oliva Extra Virgen","Comestible",8000, 75));
        manager.agregar(new Producto(1004, "Shampoo Anticaspa","Perfumería",4500, 30));
        
        System.out.println("Buscar por nombre 'note': ");
        for (Producto p :manager.buscarProductoPorNombre("note")){
            System.out.println(p.getNombre());
        
        }
        
        System.out.println("\n Buscar por rubro 'Periféricos': ");
        for (Producto p : manager.buscarProductoPorRubro("Periféricos")){
            System.out.println(p.getNombre());
        }
        
        System.out.println("\n Buscar por precio entre 5000 y 60000: ");
        for(Producto p : manager.buscarPorPrecio(5000, 60000)){
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        
        }
        System.out.println("\n Eliminar producto 102:");
        manager.eliminar(102);
        
        System.out.println("\n Lista completa: ");
        for(Producto p : manager.obtenerTodos()){
            System.out.println(p.getCodigo() + " - " + p.getNombre());
        
        }
    }
}
