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

    //private static final int COUNT = 25;

    static {
        addItem( new DummyItem("1", "Brooklyn Nine-Nine", "Brooklyn Nine Nine follows the exploits of hilarious Detective Jake Peralta and his diverse lovable colleagues as they police the NYPDs 99th Precinct"));
        addItem( new DummyItem("2", "The Good Place", "Eleanor a deceased saleswoman who lived a morally corrupt life finds herself in a heaven-like afterlife in a case of mistaken identity and tries to hide her past in order to stay there"));
        addItem( new DummyItem("3", "Dynasty", "A modernized reboot of the 1980s primetime soap follows two of Americas wealthiest families the Carringtons and the Colbys as they feud for control over their fortune and their children"));
        addItem( new DummyItem("4", "Gilmore Girls", "Lorelai Gilmore an independent young woman shares a close bond with her wilful daughter Rory However her relationship with her own mother is strained"));
        addItem( new DummyItem("5", "Gossip Girl", "Blair Waldorf is a popular student at her private school and envied by one and all But her perfect life is unsettled when her ex best friend enrols in the same institution"));
        addItem( new DummyItem("6", "Kims Convenience", "While running a convenience store in Toronto members of a Korean Canadian family deal with customers each other and the evolving world around them"));
        addItem( new DummyItem("7", "House of Cards", "Frank Underwood is a Democrat appointed as the secretary of state Along with his wife he sets out on a quest to seek revenge on the people who betrayed him while successfully rising to supremacy"));
        addItem( new DummyItem("8", "Suits", "Mike Ross a talented young college dropout is hired as an associate by Harvey Specter one of New Yorks best lawyers They must handle cases while keeping Mikes qualifications a secret"));
        addItem( new DummyItem("9", "Friends", "Follow the lives of six reckless adults living in Manhattan as they indulge in adventures which make their lives both troublesome and happening"));
        addItem( new DummyItem("10", "Haikyuu", "Haikyu is a Japanese manga series written and illustrated by Haruichi Furudate The story follows Shoyo Hinata a boy determined to become a great volleyball player despite his small stature"));
        addItem( new DummyItem("11", "Jane the Virgin", "Jane Villanuevas life turns upside down after she gets artificially inseminated She is in for a greater shock when she discovers that the biological donor is her boss and former crush"));
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