package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ClothesShop.Dao.Users_Admin_Dao;
import ClothesShop.Entity.Users;


@Service
public class AccountAdServiceImpl {
	
	@Autowired
	Users_Admin_Dao user_Admin_Dao = new Users_Admin_Dao();
	
	public List<Users> GetAllAccount() {
		return user_Admin_Dao.GetAllAccount();
	}
	
	public int AddAccountAd(Users user) {
		return user_Admin_Dao.AddAccountAd(user);
	}
	
	public int DeleteProductAd(Users user) {
		return user_Admin_Dao.DeleteAccountAd(user);
	}
	
	public int EditProductAd(Users user) {
		return user_Admin_Dao.EditAccountAd(user);
	}
}
