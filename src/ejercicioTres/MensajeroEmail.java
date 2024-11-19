package ejercicioTres;

public class MensajeroEmail extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por correo eletronico: " + mensaje);
    }
}
