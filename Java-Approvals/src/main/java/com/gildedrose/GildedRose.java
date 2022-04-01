package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdatableItem updatableItem = (UpdatableItem)item;
            (updatableItem).update();
            (updatableItem).updateSellIn();

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    updatableItem.updateAfterSellByDate();
                } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    updatableItem.updateAfterSellByDate();
                } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    updatableItem.updateAfterSellByDate();
                } else {
                    updatableItem.updateAfterSellByDate();
                }
            }
        }
    }
}
