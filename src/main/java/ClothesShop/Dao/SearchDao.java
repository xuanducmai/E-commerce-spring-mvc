 package ClothesShop.Dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Dto.ProductsDto;
import ClothesShop.Dto.ProductsDtoMapper;

@Repository
public class SearchDao extends BaseDao {

	private StringBuffer SqlString(String keyword) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_catogory ");
		sql.append(", p.sizes ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.title ");
		sql.append(", p.highlight ");
		sql.append(", p.new_product ");
		sql.append(", p.details ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.image ");
		sql.append("FROM ");
		sql.append("products AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.id_product ");
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.name LIKE '%"+keyword+"%' ");
		return sql;
	}
	
	
	
	public List<ProductsDto> Search(String keyword){
		String sql = SqlString(keyword).toString();
		List<ProductsDto> productQuery = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return productQuery;
	}
}