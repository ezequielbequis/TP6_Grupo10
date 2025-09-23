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
public class Producto implements Comparable <Producto>{  /////agrega esto!!!!!!!!
    private int codigo;
    private String descripcion;
    private double precio;
    private Categoria rubro;
    private int stock;
    

    public Producto(int codigo, String descripcion, double precio, Categoria rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override   ///agrega esto!!!!!!!!
    public int compareTo(Producto t) {
        if (codigo == t.codigo){
            return 0;
        }else if (codigo > t.codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
}
