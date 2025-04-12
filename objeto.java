public class objeto {

    String nombre;
    int cedula;
    int edad;
    boolean auxilio;
    String esDesplazado;
    int estrato;
    public objeto(String nombre, int cedula, int edad, boolean auxilio, String esDesplazado, int estrato) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.auxilio = auxilio;
        this.esDesplazado = esDesplazado;
        this.estrato = estrato;
    }

    public objeto(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAuxilio() {
        return auxilio;
    }

    public void setAuxilio(boolean auxilio) {
        this.auxilio = auxilio;
    }

    public String isEsDesplazado() {
        return esDesplazado;
    }

    public void setEsDesplazado(String esDesplazado) {
        this.esDesplazado = esDesplazado;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    
    
}
