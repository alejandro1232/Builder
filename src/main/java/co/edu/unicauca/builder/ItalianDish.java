package co.edu.unicauca.builder;

/**
 * Producto oriental que usa herencia
 *
 * @author Libardo, Julio
 */
public class ItalianDish extends Dish {

    private String italianName;

    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName) {
        super(name, description, image, price, size);
        this.italianName = italianName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

}
