package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperProductForAdmin implements RowMapper<ProductForAdmin>{

	public ProductForAdmin mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductForAdmin productAd = new ProductForAdmin();
		productAd.setId_product(rs.getLong("id_product"));
		productAd.setId_catogory(rs.getInt("id_catogory"));
		productAd.setSizes(rs.getString("sizes"));
		productAd.setName(rs.getString("name"));
		productAd.setPrice(rs.getDouble("price"));
		productAd.setSale(rs.getInt("sale"));
		productAd.setTitle(rs.getString("title"));
		productAd.setHighlight(rs.getInt("highlight"));
		productAd.setNew_product(rs.getInt("new_product"));
		productAd.setDetails(rs.getString("details"));
		return productAd;
	}
}
