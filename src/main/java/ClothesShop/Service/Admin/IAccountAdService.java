package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import ClothesShop.Entity.Users;

@Service
public interface IAccountAdService {
	public List<Users> GetAllAccount();
	
	public int AddAccountAd(Users user);
	
	public int DeleteAccountAd(Users user);
	
	public int EditAccountAd(Users user);
}
