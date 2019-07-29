package com.API.controller;


	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.API.model.Item;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
	



	@RestController
	@Api(value="menuitems", description="Operations pertaining to Menu Items")
	public class MainController {
	@ApiOperation(value = "Get all menu items", response = Item.class, responseContainer = "List")
	@GetMapping("/items")
	public ResponseEntity<List<Item>> getItems() {
	  return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
	}

	
	
	}

