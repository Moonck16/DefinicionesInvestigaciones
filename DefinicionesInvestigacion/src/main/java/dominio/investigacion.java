package dominio;

public class investigacion {
    private String titulo;
    private String descripcion;
    private String referencia;
    private String foto; // Nombre de la imagen

    // Constructor vacío
    public investigacion() {}

    // Constructor con parámetros
    public investigacion(String titulo, String descripcion, String referencia, String foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.foto = foto;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
