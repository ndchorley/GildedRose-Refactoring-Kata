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
                updatableItem.updateAfterSellByDate();
            }
        }
    }
}
