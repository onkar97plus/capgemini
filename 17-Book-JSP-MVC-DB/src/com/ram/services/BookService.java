package com.ram.services;

import com.ram.beans.BookBean;
import com.ram.dao.BookDAO;

import java.util.ArrayList;

public class BookService 
{
 public int addBookService(int bookId, String title, float price)
 {
	 //implement the business logic
	 String grade="";
	 if(price <= 300)
	 {
		 grade = "C";
	 }
	 else if(price <= 600)
	 {
		 grade = "B";
	 }
	 else
	 {
		 grade = "A";
	 }
	 
	 BookDAO bookDAO = new BookDAO();
	 BookBean bookBean = new BookBean();
	 //wrap up all the four field values into bean
	 
	 bookBean.setBookId(bookId);
	 bookBean.setTitle(title);
	 bookBean.setPrice(price);
	 bookBean.setGrade(grade);
	 int updateResult = 0;
	 try
	 {
		 updateResult = bookDAO.addBook(bookBean);
		 return updateResult;
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.toString());
		 return 0;
	 }
 }
 
 
 
  public ArrayList getBookDetailsById(int bookId)
  throws Exception
  {
	  BookDAO bookDAO = new BookDAO();
	 ArrayList result =  
		 bookDAO.getBookDetailsById(bookId);
	 
	 return result;
	 
  }
}
