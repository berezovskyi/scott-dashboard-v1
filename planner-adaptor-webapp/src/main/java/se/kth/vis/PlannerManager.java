/*******************************************************************************
 * Copyright (c) 2011, 2012 IBM Corporation and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *  
 *  Contributors:
 *  
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package se.kth.vis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import se.kth.vis.servlet.ServiceProviderCatalogSingleton;
import se.kth.vis.ServiceProviderInfo;
import se.kth.vis.resources.Action;
import se.kth.vis.resources.Nsp1Object;
import se.kth.vis.resources.PerformedAction;
import se.kth.vis.resources.Place;
import se.kth.vis.resources.Plan;
import se.kth.vis.resources.PlannedAction;
import se.kth.vis.resources.Robot;
import se.kth.vis.resources.WayPoint;


// Start of user code imports
import java.util.concurrent.ThreadLocalRandom;
import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.lyo.oslc4j.core.model.Link;
import java.util.ArrayList;
// End of user code

// Start of user code pre_class_code
// End of user code

public class PlannerManager {

    // Start of user code class_attributes
	private static final Logger log = LoggerFactory.getLogger(PlannerManager.class);
    // End of user code
    
    
    // Start of user code class_methods
	private static int randomNumber(int origin, int bound) {
		return ThreadLocalRandom.current().nextInt(origin, bound);
	}

	private static boolean randomBoolean() {
		if (ThreadLocalRandom.current().nextInt(0, 2) == 0) {
			return true;
		}
		return false;
	}

	//TODO: THis needs to be replaced with a query
	private static URI createRandomRobotUri(String id) throws URISyntaxException {
		return new URI ("http://localhost:8088/robot1/services/service1/robots/" + id);
	}

	private static PlannedAction createRandomPlannedAction(String id) {
		PlannedAction r = null;
		try {
			r = PlannerResourcesFactory.createPlannedAction(id);
			r.setComplete(randomBoolean());
			r.setStartTime(0);
			r.setEndTime(-1);
			r.setChargeCost(randomNumber(0, 100));
			r.setEffect(randomBoolean());
		} catch (URISyntaxException e) {
            log.error("Failed to create resource", e);
		}
		return r;
	}

	private static Plan createRandomPlan(String id) {
		Plan r = null;
		try {
			r = PlannerResourcesFactory.createPlan(id);

			for (int i = 0; i < randomNumber(0, 20); i++) {
				PlannedAction s = createRandomPlannedAction(Integer.toString(randomNumber(0, 5000)));
				r.addHas(new Link(s.getAbout()));
			}
			for (int i = 0; i < randomNumber(0, 20); i++) {
				URI s = createRandomRobotUri(Integer.toString(randomNumber(0, 10000)));
				r.addPerformedBy(new Link(s));
			}
		} catch (URISyntaxException e) {
            log.error("Failed to create resource", e);
		}
		return r;
	}
    // End of user code

    public static void contextInitializeServletListener(final ServletContextEvent servletContextEvent)
    {
        
        // Start of user code contextInitializeServletListener
        // TODO Implement code to establish connection to data backbone etc ...
        // End of user code
    }

    public static void contextDestroyServletListener(ServletContextEvent servletContextEvent) 
    {
        
        // Start of user code contextDestroyed
        // TODO Implement code to shutdown connections to data backbone etc...
        // End of user code
    }

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
        ServiceProviderInfo[] serviceProviderInfos = {};
        
        // Start of user code "ServiceProviderInfo[] getServiceProviderInfos(...)"
        ServiceProviderInfo r = new ServiceProviderInfo();
        r.name = "the only SP"; 
        r.serviceProviderId = "1";
        serviceProviderInfos = new ServiceProviderInfo[1];
        serviceProviderInfos[0] = r;
        // End of user code
        return serviceProviderInfos;
    }

    public static List<PlannedAction> queryPlannedActions(HttpServletRequest httpServletRequest, String where, int page, int limit)
    {
        List<PlannedAction> resources = null;
        
        // Start of user code queryPlannedActions
		int size = randomNumber(0, 10);
    	resources = new ArrayList<PlannedAction>(size);
		for (int i = 0; i < size; i++) {
	    	resources.add(createRandomPlannedAction(Integer.toString(randomNumber(0, 10000))));
		}
        // End of user code
        return resources;
    }


    public static PlannedAction getPlannedAction(HttpServletRequest httpServletRequest, final String plannedActionId)
    {
        PlannedAction aResource = null;
        
        // Start of user code getPlannedAction
        aResource = createRandomPlannedAction(plannedActionId);
        // End of user code
        return aResource;
    }



    public static List<Plan> queryPlans(HttpServletRequest httpServletRequest, String where, int page, int limit)
    {
        List<Plan> resources = null;
        
        // Start of user code queryPlans
		int size = randomNumber(0, 10);
    	resources = new ArrayList<Plan>(size);
		for (int i = 0; i < size; i++) {
	    	resources.add(createRandomPlan(Integer.toString(randomNumber(0, 10000))));
		}
        // End of user code
        return resources;
    }


    public static Plan getPlan(HttpServletRequest httpServletRequest, final String planId)
    {
        Plan aResource = null;
        
        // Start of user code getPlan
        aResource = createRandomPlan(planId);
        // End of user code
        return aResource;
    }




    public static String getETagFromPlannedAction(final PlannedAction aResource)
    {
        String eTag = null;
        // Start of user code getETagFromPlannedAction
        // TODO Implement code to return an ETag for a particular resource
        // End of user code
        return eTag;
    }
    public static String getETagFromPlan(final Plan aResource)
    {
        String eTag = null;
        // Start of user code getETagFromPlan
        // TODO Implement code to return an ETag for a particular resource
        // End of user code
        return eTag;
    }

}
