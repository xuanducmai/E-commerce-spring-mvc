package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import ClothesShop.Entity.ProductForAdmin;

@Service
public interface IProductAdService {
	public List<ProductForAdmin> GetAllProduct();
	
	public int AddProductAd(ProductForAdmin productAd);
	
	public int DeleteProductAd(ProductForAdmin productAd);
	
	public int EditProductAd(ProductForAdmin productAd);
}
