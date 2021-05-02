/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import com.google.gson.Gson;
import entity.Universidad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import DAO.UniversidadDAO;
import java.sql.SQLException;

/**
 *
 * @author agutierrez752
 */
@Stateless
@Path("entity.universidad")
public class UniversidadFacadeREST extends AbstractFacade<Universidad> {

    @PersistenceContext(unitName = "webServicesPU")
    private EntityManager em;
    private Gson gson;
    public UniversidadFacadeREST() {
        super(Universidad.class);
        gson = new Gson();
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Universidad entity) {
        super.create(entity);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("RegistrarUniversidad")
    public int añadirUniversidad(String json) throws SQLException
    {
        UniversidadDAO uDao = new UniversidadDAO();
        Universidad universidad = gson.fromJson(json,Universidad.class);
        return uDao.AñadirUniversidad(universidad);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Universidad entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("/Universidad/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public String find(@PathParam("id") Integer id) {
        Universidad universidad = super.find(id);
        Universidad result = new Universidad();
        result.setIdUniversidad(universidad.getIdUniversidad());
        result.setNombreUniversidad(universidad.getNombreUniversidad());
        return  gson.toJson(result);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Universidad> findAll() {
        return super.findAll();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("Universidad/Listar")
    public String BuscarTodos() throws SQLException {
        
        UniversidadDAO uDAO = new UniversidadDAO();
        List<Universidad> lstUniversidad = uDAO.ListarUniversidades();  //super.findAll();
        String result = gson.toJson(lstUniversidad);
        return result;
//        GenericEntity<List<Universidad>> genericEntity = new GenericEntity<List<Universidad>>(lstUniversidad){};
//        return Response.ok(genericEntity, MediaType.APPLICATION_JSON).build();
        //las dos lineas siguientes deserializan
//        Type listType = new TypeToken<ArrayList<Universidad>>(){}.getType();
//        List<Universidad> lstUni = new Gson().fromJson(json,listType);}
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Universidad> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
