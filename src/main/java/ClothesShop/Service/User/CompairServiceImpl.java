package ClothesShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.CompairDao;
import ClothesShop.Dto.ProductsDto;
@Service
public class CompairServiceImpl {
	@Autowired
	CompairDao compairDao = new CompairDao();
	
	public ProductsDto GetProductByID(long id) {
		return compairDao.FindProductByID(id);
	}
}
