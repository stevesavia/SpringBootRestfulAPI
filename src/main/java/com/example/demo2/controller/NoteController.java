package com.example.demo2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo2.model.Note;
import com.example.demo2.repository.Demo2Repository;
import javax.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


	
@Controller
@RequestMapping("/")
public class NoteController {

	@Autowired
	Demo2Repository repository;

	//post a note
	@PostMapping("/notes")
	@ResponseBody
	public Note createNote(
			@Valid 
			@RequestBody 
			Note note) {
		return repository.save(note);
	}

	// get the notes
	@RequestMapping(value="/notes", method=RequestMethod.GET)
	@ResponseBody
	public List<Note> getAllNotes() {
		return repository.findAll();
	}


}
