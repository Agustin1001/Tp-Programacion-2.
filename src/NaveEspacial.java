public class NaveEspacial {
    private String nombre;
    private int combustible;
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        System.out.println("Se creo una nave: Nombre[" +nombre+"] Combustible ["+combustible+"]");
    }
    public void despegar (){
        System.out.println("Se intenta despegar: Analizando... Combustible Actual["+this.combustible+"L]" );
        if (combustible >= 10) {
            combustible = combustible - 10;
            System.out.println("Despegue exitoso");
        } else {
            System.out.println("Combustible insuficiente para despegar");
        }
    }
    public void avanzar (int distancia) {
        System.out.println("Se intenta avanzar ["+distancia+"Km]: Analizando...");
        if (combustible - distancia >= 0) {
            combustible = combustible - distancia;
            System.out.println("Se avanzo ["+distancia+"Km]");
        } else {
            System.out.println("Combustible insuficiente");
        }
    }
    public void recargarCombustible(int cantidad) {
        System.out.println("Se intenta recargar ["+cantidad+"L] de combustible: Analizando...");
        if (combustible + cantidad <= 100) {
            combustible = combustible + cantidad;
            System.out.println("Recarga exitosa: Combustible Actual ["+combustible+"L]");
        } else {
            System.out.println("Limite superado");
        }
    }
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + " Combustible Actual: " + combustible + "l");
    }

}
