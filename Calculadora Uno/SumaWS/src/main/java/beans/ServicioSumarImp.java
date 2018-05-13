package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarImp implements ServicioSumarWS {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
    @Override
    public int restar(int a, int b){
        return a - b;
    }
    
    @Override
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    @Override
    public int dividir(int a, int b){
        return a / b;
    }
    
    @Override
    public int porcentaje(int a, int b){
        return (a + b)*100;
    }
    
    @Override
    public int promedio(int a, int b){
        return (a+b)/2;
    }
}
