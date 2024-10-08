import java.util.zip.DeflaterOutputStream;

public class Automovil {
    // Estructura recomendable

    // Atributos - Propiedades - Estado

    private String  marca;
    private String  modelo;
    private String color = "Verde";
    private String cilindraje;

    // Constructores

    public Automovil() {

    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodos Set y Get

    public String getMarca() {
        return marca;
    }

    /*public void setMarca(String marca) {
        this.marca = marca;
    }*/

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }


    // Metodos propios y de cálculo

    public String verDetalle(){
        String dv = "La marca es " + this.marca + "\n"+
        "El modelo es " + getModelo() + "\n"+
        "El color es " + this.color + "\n"+
        "El cilindraje es " + getCilindraje();
        return dv;
    }

    // Modificcación de metodos nativos


}


// clase object es la clase pirncipal en  donde es orienta toda programacion orientada a objetos
// part intermedia del programa fuente y el programa objeto bytecode
// caraceisticas del constructor mismo nombre de la clase y empieza con mayusucla
// y es un metodo que puede o no puede resirvir parametros
// existe un void pero no se pone
// cad objeto puede tener sus propias caracteristicas