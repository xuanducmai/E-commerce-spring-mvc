package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperContact implements RowMapper<Contact>{

	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getLong("id"));
		contact.setName_user(rs.getString("name_user"));
		contact.setEmail(rs.getString("email"));
		contact.setSubject(rs.getString("subject"));
		contact.setContent(rs.getString("content"));
		return contact;
	}
}
