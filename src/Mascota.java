public class Mascota {
    private String nombre;
    private String especie;
    private int edad;


    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"|Especie: "+especie+"|Edad: "+edad);
    }
    public void cumplirAnios(){
        edad++;
    }
}
