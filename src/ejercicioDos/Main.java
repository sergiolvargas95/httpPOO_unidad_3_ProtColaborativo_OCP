package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Este es el contenido del documento");

        Exportador exportadorPDF = new ExportadorPDF();
        documento.exportar(exportadorPDF);

        
        Exportador exportadorWord = new ExportadorWord();
        documento.exportar(exportadorWord);

        
        Exportador exportadorExcel = new ExportadorExcel();
        documento.exportar(exportadorExcel);
    }
}