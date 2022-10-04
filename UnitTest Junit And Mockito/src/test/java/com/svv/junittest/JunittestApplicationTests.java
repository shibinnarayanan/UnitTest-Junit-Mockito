package com.svv.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.svv.junittest.model.UserName;
import com.svv.junittest.repository.UserRepository;
import com.svv.junittest.service.UserService;

@SpringBootTest
class JunittestApplicationTests {

	@Autowired
	UserService userService;
	
    @MockBean
	UserRepository userRepo;
    
    @Test
    @DisplayName("It should give the userlist size as 2")
    public void getAllUserTest() {
    	
    	when(userRepo.findAll()).thenReturn(Stream.of(new UserName(1L,"shibin","india",34),new UserName(2L,"swetha","india",30))
    			.collect(Collectors.toList()));
    	
    	assertEquals(2, userService.getAllUser().size());
    	
    	
    }
    
    @Test
    @DisplayName("It should give the user object for the name shibin")
    public void getUserByNameTest() {
    	String name = "shibin";
    	
    	when(userRepo.findByuser(name)).thenReturn(new UserName(1L,"shibin","india",34));
    	
    	assertEquals(name, userService.getUserByName(name).getUser());
    }
    
    @Test
    @DisplayName("User object should be equal")
    public void addUserTest()
    {
    	UserName user = new UserName(1L,"shibin","india",34);
    	when(userRepo.save(user)).thenReturn(user);
    	
    	assertEquals(user,userService.addUser(user));
    }
    
    @Test
    @DisplayName("User Delete should occur 1 time")
    public void deleteUser()
    {
    	UserName user = new UserName(1L,"shibin","india",34);
    	userService.deleteUser(user);
    	verify(userRepo,times(1)).delete(user);
    }
    

}
