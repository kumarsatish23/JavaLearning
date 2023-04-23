package com.vanna.RestService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vanna.RestModel.Author;


@Path("/book")
public class AuthorService {
	
	 @GET
	 @Path("/gettext")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String getData()
	 {
		 return "Hi Saivarma";
	 }
	 
	 
	 @POST
	 @Path("/save")
	 @Consumes(MediaType.APPLICATION_JSON)
	 public void createAuthor(Author author) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("AuthorService");
				EntityManager entityManager = emf.createEntityManager();
				EntityTransaction transaction = entityManager.getTransaction();
				transaction.begin();

//				Author author = new Author();
//				author.setId(1);
//				author.setName("Saivarma");
//				author.setBook()

				entityManager.merge(author);

				transaction.commit();
	 }
	 
}
