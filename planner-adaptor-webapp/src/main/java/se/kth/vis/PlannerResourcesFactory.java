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
import se.kth.vis.resources.Plan;

// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class PlannerResourcesFactory {

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    //methods for PlannedAction resource
    public static PlannedAction createPlannedAction(final String plannedActionId)
           throws URISyntaxException
    {
        return new PlannedAction(constructURIForPlannedAction(plannedActionId));
    }
    
    public static URI constructURIForPlannedAction(final String plannedActionId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("plannedActionId", plannedActionId);
        String instanceURI = "service1/plannedActions/{plannedActionId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPlannedAction(final String plannedActionId , final String label)
    {
        return new Link(constructURIForPlannedAction(plannedActionId), label);
    }
    
    public static Link constructLinkForPlannedAction(final String plannedActionId)
    {
        return new Link(constructURIForPlannedAction(plannedActionId));
    }
    

    //methods for Plan resource
    public static Plan createPlan(final String planId)
           throws URISyntaxException
    {
        return new Plan(constructURIForPlan(planId));
    }
    
    public static URI constructURIForPlan(final String planId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("planId", planId);
        String instanceURI = "service2/plans/{planId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    public static Link constructLinkForPlan(final String planId , final String label)
    {
        return new Link(constructURIForPlan(planId), label);
    }
    
    public static Link constructLinkForPlan(final String planId)
    {
        return new Link(constructURIForPlan(planId));
    }
    

}
