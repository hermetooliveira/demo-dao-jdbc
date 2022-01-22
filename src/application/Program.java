package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
			
		/*Instancia uma interface SellerDao. O objeto SellerDao criado (sellerDao) recebe o retorno do método createSellerDao,
		 * a saber, uma interface SellerDao. Esta lógica seria SellerDao sellerDao = new SellerDaoJDBC(), aqui a classe que 
		 * implementa a interface. o "new" fica com a classe que implementa e o objeto é a INTERFACE.		 * 
		 * 
		 * */		
		SellerDao sellerDao = DaoFactory.createSellerDao();// pq o método createSellerDao retorna um sellerDao.
		
		/* instancia um objeto da classe Seller, que receberá o retorno do método da interface SellerDao que está implementado
		 * na classe SellerDaoJDBC
		 *  
		 * */
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list ) {
			System.out.println(obj);
		}

		
	}

}
