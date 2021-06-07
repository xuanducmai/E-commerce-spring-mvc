package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.Products_Admin_Dao;
import ClothesShop.Entity.ProductForAdmin;

@Service
public class ProductAdServiceImpl {

	@Autowired
	Products_Admin_Dao products_Admin_Dao = new Products_Admin_Dao();
	
	public List<ProductForAdmin> GetAllProduct() {
		return products_Admin_Dao.GetAllProduct();
	}
	
	public int AddProductAd(ProductForAdmin productAd) {
		return products_Admin_Dao.AddProductAd(productAd);
	}
	
	public int DeleteProductAd(ProductForAdmin productAd) {
		return products_Admin_Dao.DeleteProductAd(productAd);
	}
	
	public int EditProductAd(ProductForAdmin productAd) {
		return products_Admin_Dao.EditProductAd(productAd);
	}
}
