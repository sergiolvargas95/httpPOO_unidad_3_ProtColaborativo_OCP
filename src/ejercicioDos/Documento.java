package ejercicioDos;

public class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void exportarPDF() {
        System.out.println("Exportando contenido a PDF: " + contenido);
    }
}
