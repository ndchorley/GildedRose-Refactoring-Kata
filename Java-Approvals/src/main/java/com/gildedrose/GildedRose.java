package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                ((UpdatableItem)item).update();
                updateSellIn(item);
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            } else {
                updateOrdinaryItem(item);
                updateSellIn(item);
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    ((AgedBrie)item).update();
                } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    updateBackstagePassesAfterSellByDate(item);
                } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                } else {
                    updateOrdinaryItem(item);
                }
            }
        }
    }

    private void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void updateOrdinaryItem(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void updateBackstagePassesAfterSellByDate(Item item) {
        item.quality = 0;
    }
}
