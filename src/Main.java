import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int punto;
        while (true) {
            System.out.println();
            System.out.print("Seleccione el punto [1-5] Salir[0] >> ");
            punto = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (punto) {
                case 1:
                    Estudiante alumno1 = new Estudiante("Agustin","Marin","5°A", 0);
                    alumno1.mostrarInfo();
                    alumno1.subirCalificacion(9);
                    alumno1.mostrarInfo();
                    alumno1.bajarCalificacion(10);
                    alumno1.mostrarInfo();
                    alumno1.subirCalificacion(11);
                    alumno1.mostrarInfo();
                    break;
                case 2:
                    Mascota pet= new Mascota("pepito","caniche",1);
                    pet.mostrarInfo();
                    pet.cumplirAnios();
                    System.out.println("-------------------");
                    pet.mostrarInfo();
                    break;
                case 3:
                    Libro libro1 = new Libro("It","Stephen King",1986 );
                    libro1.setAnioPublicacion(1800);
                    libro1.setAnioPublicacion(1986);
                    System.out.println("Titulo: " + libro1.getTitulo());
                    System.out.println("Autor: " + libro1.getAutor());
                    System.out.println("Año de Publicación: " + libro1.getAnioPublicacion());
                    break;
                case 4:
                    Gallina gallina1 = new Gallina(1001, 1, 0);
                    Gallina gallina2 = new Gallina(1002, 4, 100);
                    System.out.println();
                    gallina1.ponerHuevo();
                    gallina2.ponerHuevo();
                    System.out.println();
                    gallina1.envejecer();
                    gallina2.envejecer();
                    System.out.println();
                    gallina1.mostrarEstado();
                    gallina2.mostrarEstado();
                    break;
                case 5:
                    NaveEspacial nave1 = new NaveEspacial("Fugaz", 60);
                    System.out.println();
                    nave1.despegar();
                    System.out.println();
                    nave1.avanzar(60);
                    System.out.println();
                    nave1.recargarCombustible(40);
                    System.out.println();
                    nave1.avanzar(60);
                    System.out.println();
                    nave1.mostrarEstado();
                    break;
                default:
                    if (punto != 0 ){
                        System.out.println();
                        System.out.println("Opcion no valida, intente nuevamente");
                        System.out.println();
                    }
                    break;

            }
            if (punto == 0){
                System.out.println("Saliendo del programa...");
                break;
            }
        }
    }
}

