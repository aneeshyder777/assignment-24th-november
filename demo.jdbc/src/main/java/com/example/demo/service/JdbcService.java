package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Entity.Groceries;

@Service
public class JdbcService {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void executeMe()
	{
		//Groceries g1=new Groceries();
		//g1.setId(10);
		//g1.setName("snacks");
		//g1.setQuantity("100kg");
		//g1.setPrice(70);
		
		
		jdbcTemplate.execute("Create Table grocries(Id int primary key,name varchar(20),quantity varchar(20),price varchar(20))  ");
		
		jdbcTemplate.update("Insert into grocries values(103,'rice','1000kg',100000)");
		
		jdbcTemplate.update("Insert into grocries values(104,'cerials','100kg',10000)");
		
		jdbcTemplate.update("update grocries set name='dates' where id=104");
		
		jdbcTemplate.update("Delete from grocries where Id=10");
		
		/*Book b1=new Book();
		b1.setId(102);
		b1.setTitle("The monk ");
		b1.setAuthName("Robin Sharma");
		
		
		Book b2=new Book();
		b2.setId(103);
		b2.setTitle("Autobiography ");
		b2.setAuthName("MK Gandhi");
		
		List<Book> book=new ArrayList<>();
		book.add(b1);
		book.add(b2); */
	    
		//book.forEach(x -> jdbcTemplate.update("Insert into Book321 values(?,?,?)",x.getId(),x.getTitle(),x.getAuthName()));
		
		
		//book=jdbcTemplate.query("select * from book321",(rs,noofrows) -> new Book(rs.getInt("Id"),rs.getString("Title"),rs.getString("Authname")));
		//book.forEach(s -> System.out.println(s));
		
		
		//jdbcTemplate.execute("Create Table Book321(Id int primary key,Title varchar(20),AuthName varchar(20))  ");
		//jdbcTemplate.update("Insert into book321 values(103,'lesmisrebles','Victor Hugo')");
		//jdbcTemplate.update("Insert into book321 values(102,'HTML','Anees')");
		//jdbcTemplate.update("update Book321 set Title='CSS' where id=102");
		//jdbcTemplate.update("Delete from book321 where Id=102");
		
		//book.forEach(x -> jdbcTemplate.update("update book321 set Title='Python' where Id=102"));
	}

}
