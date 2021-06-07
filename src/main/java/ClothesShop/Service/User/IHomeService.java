package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dto.ProductsDto;
import ClothesShop.Entity.Categorys;
import ClothesShop.Entity.Menus;
import ClothesShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	@Autowired
	public List<Categorys> GetDataCategorys();
	@Autowired
	public List<Menus> GetDataMenus();
	@Autowired
	public List<ProductsDto> GetDataProducts();
}