public class Persona {
    private int edad;
    private String  nombre;
    private int telefono;

    public int getedad(){
        return edad;
    }
    public String getnombre(){
        return nombre;
    }
    public int gettelefono (){
        return telefono;
    }

    public void setedad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public Persona(){
        this.nombre="";
        this.telefono=0;
        this.edad=0;
    }
}
class PersonaApp {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        Persona persona2 = new Persona();

        persona1.setNombre("Pepe Argento");

        persona1.setedad(43);

        persona1.setTelefono(123456789);

        persona2.setNombre("Monica Argento");

        persona2.setedad(40);

        persona2.setTelefono(987654321);

        System.out.println("El nombre de persona1 es " + persona1.getnombre());

        System.out.println("La edad de persona1 es " + persona1.getedad());

        System.out.println("El Telefono de persona1 es " + persona1.gettelefono());

        System.out.println("El nombre de persona2 es " + persona2.getnombre());

        System.out.println("La edad de persona2 es " + persona2.getedad());

        System.out.println("El Telefono de persona2 es " + persona2.gettelefono());
    }
}
