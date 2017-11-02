/*******************************************************************************
 * Copyright (c) 2017 Jad El-khoury.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Jad El-khoury        - initial implementation
 *     
 *******************************************************************************/

package se.kth.vis;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import se.kth.vis.resources.PerformedAction;
import se.kth.vis.resources.PlannedAction;
import se.kth.vis.resources.Action;
import se.kth.vis.resources.WayPoint;
import se.kth.vis.resources.Place;
import se.kth.vis.resources.Nsp1Object;
import se.kth.vis.resources.Robot;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class Robot2ResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for PerformedAction resource
    public static PerformedAction createPerformedAction(final String performedActionId)
           throws URISyntaxException
    {
        return new PerformedAction(constructURIForPerformedAction(performedActionId));
    }
    
    public static URI constructURIForPerformedAction(final String performedActionId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("performedActionId", performedActionId);
        String instanceURI = "service2/performedActions/{performedActionId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPerformedAction(final String performedActionId , final String label)
    {
        return new Link(constructURIForPerformedAction(performedActionId), label);
    }
    
    public static Link constructLinkForPerformedAction(final String performedActionId)
    {
        return new Link(constructURIForPerformedAction(performedActionId));
    }
    

    //methods for Robot resource
    public static Robot createRobot(final String robotId)
           throws URISyntaxException
    {
        return new Robot(constructURIForRobot(robotId));
    }
    
    public static URI constructURIForRobot(final String robotId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("robotId", robotId);
        String instanceURI = "service1/robots/{robotId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForRobot(final String robotId , final String label)
    {
        return new Link(constructURIForRobot(robotId), label);
    }
    
    public static Link constructLinkForRobot(final String robotId)
    {
        return new Link(constructURIForRobot(robotId));
    }
    

}
