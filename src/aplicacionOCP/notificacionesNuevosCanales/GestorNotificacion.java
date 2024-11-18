package aplicacionOCP.notificacionesNuevosCanales;

public class GestorNotificacion {
    public void notificar(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}
