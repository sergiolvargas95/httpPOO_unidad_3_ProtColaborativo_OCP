package ejercicioDos;

public class ExportarExcel implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Excel: " + contenido);
    }
}
