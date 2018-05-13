
package testclientews;

import clientews.servicio.ServicioSumarImpService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioUno {
    public static void main(String[] args){
        ServicioSumarWS servicioSumar = new ServicioSumarImpService().getServicioSumarImpPort();
        System.out.println("Bienvenido a la calculadora Numero 1");
        int x = 26;
        int y = 7;
        System.out.println("Sumar: " + "Numero 1: " + x + "Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.sumar(x, y));
        System.out.println("Fin de la suma");
        
        System.out.println("Restar: " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.restar(x, y));
        System.out.println("Fin de la resta");
        
        System.out.println("Multiplicación:  " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.multiplicar(x, y));
        System.out.println("Fin de la multiplicación");
        
        System.out.println("División: " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.dividir(x, y));
        System.out.println("Fin de la división");
        
        System.out.println("Porcentaje: " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.porcentaje(x, y) + "%");
        System.out.println("Fin del porcentaje");
        
        System.out.println("Memoria: " + "Numero 1: " + x + " Numero dos: " + y);
        System.out.println("Resultado: " + servicioSumar.promedio(x, y));
        System.out.println("Fin de la Memoria");
        
    }
}
