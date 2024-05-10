package aplication;
import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import java.util.List;
public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentdao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: seller find by id ===");
        Department department = departmentdao.findbyId(3);
        System.out.println(department);

        System.out.println("\n=== Test 3: seller find all ===");
        List<Department> list = null;
        list = departmentdao.findAll();
        for (Department obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 4: Insert ===");
        Department newDep = new Department(null,"Tesouraria");
        departmentdao.insert(newDep);
        System.out.println("inserted new id = " + newDep.getId());

        System.out.println("\n=== Test 5: update ===");
        department = departmentdao.findbyId(newDep.getId());
        department.setName("Treasure");
        departmentdao.update(department);
        System.out.println("Update Complete");

        System.out.println("\n=== Test 6: delete ===");
        departmentdao.deleteById(11);

        DB.closeConnection();
    }
}
