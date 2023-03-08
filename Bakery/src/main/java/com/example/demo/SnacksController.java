package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/")
public class SnacksController {
	@Autowired
	SnacksRepository repo;
	
	@GetMapping("/")
	public List<bakery> getAllEmp(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public bakery createEmployee(@RequestBody bakery x) {
		return repo.save(x);
	}
	
	@GetMapping("/{id}")
	public Optional<bakery> getEmpbyId(@PathVariable int id){
		Optional<bakery> temp=repo.findById(id);
		return temp;
	}
	
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable int id,@RequestBody bakery upd) {
		if(repo.existsById(id)) {
			bakery t=new bakery();
			t.setId(id);
			t.setName(upd.getName());
			t.setQuantity(upd.getQuantity());
			t.setPrice(upd.getPrice());
			t.setImg(upd.getImg());
			repo.save(t);
		}
		return " ";
	}
	@DeleteMapping("/{id}")
	public String removeEmp(@PathVariable int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}
		return " ";
	}
	
}