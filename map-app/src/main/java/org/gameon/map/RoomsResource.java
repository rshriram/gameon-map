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

import java.net.URI;
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
 * Root of CRUD operations on or with rooms
 */
@Path("v1/rooms")
public class RoomsResource {
    
    /**
     * GET /map/v1/rooms
     * 
     * @return list of {@link RoomInfo}
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listRooms() {
        // TODO: query/filter parameters, including specification of fields to include in list.
        
        return Response.ok(Collections.emptyList()).build();
    }

    
    /**
     * GET /map/v1/rooms/:roomId
     * 
     * Get information about a specific room
     * @param roomId The identifier of the {@link RoomInfo} to be returned
     * @return {@link RoomInfo}
     */
    @GET
    @Path("{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoom(@PathParam("roomId") int id) {
        return Response.ok(new RoomInfo()).build();
    }
}
