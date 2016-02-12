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

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")

@io.swagger.annotations.SwaggerDefinition(
        info = @io.swagger.annotations.Info(
                    title = "Game On! Map API",
                    version = "1.0"
                ))
public class MapApplicationV1 extends Application {
    /*
     * The context root for this application is /map
     * @ApplicationPath will tuck the entirety of the REST endpoint under v1: /map/v1/
     * Any {@link Path} annotations at the class level are appended onto that, etc.
     */
    
}
