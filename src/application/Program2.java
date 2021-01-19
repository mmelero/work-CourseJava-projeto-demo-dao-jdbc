package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Department> list = new ArrayList<>();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(2);
		
		System.out.println("=== TEST 1: Department findById =====");
		System.out.println(dep);

		System.out.println("\n=== TEST 2 : Department findAll =====");
		list = departmentDao.findAll();
		for(Department department : list) {
			System.out.println(department);
		}
 
		System.out.println("\n=== TEST 3: Department Insert =====");
		Department newDepartment = new Department(null, "Novo Depto");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());

		list = departmentDao.findAll();
		for(Department department : list) {
			System.out.println(department);
		}

		System.out.println("\n=== TEST 4: Department Update =====");
		dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Updat complete!");
		
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 5: Department Delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");
		
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
	}

}
