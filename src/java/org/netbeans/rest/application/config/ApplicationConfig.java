/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author agutierrez752
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(entity.service.CatedraFacadeREST.class);
        resources.add(entity.service.DepartamentoFacadeREST.class);
        resources.add(entity.service.OrdenMeritoFacadeREST.class);
        resources.add(entity.service.PostulanteFacadeREST.class);
        resources.add(entity.service.PostulanteVacanteFacadeREST.class);
        resources.add(entity.service.UniversidadFacadeREST.class);
        resources.add(entity.service.UsuarioFacadeREST.class);
        resources.add(entity.service.VacanteFacadeREST.class);
    }
    
}
