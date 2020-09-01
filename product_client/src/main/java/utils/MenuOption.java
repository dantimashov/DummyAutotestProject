package utils;

/**
 * @author daniil.timashov on 31.08.2020
 */
public enum MenuOption {

    ITEM1("First item"),
    ITEM2("Second item"),
    ITEM3("Third item");

    private String item;

    MenuOption(String item) {
        this.item = item;
    }
}
