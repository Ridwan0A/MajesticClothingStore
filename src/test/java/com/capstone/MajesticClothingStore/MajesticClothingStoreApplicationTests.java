package com.capstone.MajesticClothingStore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capstone.MajesticClothingStore.dao.AccountDAO;


@SpringBootTest (classes = MajesticClothingStoreApplication.class)
public class MajesticClothingStoreApplicationTests {

	@Autowired
    private AccountDAO accountDAO;
	
	@Test
	void testDAO() {
		Assertions.assertNotNull(accountDAO);
	}
	
	@Test 
	void testIfFindAccountIsNotNull() {
		Assertions.assertNotNull(AccountDAO.class);
	}

}
