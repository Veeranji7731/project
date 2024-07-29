package in.venky.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venky.entity.student;

public interface studentrepo extends JpaRepository<student,Integer> {

}
