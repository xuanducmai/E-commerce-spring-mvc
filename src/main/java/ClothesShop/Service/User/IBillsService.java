package ClothesShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import ClothesShop.Dto.CartDto;
import ClothesShop.Entity.Bills;

@Service
public interface IBillsService {	
	public int AddBills(Bills bill);
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts);

}
