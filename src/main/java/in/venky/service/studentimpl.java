package in.venky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.venky.entity.student;
import in.venky.repo.studentrepo;

@Service
public class studentimpl implements studentinterface{
	@Autowired
	private studentrepo sr;

	@Override
	public void save(student s) {
		sr.save(s);
		
	}

	@Override
	public void delete(Integer id) {
		
		sr.deleteById(id);
	}

	@Override
	 public student edit(Integer id) {
        return sr.findById(id).orElse(null);
    }

	@Override
	public List<student> findAll() {
		List<student> all = sr.findAll();
		return all;
	}
	

}
