package com.gildedrose;

public class UpdatableItem extends Item {
    public UpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }

    public void updateSellIn() {
        this.sellIn = this.sellIn - 1;
    }
}
