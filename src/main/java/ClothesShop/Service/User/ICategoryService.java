package ClothesShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import ClothesShop.Dto.ProductsDto;
@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
}
