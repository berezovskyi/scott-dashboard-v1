/*******************************************************************************
 * Copyright (c) 2015 Jad El-khoury.
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
 *     Jad El-khoury        - initial implementation of client code
 *     
 *******************************************************************************/

package se.kth.vis.clients;

import org.apache.wink.client.ClientResponse;
import org.eclipse.lyo.client.oslc.OSLCConstants;
import org.eclipse.lyo.client.oslc.OslcClient;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import se.kth.vis.resources.PerformedAction;
import se.kth.vis.resources.Plan;
import se.kth.vis.resources.PlannedAction;
import se.kth.vis.resources.Robot;

// Start of user code imports
// End of user code


// Start of user code pre_class_code
// End of user code

public class GenericRequiredAdaptorClient
{

    // Start of user code class_attributes
    // End of user code
    
    // Start of user code class_methods
    // End of user code

    static String serviceProviderCatalogURI = "http://your.host.com/adaptor/services/catalog/singleton";

    public static ServiceProviderCatalog getServiceProviderCatalog() throws Exception {
        OslcClient client = new OslcClient();
        ClientResponse response = null;
        ServiceProviderCatalog catalog = null;

        // Start of user code getServiceProviderCatalog_init
        // End of user code

        response = client.getResource(serviceProviderCatalogURI,OSLCConstants.CT_RDF);
        if (response != null) {
            catalog = response.getEntity(ServiceProviderCatalog.class);
        }
        // Start of user code getServiceProviderCatalog_final
        // End of user code
        return catalog;
    }

    public static PerformedAction getPerformedAction(String resourceURI) throws Exception {
        OslcClient client = new OslcClient();
        ClientResponse response = null;
        PerformedAction resource = null;

        // Start of user code getPerformedAction_init
        // End of user code

        response = client.getResource(resourceURI, OSLCConstants.CT_RDF);
        if (response != null) {
            resource = response.getEntity(PerformedAction.class);
        }
        // Start of user code getPerformedAction_final
        // End of user code
        return resource;
    }

    public static Plan getPlan(String resourceURI) throws Exception {
        OslcClient client = new OslcClient();
        ClientResponse response = null;
        Plan resource = null;

        // Start of user code getPlan_init
        // End of user code

        response = client.getResource(resourceURI, OSLCConstants.CT_RDF);
        if (response != null) {
            resource = response.getEntity(Plan.class);
        }
        // Start of user code getPlan_final
        // End of user code
        return resource;
    }

    public static PlannedAction getPlannedAction(String resourceURI) throws Exception {
        OslcClient client = new OslcClient();
        ClientResponse response = null;
        PlannedAction resource = null;

        // Start of user code getPlannedAction_init
        // End of user code

        response = client.getResource(resourceURI, OSLCConstants.CT_RDF);
        if (response != null) {
            resource = response.getEntity(PlannedAction.class);
        }
        // Start of user code getPlannedAction_final
        // End of user code
        return resource;
    }

    public static Robot getRobot(String resourceURI) throws Exception {
        OslcClient client = new OslcClient();
        ClientResponse response = null;
        Robot resource = null;

        // Start of user code getRobot_init
        // End of user code

        response = client.getResource(resourceURI, OSLCConstants.CT_RDF);
        if (response != null) {
            resource = response.getEntity(Robot.class);
        }
        // Start of user code getRobot_final
        // End of user code
        return resource;
    }
}
