package cleancode.refactoring.kata.gliderose;

public class GlidedRose {
	private static final int MAX_QUALITY = 50;
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	
	Item[] items;

	    public GlidedRose(Item[] items) {
	        this.items = items;
	    }

	    boolean isNormalItem(Item item)
	    {
	    	return !item.name.equals(AGED_BRIE)
	    			&& !item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT);
	    }
	    public void updateQuality() {
	        for (Item item : this.items) {
	        	/*
	        	 * Normal Item
	        	 * */
				if (isNormalItem(item)) {
	                handleQualityForNormalItem(item);
	            } else {
	            	handleQualityForSpeicalItem(item);
	            }

				handleSellIn(item);

	            handleSellInPass(item);
	        }
	    }

		private void handleSellInPass(Item item) {
			if (item.sellIn < 0) {
			    if (!item.name.equals(AGED_BRIE)) {
			        if (!item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
			            handleQualityForNormalItem(item);
			        } else {
			            item.quality = 0;
			        }
			    } else {
			    	/*
			    	 * “Aged Brie” actually increases in Quality the older it gets
			    	 * */
			        if (item.quality < 50) {
			            item.quality = item.quality + 1;
			        }
			    }
			}
		}

		private void handleSellIn(Item item) {
			/*
			 * “Sulfuras”, being a legendary item, never has to be sold or decreases in Quality
			 * */
			//All except SULFURAS_HAND_OF_RAGNAROS
			if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
			    item.sellIn = item.sellIn - 1;
			}
		}

		private void handleQualityForNormalItem(Item item) {
			if (item.quality > 0) {
			    if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
			        item.quality = item.quality - 1;
			    }
			}
		}

		private void handleQualityForSpeicalItem(Item item) {
			/*"Aged Brie" actually increases in Quality the older it gets
			 * 
			 * 
			 * */
			if (item.quality < MAX_QUALITY) {
			    item.quality = item.quality + 1;

			    /*"Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
				Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
				Quality drops to 0 after the concert
			     * */
			    if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
			        handleQualityForBackStagePasses(item);
			    }
			}
		}

		private void handleQualityForBackStagePasses(Item item) {
			if (item.sellIn < 11) {
			    if (item.quality < MAX_QUALITY) {
			        item.quality = item.quality + 1;
			    }
			}

			if (item.sellIn < 6) {
			    if (item.quality < MAX_QUALITY) {
			        item.quality = item.quality + 1;
			    }
			}
		}
}
