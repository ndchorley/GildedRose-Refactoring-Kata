package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    public void update() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }
}
