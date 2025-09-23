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

    private static TreeSet<Producto> productos;
    //private List <Producto> productos;

    public ProductoManager() {
        productos = new TreeSet<>();
        //productos = new ArrayList<>();
    }

    public boolean agregar(Producto p) {
        if (buscarPorCodigo(p.getCodigo()) != null) {
            return false;
        }
        productos.add(p);
        return true;
    }

    public boolean eliminar(int codigo) {
        Producto p = buscarPorCodigo(codigo);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public static boolean actualizar(Producto nuevo) {
        for (Producto aux : productos) {
            if (aux.getCodigo() == nuevo.getCodigo()) {
                productos.remove(aux);
                productos.add(nuevo);
                return true;
            }
        }
        return false;
    }

    public Producto buscarPorCodigo(int codigo) {

        for (Producto p : productos) {

            if (p.getCodigo() == codigo) {
                return p;
            }

        }
        return null;
    }

    public List<Producto> buscarProductoPorNombre(String texto) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getDescripcion().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Producto> buscarProductoPorRubro(Categoria categoria) {
        List<Producto> resultado = new ArrayList<>();
        if (categoria == null) {
            return resultado;
        }

        for (Producto p : productos) {
            if (p.getRubro() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Producto> buscarPorPrecio(double min, double max) {

        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public static Categoria devuelveCategoria(String categoria) {
        if (categoria == null) {
            return null;
        }
        categoria = categoria.toUpperCase();

        if (categoria.equals("COMESTIBLE")) {
            return Categoria.COMESTIBLE;
        } else if (categoria.equals("LIMPIEZA")) {
            return Categoria.LIMPIEZA;
        } else if (categoria.equals("PERFUMERIA")) {
            return Categoria.PERFUMERIA;
        }

        return null;
    }

    public TreeSet<Producto> obtenerTodos() {
        return productos;
    }
}
