package ontwerppatronen.chaining;

/**
 * Door de methodeen instantie van zichzelf te laten teruggeven is het mogelijk
 * om methode aanroepen aan elkaar te rijgen. Men noemt dit ook wel een Fluent API
 * Het Builder patroon gebruikt chaining
 */
public class Chain {

    Chain name(String name) {
        System.out.println("Name: " + name + " ");
        return this; // geef eigen instantie terug
    }

    Chain age(int age) {
        System.out.println("Age: " + age + " ");
        return this;
    }

    Chain hobby(String hobby) {
        System.out.println("Hobby: " + hobby + " ");
        return this;
    }

    // We moeten een conclusie methode, build, generate of iets anders hebben
    void show() {
        System.out.println("End of Chain");
    }
}
