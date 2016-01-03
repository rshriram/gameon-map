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
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root of CRUD operations for the logged in developer
 */
@Path("v1/developer")
public class DeveloperResource {
    
    /**
     * GET /map/v1/developer
     * 
     * @return {@link DeveloperInfo} for logged in developer
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeveloper() {
        return Response.ok(new DeveloperInfo()).build();
    }
    
    /**
     * PUT /map/v1/developer
     * 
     * Update the logged in developer
     * 
     * @return {@link DeveloperInfo} for logged in developer
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDeveloper() {
        return Response.ok(new DeveloperInfo()).build();
    }
    
    /**
     * GET /map/v1/developer/rooms
     * 
     * List rooms created/owned by the logged in developer
     * @return list of {@link RoomInfo} created/owned by the developer
     */
    @GET
    @Path("rooms")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeveloperRooms() {
        return Response.ok(Collections.emptyList()).build();
    }
    

    /**
     * POST /map/v1/developer/rooms
     * 
     * Create a new room for the logged in developer
     * @param newRoom Information about the new room
     * @return {@link RoomInfo}
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDeveloperRoom(RoomInfo newRoom) {
        return Response.ok(new RoomInfo()).build();
    }
    
    /**
     * GET /map/v1/developer/rooms/:roomId
     * 
     * Get a specific room created/owned by the logged in developer
     * @param roomId The room's id
     * @return {@link RoomInfo}
     */
    @GET
    @Path("rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeveloperRoom(@PathParam("roomId") int roomId) {
        return Response.ok(new RoomInfo()).build();
    }
    
    /**
     * PUT /map/v1/developer/rooms/:roomId
     * 
     * Update a specific room created/owned by the logged in developer
     * @param roomId The room's id
     * @return {@link RoomInfo}
     */
    @PUT
    @Path("rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDeveloperRoom(@PathParam("roomId") int roomId, RoomInfo newRoom) {
        return Response.ok(Collections.emptyList()).build();
    }
    

    /**
     * DELETE /map/v1/developer/rooms/:roomId
     * 
     * Deletes a single room based on the supplied ids.
     * 
     * @param roomId The identifier of the {@link RoomInfo} to be deleted
     * @return 204 response (no content)
     */
    @DELETE
    @Path("rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteDeveloperRoom(@PathParam("roomId") int roomId) {
        return Response.noContent().build(); // 204. All done.
    }

}
