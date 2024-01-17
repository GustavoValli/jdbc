package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        System.out.println("--- TEST 1: seller find by id ---");

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);

        System.out.println("\n--- TEST 2: seller find by id ---");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
