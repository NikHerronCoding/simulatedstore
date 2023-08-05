package com.example.restservice;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemListController {

	

	@GetMapping("/ItemList")
	public ItemList itemList() {
        ItemList items = new ItemList(ItemList.generateList(10));
		return items;
	}
}


