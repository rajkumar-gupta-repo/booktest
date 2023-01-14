package com.test.books.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.books.model.Book;

@Controller
public class BookController {
	
	private static Logger logger=Logger.getLogger(BookController.class);
	static {
		PropertyConfigurator.configure("src/main/java/log4j.properties");
	}
	
	@GetMapping("/books")
	public String getbooks( Model model) {
		logger.debug("get book called ");
		Book b = new Book();
		b.setId(101);
		b.setName("Python");
		b.setPrice(1223.00);
		model.addAttribute("books", b);
		logger.debug("End of getbook()");
		return "books";
		
		
	}
	
	@GetMapping("/")
	public ModelAndView getallbooks() {
		
		Book b1 = new Book();
		b1.setId(101);
		b1.setName("Java");
		b1.setPrice(123.00);
		
		Book b2 = new Book();
		b2.setId(102);
		b2.setName("Python");
		b2.setPrice(143.00);
		
		Book b3 = new Book();
		b3.setId(104);
		b3.setName("C");
		b3.setPrice(873.00);
		
		Book b4 = new Book();
		b4.setId(103);
		b4.setName("C++");
		b4.setPrice(1723.00);
		
		Book b5 = new Book();
		b5.setId(105);
		b5.setName("Dot Net");
		b5.setPrice(783.00);
		
		List l1 =new ArrayList();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("books", l1);
		mav.setViewName("booklist");
		
		
		
		return mav;
	}

}
