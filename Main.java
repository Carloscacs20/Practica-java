//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Automovil bmw = new Automovil("bmw");

        //bmw.setMarca("BMW");
        bmw.setModelo("41KJ3G");
        bmw.setColor("Naranja");
        bmw.setCilindraje("2.5");
        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        System.out.println("");

        Automovil bmw2 = new Automovil("Merces", "155JF4");

        //bmw2.setMarca("BMW");
        //bmw2.setModelo("41KJ3G");
        bmw2.setColor("Naranja");
        bmw2.setCilindraje("2.5");

        System.out.println("bmw2.verDetalle() = " + bmw2.verDetalle());

        System.out.println(bmw.equals(bmw2));


    }
}