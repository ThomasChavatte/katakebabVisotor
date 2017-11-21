package unilim;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class InnTest {
	@Test
	public void should_updateOnce() {
		Inn inn = new Inn();
		assertThat(inn.getItems()).extracting("name").contains("+5 Dexterity Vest","Aged Brie","Elixir of the Mongoose");
		
		assertThat(inn.getItems()).extracting("sellIn").contains(10,2,5,0,15,3);
		assertThat(inn.getItems()).extracting("quality").contains(20,0,7,80,20,6);
	}
	
	@Test
	public void should_test_against_legacy(){			
		Inn inn = new Inn();
		legacy legacy = new legacy();
			for(int i=0; i<1000; i++){
				List<Item> items = inn.getItems();
				List<Item> legacyItems = legacy.getItems();
				assertThat(items).hasSize(legacyItems.size());
				
				for(int j=0; j< legacyItems.size(); j++){
					Item item = items.get(j);
					Item legacyItem = legacyItems.get(j);
					assertThat(item.getName()).isEqualTo(legacyItem.getName());
					assertThat(item.getQuality()).isEqualTo(legacyItem.getQuality());
					assertThat(item.getSellIn()).isEqualTo(legacyItem.getSellIn());
				}			
			}
		}
	
	@Test
	public void should_update100days() {
		
		Inn inn = new Inn();
		for(int i=0; i<100; i++){
			inn.updateQuality();
		}
		assertThat(inn.getItems()).extracting("sellIn").contains(-90,-98,-95-0,-85,-97);
		assertThat(inn.getItems()).extracting("quality").contains(0,50,0,80,0,0);
	}
	
	
	@Test
	public void updateTwice() {
		Inn inn = new Inn();
		inn.updateQuality();
		assertThat(inn.getItems()).extracting("name").contains("+5 Dexterity Vest","Aged Brie","Elixir of the Mongoose");
		
		assertThat(inn.getItems()).extracting("sellIn").contains(9,1,4,0,14,2);
		assertThat(inn.getItems()).extracting("quality").contains(19,1,6,80,21,5);
	}
	
}