package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void  update(Department obj);
    void deleteById(Integer id);
    Department findbyId(Integer id);
    List<Department> findAll();
    List<Department> findByDepartment(Department departemnt);
}
