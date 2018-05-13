
package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface ServicioMaquinaDosWS {
    @WebMethod
    public int potencia(int a, int b);
    
    @WebMethod
    public int raiz(int a, int b);
    
     @WebMethod
    public double seno(double a);
    
     @WebMethod
    public double coseno(double a);
    
    @WebMethod
    public double tangente(double a);
    
    @WebMethod
    public int invertidas(int a, int b);
    
}
