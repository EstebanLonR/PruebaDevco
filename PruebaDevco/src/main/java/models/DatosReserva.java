package models;

public class DatosReserva {

    private String destino;
    private String adultos;
    private String ninios;
    private String nombre;
    private String apellido;
    private String email;
    private String numero;
    private String tipoTarjeta;
    private String numeroTarjeta;

    public DatosReserva(String destino, String adultos, String ninios, String nombre, String apellido, String email, String numero, String numeroTarjeta, String tipoTarjeta) {
        this.destino = destino;
        this.adultos = adultos;
        this.ninios = ninios;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public String getAdultos() {
        return adultos;
    }

    public String getNinios() {
        return ninios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getNumero() {
        return numero;
    }
}
