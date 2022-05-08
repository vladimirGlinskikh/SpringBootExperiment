package kz.zhelezyaka.springbootexperiments.dao;

import kz.zhelezyaka.springbootexperiments.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
