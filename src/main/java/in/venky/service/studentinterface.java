package in.venky.service;


import java.util.List;


import in.venky.entity.student;

public interface studentinterface {
	public void save(student p);
	public List<student> findAll();
	public void delete(Integer id);
	public student edit(Integer id);
	

}
