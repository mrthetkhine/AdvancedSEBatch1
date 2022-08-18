package cleancode.refactoring.kata.gliderose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {
	 	@Test
	    void foo() {
	        Item[] items = new Item[] { new Item("foo", 0, 0) };
	        GlidedRose app = new GlidedRose(items);
	        app.updateQuality();
	        assertEquals("fixme", app.items[0].name);
	    }
}
