/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ArticleDao;
import domaine.Article;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */

@Path("article")
public class ArticleRessource {
    
   
    public List<Article> getArticles(){
        return null;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Article> getArticlesGroupByCategorie(){
        return null;
    }
    
    @GET
    @Path("categorie/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Article> getArticlesByCategorie(@PathParam("id") Long id){
        return null;
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Article create(@FormParam("titre")String titre,@FormParam("contenu") String contenu){
        
        return null;
    }
    
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Article update(@FormParam("titre")String titre,@FormParam("contenu") String contenu){
        return null;
    }

    @DELETE
    @Path("delete/{id}")
    public List<Article> delete(@PathParam("id") Long id){
        return null;
    }

    @GET
    @Path("{id}")
    public Article getById(@PathParam("id") Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
