package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("--- TEST 1: department find by id ---");

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department dep = departmentDao.findById(4);
        System.out.println(dep);

        System.out.println("\n--- TEST 2: department find all ---");

        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for (Department obj :  list) {
            System.out.println(obj);
        }

        System.out.println("\n--- TEST 3: department insert ---");

        Department newDep = new Department(null, "Search");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id: " + newDep.getId());

        System.out.println("\n--- TEST 4: department update ---");

        dep = departmentDao.findById(3);
        dep.setName("Repair");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("\n--- TEST 5: department delete ---");

        departmentDao.deleteById(6);
        System.out.println("Department was successfully deleted");

    }
}
