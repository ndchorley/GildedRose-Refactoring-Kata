package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ((UpdatableItem)item).update();
            ((UpdatableItem)item).updateSellIn();

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    ((AgedBrie)item).update();
                } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    updateBackstagePassesAfterSellByDate(item);
                } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                } else {
                    ((UpdatableItem)item).update();
                }
            }
        }
    }

    private void updateBackstagePassesAfterSellByDate(Item item) {
        item.quality = 0;
    }
}
