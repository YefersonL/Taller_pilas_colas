/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navegadorpilas;

/**
 *
 * @author renelobo
 */
public class NavegadorPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HistorialNavegacion navegador = new HistorialNavegacion();
        navegador.navegar("www.google.com", "Google");
        navegador.navegar("www.wikipedia.com", "Wikipedia");
        navegador.navegar("www.youtube.com", "Youtube");
        
        navegador.mostrarEstadoActual();
        
        navegador.atras();
        
        navegador.mostrarEstadoActual();
        
        
        
    }
    
}
