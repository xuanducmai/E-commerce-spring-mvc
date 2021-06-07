package ClothesShop.Service.User;

import org.springframework.stereotype.Service;

import ClothesShop.Entity.Contact;

@Service
public interface IContactService {

	public int AddContact(Contact contact);
}
