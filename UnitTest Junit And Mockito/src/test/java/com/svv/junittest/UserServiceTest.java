//package com.svv.junittest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.svv.junittest.model.UserName;
//import com.svv.junittest.repository.UserRepository;
//import com.svv.junittest.service.UserService;
//
//
//
//
//
//@SpringBootTest
//class UserServiceTest {
//	
//	@Autowired
//	UserService userServ;
//	
//	@MockBean
//	UserRepository userRepo;
//
//	@Test
//	@DisplayName("It should give the userlist size as 2")
//	public void getAllUsersTest() {
//		
//		when(userRepo.findAll())
//		.thenReturn(Stream.of(new UserName(1L,"swetha","india",30),new UserName(2L,"shibin","india",34))
//		.collect(Collectors.toList()));
//		
//		assertEquals(2, userServ.getAllUser().size());
//	}
//	
//	@Test
//	@DisplayName("should return correct user object against the user name")
//	public void getUserByNameTest()
//	{
//		String name = "swetha";
//		when(userRepo.findByuser(name))
//		.thenReturn(new UserName(1L,"swetha","india",30));
//		
//		assertEquals(name, userServ.getUserByName(name).getUser());
//	}
//	
//	@Test
//	@DisplayName("Save user - Test")
//    public void saveUserTest()
//    {
//		UserName user = new UserName(1L,"swetha","india",30);
//		when(userRepo.save(user)).thenReturn(user);
//		
//		assertEquals(user, userServ.addUser(user));
//    }
//}
