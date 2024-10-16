/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navegadorpilas;

import java.util.Stack;

/**
 *
 * @author renelobo
 */
public class HistorialNavegacion {
    
    private Stack<PaginaWeb> historial;
    private PaginaWeb paginaActual;

    public HistorialNavegacion() {
        historial = new Stack<PaginaWeb>();
    }
    
    public void navegar(String url, String titulo){
        if(paginaActual!=null){
            historial.push(paginaActual);
        }
        
        paginaActual = new PaginaWeb(url, titulo);
        System.out.println("navegando a "+paginaActual.toString());
        
    }
    
    public void atras(){
        if(!historial.isEmpty()){
           paginaActual =  historial.pop();
            //paginaActual = historial.peek();
            System.out.println("retrocediendo a "+paginaActual.toString());
        }
        else{
            System.out.println("no hay paginas para retroceder");
        }
    }
    
    public void mostrarEstadoActual(){
        System.out.println("pagina actual"+paginaActual.toString());
        System.out.println("historial "+historial);
        
     
    }
    
    
    
}
