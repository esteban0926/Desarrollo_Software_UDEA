public class Empresa {
    private String nombre_empresa;
    private String direccion;
    private int telefono;
    private String nit;

    //Constructor

    public Empresa(String nombre_empresa, String direccion, int telefono, String nit) {
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    // GETTER Y SETTER
        //Nombre empresa
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
        //Direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        //Telefono
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Nit
    public String getNit(){
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}











