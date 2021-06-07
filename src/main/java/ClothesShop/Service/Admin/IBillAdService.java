package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import ClothesShop.Entity.BillDetail;
import ClothesShop.Entity.Bills;

@Service
public interface IBillAdService {
	public List<Bills> GetAllBill();
	
	public List<BillDetail> GetAllBillDetail();
}
