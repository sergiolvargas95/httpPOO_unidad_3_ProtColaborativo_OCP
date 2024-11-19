package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Este es el contenido del documento");

        
        Exportador exportadorPDF = new ExportarPDF();
        documento.exportar(exportadorPDF);

        
        Exportador exportadorWord = new ExportarWord();
        documento.exportar(exportadorWord);

        
        Exportador exportadorExcel = new ExportarExcel();
        documento.exportar(exportadorExcel);
    }
}