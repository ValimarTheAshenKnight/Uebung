/**
 * Created by d.buetikofer on 05.07.2017.
 */
package headfirst.designpatterns.composite.menu;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}

