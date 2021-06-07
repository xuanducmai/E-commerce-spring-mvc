package ClothesShop.Service.User;

import org.springframework.stereotype.Service;

import ClothesShop.Dto.ProductsDto;

@Service
public interface ICompairService {
	
	public ProductsDto GetProductByID(long id);
}
