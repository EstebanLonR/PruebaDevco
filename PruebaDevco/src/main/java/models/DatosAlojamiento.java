package models;

public class DatosAlojamiento {

    private String destino;
    private String adultos;
    private String ninios;
    private String edadNinios;


    public DatosAlojamiento(String destino, String adultos, String ninios, String edadNinios) {
        this.destino = destino;
        this.adultos = adultos;
        this.ninios = ninios;
        this.edadNinios = edadNinios;
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

    public String getEdadNinios() {
        return edadNinios;
    }


}
