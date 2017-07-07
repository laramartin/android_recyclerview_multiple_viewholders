package eu.laramartin.multipleviewholders;

import static eu.laramartin.multipleviewholders.MyAdapter.ITEM_TYPE_CONTENT;
import static eu.laramartin.multipleviewholders.MyAdapter.ITEM_TYPE_FOOTER;
import static eu.laramartin.multipleviewholders.MyAdapter.ITEM_TYPE_TITLE;

class Item {

    private int type;
    private String title;
    private String content;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Item createTitle(String title) {
        Item item = new Item();
        item.setType(ITEM_TYPE_TITLE);
        item.setTitle(title);
        return item;
    }

    public static Item createContent(String content) {
        Item item = new Item();
        item.setType(ITEM_TYPE_CONTENT);
        item.setContent(content);
        return item;
    }

    public static Item createFooter() {
        Item item = new Item();
        item.setType(ITEM_TYPE_FOOTER);
        return item;
    }
}
