package com.gildedrose;

public class ConjuredItem extends UpdatableItem {
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}
