public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        System.out.println("Se creo una gallina: "+" ID["+idGallina+"]"+" Edad["+edad+"]"+" CantHuevos["+huevosPuestos+"]");
    }
    public void ponerHuevo(){
        huevosPuestos ++;
        System.out.println("La gallina ["+this.idGallina+ "] puso un huevo");
    }
    public void envejecer (){
        edad ++;
        System.out.println("La gallina ["+this.idGallina+ "] envejecio un año");
    }
    public void mostrarEstado (){
        System.out.println("Estado Gallina ID ["+ idGallina+"]" );
        System.out.println("Edad:"+ edad + " Huevos Puestos "+ huevosPuestos);
    }
}
