/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
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
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package se.kth.vis.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import se.kth.vis.resources.Nsp1Constants;
import se.kth.vis.resources.Nsp1Constants;
import se.kth.vis.resources.PlannedAction;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Nsp1Constants.WAREHOUSE_NAMSPACE)
@OslcName(Nsp1Constants.PERFORMEDACTION)
@OslcResourceShape(title = "Performed Action Resource Shape", describes = Nsp1Constants.TYPE_PERFORMEDACTION)
public class PerformedAction
    extends Action
    implements IPerformedAction
{
    // Start of user code attributeAnnotation:realizes
    // End of user code
    private Link realizes = new Link();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public PerformedAction()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public PerformedAction(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public PerformedAction(final String performedActionId)
           throws URISyntaxException
    {
        this (constructURI(performedActionId));
        // Start of user code constructor3
        // End of user code
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static URI constructURI(final String performedActionId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("performedActionId", performedActionId);
        String instanceURI = "service2/performedActions/{performedActionId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String performedActionId , final String label)
    {
        return new Link(constructURI(performedActionId), label);
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String performedActionId)
    {
        return new Link(constructURI(performedActionId));
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Nsp1Constants.PATH_PERFORMEDACTION,
        PerformedAction.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Performed Action Resource} - update Performed Action.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\" class=\"oslc-resource-link\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:realizes
    // End of user code
    @OslcName("realizes")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "realizes")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Nsp1Constants.TYPE_PLANNEDACTION})
    @OslcReadOnly(false)
    public Link getRealizes()
    {
        // Start of user code getterInit:realizes
        // End of user code
        return realizes;
    }
    
    
    // Start of user code setterAnnotation:realizes
    // End of user code
    public void setRealizes(final Link realizes )
    {
        // Start of user code setterInit:realizes
        // End of user code
        this.realizes = realizes;
    
        // Start of user code setterFinalize:realizes
        // End of user code
    }
    
    
    static public String realizesToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:realizesToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"realizes\">realizes: </LABEL>";
    
        // Start of user code "Mid:realizesToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:realizesToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String realizesToHtml()
    {
        String s = "";
    
        // Start of user code realizestoHtml_mid
        // End of user code
    
        try {
            if ((realizes == null) || (realizes.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new PlannedAction (realizes.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code realizestoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
