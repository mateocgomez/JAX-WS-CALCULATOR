
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

    private final static QName _Coseno_QNAME = new QName("http://beans/", "coseno");
    private final static QName _InvertidasResponse_QNAME = new QName("http://beans/", "invertidasResponse");
    private final static QName _CosenoResponse_QNAME = new QName("http://beans/", "cosenoResponse");
    private final static QName _Seno_QNAME = new QName("http://beans/", "seno");
    private final static QName _Raiz_QNAME = new QName("http://beans/", "raiz");
    private final static QName _PotenciaResponse_QNAME = new QName("http://beans/", "potenciaResponse");
    private final static QName _Tangente_QNAME = new QName("http://beans/", "tangente");
    private final static QName _TangenteResponse_QNAME = new QName("http://beans/", "tangenteResponse");
    private final static QName _Potencia_QNAME = new QName("http://beans/", "potencia");
    private final static QName _Invertidas_QNAME = new QName("http://beans/", "invertidas");
    private final static QName _RaizResponse_QNAME = new QName("http://beans/", "raizResponse");
    private final static QName _SenoResponse_QNAME = new QName("http://beans/", "senoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Invertidas }
     * 
     */
    public Invertidas createInvertidas() {
        return new Invertidas();
    }

    /**
     * Create an instance of {@link RaizResponse }
     * 
     */
    public RaizResponse createRaizResponse() {
        return new RaizResponse();
    }

    /**
     * Create an instance of {@link SenoResponse }
     * 
     */
    public SenoResponse createSenoResponse() {
        return new SenoResponse();
    }

    /**
     * Create an instance of {@link Potencia }
     * 
     */
    public Potencia createPotencia() {
        return new Potencia();
    }

    /**
     * Create an instance of {@link TangenteResponse }
     * 
     */
    public TangenteResponse createTangenteResponse() {
        return new TangenteResponse();
    }

    /**
     * Create an instance of {@link PotenciaResponse }
     * 
     */
    public PotenciaResponse createPotenciaResponse() {
        return new PotenciaResponse();
    }

    /**
     * Create an instance of {@link Tangente }
     * 
     */
    public Tangente createTangente() {
        return new Tangente();
    }

    /**
     * Create an instance of {@link Raiz }
     * 
     */
    public Raiz createRaiz() {
        return new Raiz();
    }

    /**
     * Create an instance of {@link Seno }
     * 
     */
    public Seno createSeno() {
        return new Seno();
    }

    /**
     * Create an instance of {@link CosenoResponse }
     * 
     */
    public CosenoResponse createCosenoResponse() {
        return new CosenoResponse();
    }

    /**
     * Create an instance of {@link InvertidasResponse }
     * 
     */
    public InvertidasResponse createInvertidasResponse() {
        return new InvertidasResponse();
    }

    /**
     * Create an instance of {@link Coseno }
     * 
     */
    public Coseno createCoseno() {
        return new Coseno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coseno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "coseno")
    public JAXBElement<Coseno> createCoseno(Coseno value) {
        return new JAXBElement<Coseno>(_Coseno_QNAME, Coseno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvertidasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "invertidasResponse")
    public JAXBElement<InvertidasResponse> createInvertidasResponse(InvertidasResponse value) {
        return new JAXBElement<InvertidasResponse>(_InvertidasResponse_QNAME, InvertidasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosenoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "cosenoResponse")
    public JAXBElement<CosenoResponse> createCosenoResponse(CosenoResponse value) {
        return new JAXBElement<CosenoResponse>(_CosenoResponse_QNAME, CosenoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "seno")
    public JAXBElement<Seno> createSeno(Seno value) {
        return new JAXBElement<Seno>(_Seno_QNAME, Seno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Raiz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "raiz")
    public JAXBElement<Raiz> createRaiz(Raiz value) {
        return new JAXBElement<Raiz>(_Raiz_QNAME, Raiz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "potenciaResponse")
    public JAXBElement<PotenciaResponse> createPotenciaResponse(PotenciaResponse value) {
        return new JAXBElement<PotenciaResponse>(_PotenciaResponse_QNAME, PotenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tangente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "tangente")
    public JAXBElement<Tangente> createTangente(Tangente value) {
        return new JAXBElement<Tangente>(_Tangente_QNAME, Tangente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TangenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "tangenteResponse")
    public JAXBElement<TangenteResponse> createTangenteResponse(TangenteResponse value) {
        return new JAXBElement<TangenteResponse>(_TangenteResponse_QNAME, TangenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "potencia")
    public JAXBElement<Potencia> createPotencia(Potencia value) {
        return new JAXBElement<Potencia>(_Potencia_QNAME, Potencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invertidas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "invertidas")
    public JAXBElement<Invertidas> createInvertidas(Invertidas value) {
        return new JAXBElement<Invertidas>(_Invertidas_QNAME, Invertidas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RaizResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "raizResponse")
    public JAXBElement<RaizResponse> createRaizResponse(RaizResponse value) {
        return new JAXBElement<RaizResponse>(_RaizResponse_QNAME, RaizResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans/", name = "senoResponse")
    public JAXBElement<SenoResponse> createSenoResponse(SenoResponse value) {
        return new JAXBElement<SenoResponse>(_SenoResponse_QNAME, SenoResponse.class, null, value);
    }

}
