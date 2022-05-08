package kz.zhelezyaka.springbootexperiments.dao;

import kz.zhelezyaka.springbootexperiments.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
