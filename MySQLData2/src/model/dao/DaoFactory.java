package model.dao;
import db.DB;
import model.dao.Ipml.DepartmentDaoJdbc;
import model.dao.Ipml.SellerDaoJdbc;

import java.sql.Connection;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJdbc(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJdbc(DB.getConnection());
    }
}