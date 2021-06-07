package ClothesShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.ContactDao;
import ClothesShop.Entity.Contact;
@Service
public class ContactServiceImpl {
	@Autowired
	ContactDao contactDao = new ContactDao();
	public int AddContact(Contact contact) {
		return contactDao.AddContact(contact);
	}
}
