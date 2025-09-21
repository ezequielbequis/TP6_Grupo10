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
        
        manager.agregar(new Producto(1001,"Arroz Integral", 2500, Categoria.COMESTIBLE, 100));
        manager.agregar(new Producto(1002,"Detergente Líquido", 3500,Categoria.LIMPIEZA , 50));
        manager.agregar(new Producto (1003, "Perfume Floral", 5600, Categoria.PERFUMERIA, 25));
        manager.agregar(new Producto(1004, "Aceite de Oliva Extra Virgen",8000,Categoria.COMESTIBLE , 75));
        manager.agregar(new Producto(1004, "Shampoo Anticaspa",4500, Categoria.PERFUMERIA, 30));
        
        System.out.println("Buscar por nombre 'note': ");
        for (Producto p :manager.buscarProductoPorNombre("note")){
            System.out.println(p.getDescripcion());
        
        }
        
        System.out.println("\n Buscar por rubro 'Perfumeria': ");
        for (Producto p : manager.buscarProductoPorRubro(Categoria.PERFUMERIA)){
            System.out.println(p.getDescripcion());
        }
        
        System.out.println("\n Buscar por precio entre 5000 y 60000: ");
        for(Producto p : manager.buscarPorPrecio(5000, 60000)){
            System.out.println(p.getDescripcion() + " - $" + p.getPrecio());
        
        }
        System.out.println("\n Eliminar producto 102:");
        manager.eliminar(102);
        
        System.out.println("\n Lista completa: ");
        for(Producto p : manager.obtenerTodos()){
            System.out.println(p.getCodigo() + " - " + p.getDescripcion());
        
        }
    }
}
