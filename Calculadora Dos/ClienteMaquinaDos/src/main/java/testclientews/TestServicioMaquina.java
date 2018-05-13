
package testclientews;

import clientews.servicio.ServicioMaquinaDosWS;
import clientews.servicio.ServicioImplService;


public class TestServicioMaquina {
    
    public static void main (String[] args){
        ServicioMaquinaDosWS servicioCalculate = new ServicioImplService().getServicioImplPort();
        System.out.println("Bienvenido a la calculadora Numero 2");
        int x = 50;
        int y = 29;
        System.out.println("Potencia: " + "Numero 1: " + x + "Numero dos: " + y);
        System.out.println("Resultado: " + servicioCalculate.potencia(x, y));
        System.out.println("Fin de la potencia");
        
        System.out.println("Raiz " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioCalculate.raiz(x, y));
        System.out.println("Fin de la raiz");
        
        System.out.println("Seno  " + "Numero 1: " + x );
        System.out.println("Resultado: " + servicioCalculate.seno(x));
        System.out.println("Fin del calculo seno");
        
        System.out.println("Coseno " + "Numero 1: " + x);
        System.out.println("Resultado: " + servicioCalculate.coseno(x));
        System.out.println("Fin del calculo coseno");
        
        System.out.println("Tangente: " + "Numero 1: " + x);
        System.out.println("Resultado: " + servicioCalculate.tangente(x));
        System.out.println("Fin del calculo tangente");
        
        System.out.println("Invertidas: " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioCalculate.invertidas(x, y));
        System.out.println("Fin de la invertida");
    }
    
}
