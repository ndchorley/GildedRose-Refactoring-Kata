package com.gildedrose;

public class Program {

    public static void main(String... args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
            new UpdatableItem("+5 Dexterity Vest", 10, 20),
            new AgedBrie(2, 0),
            new UpdatableItem("Elixir of the Mongoose", 5, 7),
            new Sulfuras(0),
            new Sulfuras(-1),
            new BackstagePasses(15, 20),
            new BackstagePasses(10, 49),
            new BackstagePasses(5, 49),
            new ConjuredItem("Conjured Mana Cake", 3, 6)
        };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 31; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (int j = 0; j < items.length; j++) {
                System.out.println(items[j]);
            }
            System.out.println("");
            app.updateQuality();
        }
    }
}
