package restcontrollers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Content;
import services.ContentService;

@Controller
public class ContentController {
	
	@Autowired
	private ContentService service;
	
	@GetMapping("/content")
	public List<Content> list(){
		return service.listAll();
	}
	
	@GetMapping("/content/{id}")
	public ResponseEntity<Content> get(@PathVariable Integer id) {
	    try {
	        Content content = service.get(id);
	        return new ResponseEntity<Content>(content, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Content>(HttpStatus.NOT_FOUND);
	    }
	}
	@PostMapping("/content")
	public void add(@RequestBody Content content) {
	    service.save(content);
	}
	@PutMapping("/content/{id}")
	public ResponseEntity<?> update(@RequestBody Content content, @PathVariable Integer id) {
	    try {
	        Content exist = service.get(id);
	        service.save(content);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/content/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
}
