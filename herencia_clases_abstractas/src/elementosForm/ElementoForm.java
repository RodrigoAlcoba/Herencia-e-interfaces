package elementosForm;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;

    public ElementoForm() {

    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract public String dibujarHtml();

}
