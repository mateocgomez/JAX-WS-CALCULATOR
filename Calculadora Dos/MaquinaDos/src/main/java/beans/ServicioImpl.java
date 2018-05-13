/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import static java.lang.Math.sqrt;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService (endpointInterface = "beans.ServicioMaquinaDosWS")

public class ServicioImpl implements ServicioMaquinaDosWS {

    @Override
    public int potencia(int a, int b) {
       return a^b;
    }

    @Override
    public int raiz(int a, int b) {
        return (int) sqrt(a+b);
    }

    @Override
    public double seno(double a) {
        return Math.sin(a);
    }

    @Override
    public double coseno(double a) {
        return Math.cos(a);
    }

    @Override
    public double tangente(double a) {
        return Math.tan(a);
    }

    @Override
    public int invertidas(int a, int b) {
        return a^-1 + b;
    }
    
}
