package ClothesShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import ClothesShop.Dto.ProductsDto;

@Service
public interface IAllProductService {

	public List<ProductsDto> GetAllProduct();
}
