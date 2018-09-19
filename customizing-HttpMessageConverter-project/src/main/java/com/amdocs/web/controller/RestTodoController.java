package com.amdocs.web.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.web.models.Todo;

@RestController
@RequestMapping(value = "/home")
public class RestTodoController {

	private static final Logger log = LoggerFactory.getLogger(RestTodoController.class);
	
	@RequestMapping(value = "/todo/save", method = RequestMethod.POST)
	public Todo processTodoData(@RequestBody @Valid Todo todo) {
		
		log.info("received todo object is: " + todo.toString());
		
		return todo;
	}
}
