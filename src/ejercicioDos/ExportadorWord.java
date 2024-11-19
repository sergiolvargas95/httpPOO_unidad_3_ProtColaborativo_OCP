package ejercicioDos;

public class ExportadorWord implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Word: " + contenido);
    }
}