/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dit2.servicerest;

import dao.ArticleDao;
import dao.impl.ArticleDaoImpl;
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
    
   
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Article> getArticles(){
        return new ArticleDaoImpl().getAll();
    }
    
    @GET
    @Path("groupbycategorie")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Article> getArticlesGroupByCategorie(){
        return new ArticleDaoImpl().getListGroupeByCategorie();
    }
    
    @GET
    @Path("categorie/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Article> getArticlesByCategorie(@PathParam("id") Long id){
        return new ArticleDaoImpl().getListByCategorie(id);
    }
    
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Article create(@FormParam("titre")String titre,@FormParam("contenu") String contenu){
        Article t = new Article();
        t.setTitre(titre);
        t.setContenu(contenu);
        return new ArticleDaoImpl().create(t);
    }
    
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Article update(@FormParam("titre")String titre,@FormParam("contenu") String contenu){
        Article t = new Article();
        t.setTitre(titre);
        t.setContenu(contenu);
        return new ArticleDaoImpl().update(t);
    }

    @DELETE
    @Path("delete/{id}")
    public boolean delete(@PathParam("id") Long id){
        return new ArticleDaoImpl().delete(id);
    }

    @GET
    @Path("{id}")
    public Article getById(@PathParam("id") Long id) {
        return new ArticleDaoImpl().getById(id);
    }

   

   
}
