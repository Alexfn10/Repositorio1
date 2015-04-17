
/**
 * Write a description of class Mamífero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mamifero extends Animal
{
    // Campos
    private char categoria; // H herbívoros C carnívoros O omnívoros

    /**
     * Constructor for objects of class Mamifero
     */
    public Mamifero(String nombre, double peso, int vida, char categoria)
    {
        // initialise instance variables
        super(nombre, peso, vida);
        this.categoria = categoria;
    }
    
    public char getCategoria()
    {
        return categoria;
    }
    
    /**
     * Devuelve una cadena que es la representación del mamífero
     */
    public String toString() 
    {
        return super.toString() + "años " + "Categoría: " + (Character.toUpperCase(categoria) == 'H'? "herbívoro" : "carnívoro");
    }
}
