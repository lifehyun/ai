package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ItemController {
	
	@GetMapping(value = "/admin/item/new") //요청이 들어오면
	public String itemForm() {
		return "item/itemForm"; //응답을 받는곳
	}
}
