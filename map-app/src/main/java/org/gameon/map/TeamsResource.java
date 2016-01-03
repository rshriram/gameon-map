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
 * Root of CRUD operations on or with teams that own rooms
 */
@Path("v1/teams")
public class TeamsResource {
    /**
     * GET /map/v1/teams
     * 
     * @return list of {@link TeamInfo}
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listTeams() {
        // TODO: query/filter parameters, including specification of fields to include in list.
        
        return Response.ok(Collections.emptyList()).build();
    }

    /**
     * POST /map/v1/teams
     * 
     * Create a new {@link TeamInfo}
     * @param newTeam Information about the new team
     * @return {@link TeamInfo}
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTeams(TeamInfo newTeam) {
        return Response.ok(new TeamInfo()).build();
    }

    
    /**
     * GET /map/v1/teams/:teamId
     * 
     * Get information about a specific team
     * @param teamId The team identifier
     * @return {@link TeamInfo}
     */
    @GET
    @Path("{teamId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeams(@PathParam("teamId") int teamId) {
        return Response.ok(new TeamInfo()).build();
    }
    
    
    /**
     * DELETE /map/v1/teams/:teamId
     * 
     * Delete a specific team
     * @param teamId The team identifier
     */
    @DELETE
    @Path("{teamId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteTeams(@PathParam("teamId") int teamId) {
        return Response.noContent().build(); // 204. All done.
    }
    
    /**
     * GET /map/v1/teams/:teamId/rooms
     * 
     * Get a specific team's rooms
     * @param teamId The team identifier
     * @return list of {@link RoomInfo} created/owned by the team
     */
    @GET
    @Path("{teamId}/rooms")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeamsRooms(@PathParam("teamId") int teamId) {
        return Response.ok(Collections.emptyList()).build();
    }
    
    /**
     * POST /map/v1/teams/:teamId/rooms
     * 
     * Create a new room for the selected team
     * @param teamId The team identifier
     * @param newRoom Information about the new room
     * @return {@link RoomInfo}
     */
    @POST
    @Path("{teamId}/rooms")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTeamsRooms(@PathParam("teamId") int teamId, RoomInfo newRoom) {
        return Response.ok(new RoomInfo()).build();
    }
    
    /**
     * GET /map/v1/teams/:teamId/rooms/:roomId
     * 
     * Get a specific room created/owned by the specified team
     * @param teamId The team identifier
     * @param roomId The room's id
     * @return {@link RoomInfo}
     */
    @GET
    @Path("{teamId}/rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeamsRoom(@PathParam("teamId") int teamId, @PathParam("roomId") int roomId) {
        return Response.ok(new RoomInfo()).build();
    }
    
    /**
     * PUT /map/v1/teams/:teamId/rooms/:roomId
     * 
     * Update a specific room created/owned by the specified team
     * @param teamId The team identifier
     * @param roomId The room's id
     * @param newRoom Information about the room to update/replace
     * @return {@link RoomInfo}
     */
    @PUT
    @Path("{teamId}/rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateTeamsRoom(@PathParam("teamId") int teamId, @PathParam("roomId") int roomId, RoomInfo newRoom) {
        return Response.ok(new RoomInfo()).build();
    }
    

    /**
     * DELETE /map/v1/teams/:teamId/rooms/:roomId
     * 
     * Deletes a single room based on the supplied id.
     * 
     * @param teamId The team identifier
     * @param roomId The identifier of the {@link RoomInfo} to be deleted
     * @return 204 response (no content)
     */
    @DELETE
    @Path("{teamId}/rooms/{roomId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteTeamsRoom(@PathParam("teamId") int teamId, @PathParam("roomId") int roomId) {
        return Response.noContent().build(); // 204. All done.
    }

}
