package in.venky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import in.venky.entity.student;
import in.venky.service.studentimpl;

@Controller
public class studentcontroller {
	@Autowired
private studentimpl si;

@GetMapping("/student")
public ModelAndView loadpage() {
	ModelAndView m = new ModelAndView();
	m.addObject("s", new student());
	m.setViewName("index");
	return m;
}
@PostMapping("/sdata")
public ModelAndView save(student s) {
	ModelAndView m = new ModelAndView();
	si.save(s);
	m.setViewName("index");
	m.addObject("s", new student());
	return m;
}
@GetMapping("/allstudents")
public ModelAndView getall() {
	ModelAndView m = new ModelAndView();
	m.addObject("d",si.findAll());
	m.setViewName("data");
	return m;
}
@GetMapping("/delete/{id}")
public ModelAndView find(@PathVariable Integer id) {
	ModelAndView m = new ModelAndView();
	si.delete(id);
	m.setViewName("data");
	return m;
}
@GetMapping("/update/{id}")
public ModelAndView EditForm(@PathVariable Integer id) {
	student e = si.edit(id);
	ModelAndView m = new ModelAndView();
	m.addObject("s	",e);		
	m.setViewName("index");
	return m ;
}
}
