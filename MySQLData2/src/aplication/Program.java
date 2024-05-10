package aplication;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao selerdao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller find by id ===");
        Seller seller = selerdao.findbyId(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller find by Department ===");
        Department department = new Department(2, null);
        List<Seller> list = selerdao.findByDepartment(department);
        for (Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: seller find all ===");
        list = selerdao.findAll ();
        for (Seller obj: list){
            System.out.println(obj);
        }
        System.out.println("\n=== Test 4: Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0,department);
        selerdao.insert(newSeller);
        System.out.println("inserted new id = " + newSeller.getId());

        System.out.println("\n=== Test 5: update ===");
        seller = selerdao.findbyId(1);
        seller.setName("Marta Wayne");
        selerdao.update(seller);
        System.out.println("Update Complete");


        System.out.println("\n=== Test 6: delete ===");
        selerdao.deleteById(8);
        DB.closeConnection();
    }
}
