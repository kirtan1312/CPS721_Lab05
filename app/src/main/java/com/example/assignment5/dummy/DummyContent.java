package com.example.assignment5.dummy;

import android.util.Log;

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

    private static ArrayList<String> mNames = new ArrayList<>();
    private static ArrayList<String> mDescription = new ArrayList<>();
    private static ArrayList<String> mDetailedDescription = new ArrayList<>();
    private static ArrayList<String> mImageUrls = new ArrayList<>();



    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 3;


    static {

        mDetailedDescription.add("Shark Tank is an American reality TV show on ABC that features a panel of business executives and investors (called 'Sharks')");
        mNames.add("Shark Tank");
        mDescription.add("American Business TV show");
        mImageUrls.add("https://i.pinimg.com/600x315/24/a0/6f/24a06fa5f07a37d89849f2651ac23e29.jpg");

        mDetailedDescription.add("Premise. Set in Albuquerque, New Mexico, between 2008 and 2010, Breaking Bad follows Walter White, a meek high school chemistry teacher who transforms into a ruthless player ");
        mNames.add("Breaking Bad");
        mDescription.add("Story occurs in New Mexico");
        mImageUrls.add("https://banner2.cleanpng.com/20180816/kzi/kisspng-logo-walter-white-vector-graphics-television-show-breaking-bad-png-18-5b754e1068c945.0272561515344143524292.jpg");

        mDetailedDescription.add("Series overview. The Walking Dead takes place after the onset of a worldwide zombie apocalypse. The zombies, colloquially referred to as \"walkers\"");
        mNames.add("Walking Dead");
        mDescription.add("Story is about a Zombie apoclypse");
        mImageUrls.add("https://i.pinimg.com/600x315/24/a0/6f/24a06fa5f07a37d89849f2651ac23e29.jpg");

        mDetailedDescription.add("The Big Bang Theory is a comedy about brilliant physicists, Leonard and Sheldon, who are the kind of \"beautiful minds\" that understand how the universe works. g");
        mNames.add("The Big Bang Theory");
        mDescription.add("Is a comedy show based on nerdy people");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/6/68/Shark_Tank_Logo.jpg");

        // Add some sample items.
        for (int i = 0; i <= COUNT; i++) {
            addItem(new DummyItem(String.valueOf(i), mNames.get(i), mDescription.get(i), mDetailedDescription.get(i), mImageUrls.get(i)));
        }


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), mNames.get(position), mDescription.get(position), mDetailedDescription.get(position), mImageUrls.get(position));
    }
    /*

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
     */

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String description;
        public final String imageUrl;

        public DummyItem(String id, String content, String details, String description, String imageUrl) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.description = description;
            this.imageUrl = imageUrl;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public void initImageBitmaps(){
        mDetailedDescription.add("Shark Tank is an American reality TV show on ABC that features a panel of business executives and investors (called 'Sharks')");
        mNames.add("Shark Tank");
        mDescription.add("American Business TV show");
        mImageUrls.add("https://i.pinimg.com/600x315/24/a0/6f/24a06fa5f07a37d89849f2651ac23e29.jpg");

        mDetailedDescription.add("Premise. Set in Albuquerque, New Mexico, between 2008 and 2010, Breaking Bad follows Walter White, a meek high school chemistry teacher who transforms into a ruthless player ");
        mNames.add("Breaking Bad");
        mDescription.add("Story occurs in New Mexico");
        mImageUrls.add("https://banner2.cleanpng.com/20180816/kzi/kisspng-logo-walter-white-vector-graphics-television-show-breaking-bad-png-18-5b754e1068c945.0272561515344143524292.jpg");

        mDetailedDescription.add("Series overview. The Walking Dead takes place after the onset of a worldwide zombie apocalypse. The zombies, colloquially referred to as \"walkers\"");
        mNames.add("Walking Dead");
        mDescription.add("Story is about a Zombie apoclypse");
        mImageUrls.add("https://i.pinimg.com/600x315/24/a0/6f/24a06fa5f07a37d89849f2651ac23e29.jpg");

        mDetailedDescription.add("The Big Bang Theory is a comedy about brilliant physicists, Leonard and Sheldon, who are the kind of \"beautiful minds\" that understand how the universe works. g");
        mNames.add("The Big Bang Theory");
        mDescription.add("Is a comedy show based on nerdy people");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/6/68/Shark_Tank_Logo.jpg");

    }
}