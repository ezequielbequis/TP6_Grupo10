/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo10_tp6;
import java.util.*;


/**
 *
 * @author Grupo10 TP6 Altamirano Karina Gianfranco Antonacci Matías Bequis
 * Marcos Ezequiel Dave Natalia Quiroga Dorzan Alejo Franzinni Tatiana
 */
public class ProductoManager {
    private List <Producto> productos;
    
    public ProductoManager (){
    
            productos = new ArrayList<>();
    
    }
 
    public boolean agregar (Producto p){
    
        if (buscarPorCodigo(p.getCodigo())!=null){
        
            return false;
        }
        productos.add(p);
        return true;
    }
    
    public boolean eliminar (int codigo){
        Producto p = buscarPorCodigo(codigo);
        if(p !=null){
            productos.remove(p);
            return true;
       }return false;
   }
    public boolean actualizar (Producto nuevo){
        for(int i= 0; i<productos.size(); i++) {
            if (productos.get(i).getCodigo()==nuevo.getCodigo()){
                productos.set(i, nuevo);
                return true;
            }
        
        }
        return false;
    }
    
        public Producto buscarPorCodigo(int codigo){
    
        for (Producto p : productos){
        
            if (p.getCodigo()==codigo){
                return p;
            }
        
        }
        return null;
     }
        
        public List <Producto> buscarProductoPorNombre(String texto){
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos){
            if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
            resultado.add(p);
            }
        }
        return resultado;
        }
    
    public List <Producto> buscarProductoPorRubro(String rubro){
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos){
            if (p.getRubro().equalsIgnoreCase(rubro)) {
            resultado.add(p);
            }
        }
        return resultado;
    
    }
    
    public List <Producto> buscarPorPrecio(double min, double max){
    
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos) {
            if(p.getPrecio()>=min && p.getPrecio()<=max){
                resultado.add(p);
            }
        }
        return resultado;
    }
    
    public List <Producto> obtenerTodos(){
        return new ArrayList<>(productos);
    
    }

}
