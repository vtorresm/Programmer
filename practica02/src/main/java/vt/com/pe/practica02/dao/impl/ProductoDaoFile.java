package vt.com.pe.practica02.dao.impl;

import vt.com.pe.practica02.beans.Producto;
import vt.com.pe.practica02.dao.ProductoDao;
import vt.com.pe.practica02.util.ProductoOrdenPorNombre;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Victor
 */
public class ProductoDaoFile implements ProductoDao{

    private List<Producto> lProducto;

    public ProductoDaoFile() {
        lProducto = new ArrayList<>();
    }

    @Override
    public void create(Producto t) {
        if(find(t.getId())==null){
            lProducto.add(t);
            grabarProductos();
        }
    }

    @Override
    public Producto find(Object id) {
        leerProductos();
        for(Producto producto:lProducto){
            if(producto.getId()==(int)id)
                return producto;
        }
        return null;
    }

    @Override
    public List<Producto> findAll() {
        leerProductos();
        return lProducto;
    }

    @Override
    public void update(Producto t) {
        for(int ind=0; ind<lProducto.size(); ind++){
            if(lProducto.get(ind).getId()==t.getId()){
                lProducto.set(ind,t);
                grabarProductos();
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lProducto.remove(find(id));
        grabarProductos();
    }
    
     @Override
    public List<Producto> filterByTipoProducto(String tipo) {
        leerProductos();
        List<Producto> subList=new ArrayList<>();
        for(Producto a:lProducto){
            if(a.getTipo().equals(tipo))
                subList.add(a);
        }
        return subList;
    }


    @Override
    public List<Producto> orderByNombre() {
        leerProductos();
        Comparator<Producto> sortName = new ProductoOrdenPorNombre();
         Collections.sort(lProducto, sortName);  
        return lProducto;
    }
    
    private void grabarProductos(){
        String linea;
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("productos.txt"))) {
            for(Producto producto:lProducto){
                linea = producto.getId()+","+producto.getTipo()+","+
                        producto.getDescripcion()+","+producto.getPrecio()+","+
                        producto.getStock_actual()+","+producto.getStock_final()+","+
                        producto.getUnid_medida();
                bufOutput.write(linea);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("[grabar]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo grabar productos.txt: " + e);
        }
    }
    
    private void leerProductos(){
        try (BufferedReader bufInput = new BufferedReader(new FileReader("productos.txt"))) {
            String linea;
            lProducto.clear();
            Producto producto;
            while ((linea = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea,",");
                producto = new Producto();
                producto.setId(Integer.parseInt(tokens.nextToken().trim()));
                producto.setTipo(tokens.nextToken().trim());
                producto.setDescripcion(tokens.nextToken().trim());
                producto.setPrecio(Double.parseDouble(tokens.nextToken().trim()));
                producto.setStock_actual(Integer.parseInt(tokens.nextToken().trim()));
                producto.setStock_final(Integer.parseInt(tokens.nextToken().trim()));
                producto.setUnid_medida(tokens.nextToken().trim());
                lProducto.add(producto);
            }
        } catch (FileNotFoundException f) {
            System.out.println("[leer]Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("No se pudeo leer productos.txt: " + e);
        }
    }
}
