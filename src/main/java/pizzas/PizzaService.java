package pizzas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PizzaService {

    private final static List<Pizza> PIZZAS = Arrays.asList(
            new Pizza("De pan francés", "Con pan francés horneado, salsa de tomate, queso y pepperoni"),
            new Pizza("De Ziti", "Con la pasta ziti, salsa de tomate, queso ricotta y mozzarella"),
            new Pizza("De la abuela", "Porciones cuadradas con salsa de tomate por encima del queso"),
            new Pizza("De Nueva York", "Con salsa de tomate, queso, orégano y granos de chili sobre una masa fina"),
            new Pizza("De Chicago", "Con queso y salsa de tomate fresca en una crujiente capa de masa gruesa"),
            new Pizza("De salmón ahumado", "Con nata, salmón ahumado, caviar negro, cebolla roja y eneldo"),
            new Pizza("Bianca", "Con ajo, queso ricotta y mozarella"),
            new Pizza("De ensalada", "Con lechuga romana, pepino, tomates, queso feta y olivas"),
            new Pizza("Baggel", "Con salsa de tomate, queso y pepperoni horneados y partidos por la mitad"),
            new Pizza("De masa de coliflor", "Con una coliflor cocinada con huevo y queso, horneada, adornada y horneada de nuevo"),
            new Pizza("Kebab de Suecia", "Salsa de tomate, queso, porciones de carne de Kebab, salsa de yogur y pepperoni"),
            new Pizza("Napolitana", "Con salsa de tomate San Marzano, mozzarella de búfala campana y albahaca fresca cocinada en un horno de leña"),
            new Pizza("Siciliana", "Con queso y tomate sobre una masa fina"),
            new Pizza("De Alsacia", "Con nata, cebolla y tiras de bacon"),
            new Pizza("De Niza", "Con cebolla caramelizada, anchoas, ajo y olivas negras sobre una masa de pan"),
            new Pizza("Cuatro quesos", "Con salsa de tomate, mozzarella y quesos gorgonzola, fontina y asiago"),
            new Pizza("Hawaiana", "Con salsa de tomate, mozarella, jamón y piña"),
            new Pizza("Maltesa", "Con patatas, queso fresco, anchoas, olivas y romero"),
            new Pizza("Frita", "Media pizza rebozada y servida con patatas fritas francesas y vinagre"),
            new Pizza("De atún y maíz dulce", "Con atún, maíz, cebolla roja y queso cheddar"),
            new Pizza("De almejas blancas", "Con almejas, queso Pecorino romano, ajo, orégano y aceite de oliva"),
            new Pizza("De frutas del mar", "Con salsa de tomate, mejillones, almejas, pulpo, calamar y camarón"),
            new Pizza("Más cara del mundo", "Con nata, huevas de salmón, caviar, langosta y trufa"),
            new Pizza("Griega", "Con salsa de tomate, mozarella, queso feta, olivas kalamata, tomate fresco y orégano"),
            new Pizza("De Iowa", "Con salsa de tomate picante, salsa italiana esparcida y tiras de mozarella en una masa maltesa"),
            new Pizza("Saint Louis", "Con salsa de tomate y orégano y queso Provel en una masa sin levadura. Se debe cortar en cuadrados"),
            new Pizza("De tarta de tomate", "Con salsa de tomate fresco y queso Romano espolvoreado"),
            new Pizza("A la parrilla", "Con salsa de tomate, queso y los ingredientes que quieras sobre una masa hecha a la parrilla"),
            new Pizza("Carbonara", "Con carne picada, queso Pecorino Romano, cebolletas, crema espesa, pimienta negra y huevos"),
            new Pizza("Sushi", "Con sashimi, cebolletas, tobiko y mayonesa picante sobre una masa de arroz frito"),
            new Pizza("Libanesa", "Con cordero con especias, tomate fresco, cebollas, ajo y piñones"),
            new Pizza("De macarrones con queso", "Con macarrones, queso cheddar, queso americano y mozarella"),
            new Pizza("Cono", "Masa horneada dentro de un cono, llena de capas de queso y salsa de tomate"),
            new Pizza("Breakfast", "Con bacon, salchicha, queso cheddar y huevos revueltos"),
            new Pizza("De corteza rellena", "Con perritos calientes y palitos de mozzarella enrollados y horneados en el interior del borde de la masa"),
            new Pizza("Mexicana", "Con tortilla, salsa de enchilada, tomates, frijoles negros, cebolletas y queso"),
            new Pizza("Calzone", "Horneada con una masa de pan plegada sobre carne, queso y vegetales varios"),
            new Pizza("Stromboli", "Con carne, queso y vegetales enrollados en una masa horneada de pan"),
            new Pizza("Jumbo", "Servida en forma de una porción enorme de pizza ¡Te lo mereces!"),
            new Pizza("Al corte", "Con finas porciones cuadradas con vatios ingredientes, vendida por cortes")

    );

    public static Pizza randomPizza() {
        Collections.shuffle(PIZZAS);

        return PIZZAS.get(0);
    }
}
