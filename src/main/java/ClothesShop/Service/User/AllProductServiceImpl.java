package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.ProductsDao;
import ClothesShop.Dto.ProductsDto;

@Service
public class AllProductServiceImpl implements IAllProductService{
	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	public List<ProductsDto> GetAllProduct() {
		return productDao.GetAllProduct();
	}
	
	public List<ProductsDto> GetDataProductPaginate(int start, int totalPage) {
		return productDao.GetDataProductPaginate(start, totalPage);
	}
}
