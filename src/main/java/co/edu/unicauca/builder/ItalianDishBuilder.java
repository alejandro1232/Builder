package co.edu.unicauca.builder;

/**
 * Builder concreto
 *
 * @author Libardo, Julio
 */
public class ItalianDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Risotto", "El risotto es una comida tradicional italiana realizada añadiendo gradualmente un caldo al arroz, junto con otros ingredientes que varían según las específicas recetas de risottos", "", 50000, EnumSize.ALL, "Italian rice"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Ensalada Cesar", "Una ensalada de lechuga romana y croûtons con jugo de limón, aceite de oliva, huevo, salsa Worcestershire, anchoas, ajo, mostaza de Dijon, queso parmesano y pimienta negra", "", 6000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Tiramisu", "El tiramisú es un pastel frío que se monta en capas", "", 3000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Vino", "Vino de los campos italianos", "", 10000, EnumSize.HALF));

    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
