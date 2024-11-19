package ejercicioDos;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a PDF: " + contenido);
    }
}
