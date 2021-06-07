package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.Bills_Admin_Dao;
import ClothesShop.Entity.Bills;

@Service
public class BillAdServiceImpl {
	
	@Autowired
	Bills_Admin_Dao bills_Admin_Dao = new Bills_Admin_Dao();
	
	public List<Bills> GetAllBill(){
		return bills_Admin_Dao.GetAllBill();
	}
	
}
