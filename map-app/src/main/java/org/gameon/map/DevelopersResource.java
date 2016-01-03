/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.gameon.map;

import java.util.Collections;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root of CRUD operations on or with developers of rooms
 */
@Path("v1/developers")
public class DevelopersResource {
    
    /**
     * GET /map/v1/developers
     * 
     * @return list of {@link DeveloperInfo}
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listDevelopers() {
        // TODO: query/filter parameters, including specification of fields to include in list.
        
        return Response.ok(Collections.emptyList()).build();
    }

    /**
     * POST /map/v1/developers
     * 
     * Create a new {@link DeveloperInfo}
     * @param newDeveloper Information about the new developer
     * @return {@link DeveloperInfo}
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDeveloper(DeveloperInfo newDeveloper) {
        return Response.ok(new DeveloperInfo()).build();
    }

    
    /**
     * GET /map/v1/developers/:devId
     * 
     * Get information about a specific developer
     * @param devId The identifier of the {@link DeveloperInfo} to be returned
     * @return {@link DeveloperInfo}
     */
    @GET
    @Path("{devId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDevelopers(@PathParam("devId") int id) {
        return Response.ok(new DeveloperInfo()).build();
    }
    
    /**
     * GET /map/v1/developers/:devId/rooms
     * 
     * Get a specific developer's rooms
     * @param devId The developer's id
     * @return list of {@link RoomInfo} created/owned by the developer
     */
    @GET
    @Path("{devId}/rooms")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDevelopersRooms(@PathParam("devId") int id) {
        return Response.ok(Collections.emptyList()).build();
    }
    

    /**
     * GET /map/v1/developers/:devId/rooms/:roomId
     * 
     * Get a specific developer's rooms
     * @param devId The developer's id
     * @param roomId The room's id
     * @return {@link RoomInfo}
     */
    @GET
    @Path("{devId}/rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDevelopersRoom(@PathParam("devId") int devId, @PathParam("roomId") int roomId) {
        return Response.ok(Collections.emptyList()).build();
    }
}
