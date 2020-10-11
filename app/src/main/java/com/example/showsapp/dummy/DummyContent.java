package com.example.showsapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem( new DummyItem("1", "Brooklyn Nine-Nine", "test"));
        addItem( new DummyItem("2", "The Good Place", "test"));
        addItem( new DummyItem("3", "Dynasty", "test"));
        addItem( new DummyItem("4", "Gilmore Girls", "test"));
        addItem( new DummyItem("5", "Gossip Girl", "test"));
        addItem( new DummyItem("6", "Kims Convenience", "test"));
        addItem( new DummyItem("7", "House of Cards", "test"));
        addItem( new DummyItem("8", "Suits", "test"));
        addItem( new DummyItem("9", "Friends", "test"));
        addItem( new DummyItem("10", "Haikyuu", "test"));
        addItem( new DummyItem("11", "Jane the Virgin", "test"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

   /* private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }*/

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}