package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
public static void main(String[] args) {
	List<User>users = new ArrayList<User>();
	users.add(new User(1, "nishi", "secret", "nishi@gmail.com"));
	users.add(new User(2, "tony", "secret", "tony@gmail.com"));
	users.add(new User(3, "tom", "secret", "tom@gmail.com"));
	users.add(new User(4, "jack", "secret", "jack@gmail.com"));
	
	//map user to UserDTO object
	List<UserDTO>userDTO = new ArrayList<UserDTO>();
	for(User user:users) {
		userDTO.add (new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
	}
	for(UserDTO userdto:userDTO) {
		System.out.println(userdto);
	}
	//Using stream map method //anonymous method
	
	users.stream().map(new Function<User, UserDTO>() {
		@Override
		public UserDTO apply(User user) {			
			return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
			
		}
	});
	
	//Using stream map method //lambda expression
	
	users.stream().map((User user) -> 
	new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
	.forEach((UserDTO userDTO2)->System.out.println(userDTO2));	
	
	//Using stream map method //lambda expression //collect method
	
		List<UserDTO>userDTOs = users.stream().map((User user) -> new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
	.collect(Collectors.toList());
		userDTOs.forEach(System.out::println);
}
}

class UserDTO{
	//when we map User object to UserDTO object(data transfer object) dont map password
	//as we do not want to send password to the client.
	
	private int id;
	private String userName;
	private String email;
	
	
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
}
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}
