
package clientews.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Porcentaje_QNAME = new QName("http://beans/", "porcentaje");
    private final static QName _Dividir_QNAME = new QName("http://beans/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://beans/", "dividirResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://beans/", "multiplicar");
    private final static QName _Restar_QNAME = new QName("http://beans/", "restar");
    private final static QName _Sumar_QNAME = new QName("http://beans/", "sumar");
    private final static QName _Promedio_QNAME = new QName("http://beans/", "promedio");
    private final static QName _SumarResponse_QNAME = new QName("http://beans/", "sumarResponse");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://beans/", "multiplicarResponse");
    private final static QName _PorcentajeResponse_QNAME = new QName("http://beans/", "porcentajeResponse");
    private final static QName _PromedioResponse_QNAME = new QName("http://beans/", "promedioResponse");
    private final static QName _RestarResponse_QNAME = new QName("http://beans/", "restarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link PorcentajeResponse }
     * 
     */
    public PorcentajeResponse createPorcentajeResponse() {
        return new PorcentajeResponse();
    }

    /**
     * Create an instance of {@link PromedioResponse }
     * 
     */
    public PromedioResponse createPromedioResponse() {
        return new PromedioResponse();
    }

    /**
     * Create an instance of {@link Promedio }
     * 
     */
    public Promedio createPromedio() {
        return new Promedio();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link Porcentaje }
     * 
     */
    public Porcentaje createPorcentaje() {
        return new Porcentaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Porcentaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "porcentaje")
    public JAXBElement<Porcentaje> createPorcentaje(Porcentaje value) {
        return new JAXBElement<Porcentaje>(_Porcentaje_QNAME, Porcentaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promedio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "promedio")
    public JAXBElement<Promedio> createPromedio(Promedio value) {
        return new JAXBElement<Promedio>(_Promedio_QNAME, Promedio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorcentajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "porcentajeResponse")
    public JAXBElement<PorcentajeResponse> createPorcentajeResponse(PorcentajeResponse value) {
        return new JAXBElement<PorcentajeResponse>(_PorcentajeResponse_QNAME, PorcentajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromedioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "promedioResponse")
    public JAXBElement<PromedioResponse> createPromedioResponse(PromedioResponse value) {
        return new JAXBElement<PromedioResponse>(_PromedioResponse_QNAME, PromedioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "restarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

}
