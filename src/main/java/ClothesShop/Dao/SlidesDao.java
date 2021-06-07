package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.MapperSlides;
import ClothesShop.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao{

	
	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql= "SELECT * FROM slides";
		list= _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
