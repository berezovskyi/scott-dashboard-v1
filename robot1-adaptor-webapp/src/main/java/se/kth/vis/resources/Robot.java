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
import se.kth.vis.resources.Nsp1Object;
import se.kth.vis.resources.WayPoint;
import se.kth.vis.resources.PerformedAction;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Nsp1Constants.WAREHOUSE_NAMSPACE)
@OslcName(Nsp1Constants.ROBOT)
@OslcResourceShape(title = "Robot Resource Shape", describes = Nsp1Constants.TYPE_ROBOT)
public class Robot
    extends AbstractResource
    implements IRobot
{
    // Start of user code attributeAnnotation:performs
    // End of user code
    private HashSet<Link> performs = new HashSet<Link>();
    // Start of user code attributeAnnotation:type
    // End of user code
    private String type;
    // Start of user code attributeAnnotation:batteryLevel
    // End of user code
    private Integer batteryLevel;
    // Start of user code attributeAnnotation:state
    // End of user code
    private String state;
    // Start of user code attributeAnnotation:isAt
    // End of user code
    private Link isAt = new Link();
    // Start of user code attributeAnnotation:carrying
    // End of user code
    private HashSet<Link> carrying = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Robot()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Robot(final URI about)
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
    public Robot(final String robotId)
           throws URISyntaxException
    {
        this (constructURI(robotId));
        // Start of user code constructor3
        // End of user code
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static URI constructURI(final String robotId)
    {
        String basePath = OSLC4JUtils.getServletURI();
        Map<String, Object> pathParameters = new HashMap<String, Object>();
        pathParameters.put("robotId", robotId);
        String instanceURI = "service1/robots/{robotId}";
    
        final UriBuilder builder = UriBuilder.fromUri(basePath);
        return builder.path(instanceURI).buildFromMap(pathParameters);
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String robotId , final String label)
    {
        return new Link(constructURI(robotId), label);
    }
    
    /**
    * @deprecated Use the methods in class {@link se.kth.vis.Robot1ResourcesFactory} instead.
    */
    @Deprecated
    public static Link constructLink(final String robotId)
    {
        return new Link(constructURI(robotId));
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Nsp1Constants.PATH_ROBOT,
        Robot.class);
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
            result = result + "{a Local Robot Resource} - update Robot.toString() to present resource as desired.";
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
    
    public void addPerforms(final Link performs)
    {
        this.performs.add(performs);
    }
    
    public void addCarrying(final Link carrying)
    {
        this.carrying.add(carrying);
    }
    
    
    // Start of user code getterAnnotation:performs
    // End of user code
    @OslcName("performs")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "performs")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Nsp1Constants.TYPE_PERFORMEDACTION})
    @OslcReadOnly(false)
    public HashSet<Link> getPerforms()
    {
        // Start of user code getterInit:performs
        // End of user code
        return performs;
    }
    
    // Start of user code getterAnnotation:type
    // End of user code
    @OslcName("type")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "type")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getType()
    {
        // Start of user code getterInit:type
        // End of user code
        return type;
    }
    
    // Start of user code getterAnnotation:batteryLevel
    // End of user code
    @OslcName("batteryLevel")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "batteryLevel")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Integer)
    @OslcReadOnly(false)
    public Integer getBatteryLevel()
    {
        // Start of user code getterInit:batteryLevel
        // End of user code
        return batteryLevel;
    }
    
    // Start of user code getterAnnotation:state
    // End of user code
    @OslcName("state")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "state")
    @OslcDescription("")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"idle", "active"})
    public String getState()
    {
        // Start of user code getterInit:state
        // End of user code
        return state;
    }
    
    // Start of user code getterAnnotation:isAt
    // End of user code
    @OslcName("isAt")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "isAt")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Nsp1Constants.TYPE_WAYPOINT})
    @OslcReadOnly(false)
    public Link getIsAt()
    {
        // Start of user code getterInit:isAt
        // End of user code
        return isAt;
    }
    
    // Start of user code getterAnnotation:carrying
    // End of user code
    @OslcName("carrying")
    @OslcPropertyDefinition(Nsp1Constants.WAREHOUSE_NAMSPACE + "carrying")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Nsp1Constants.TYPE_NSP1OBJECT})
    @OslcReadOnly(false)
    public HashSet<Link> getCarrying()
    {
        // Start of user code getterInit:carrying
        // End of user code
        return carrying;
    }
    
    
    // Start of user code setterAnnotation:performs
    // End of user code
    public void setPerforms(final HashSet<Link> performs )
    {
        // Start of user code setterInit:performs
        // End of user code
        this.performs.clear();
        if (performs != null)
        {
            this.performs.addAll(performs);
        }
    
        // Start of user code setterFinalize:performs
        // End of user code
    }
    
    // Start of user code setterAnnotation:type
    // End of user code
    public void setType(final String type )
    {
        // Start of user code setterInit:type
        // End of user code
        this.type = type;
    
        // Start of user code setterFinalize:type
        // End of user code
    }
    
    // Start of user code setterAnnotation:batteryLevel
    // End of user code
    public void setBatteryLevel(final Integer batteryLevel )
    {
        // Start of user code setterInit:batteryLevel
        // End of user code
        this.batteryLevel = batteryLevel;
    
        // Start of user code setterFinalize:batteryLevel
        // End of user code
    }
    
    // Start of user code setterAnnotation:state
    // End of user code
    public void setState(final String state )
    {
        // Start of user code setterInit:state
        // End of user code
        this.state = state;
    
        // Start of user code setterFinalize:state
        // End of user code
    }
    
    // Start of user code setterAnnotation:isAt
    // End of user code
    public void setIsAt(final Link isAt )
    {
        // Start of user code setterInit:isAt
        // End of user code
        this.isAt = isAt;
    
        // Start of user code setterFinalize:isAt
        // End of user code
    }
    
    // Start of user code setterAnnotation:carrying
    // End of user code
    public void setCarrying(final HashSet<Link> carrying )
    {
        // Start of user code setterInit:carrying
        // End of user code
        this.carrying.clear();
        if (carrying != null)
        {
            this.carrying.addAll(carrying);
        }
    
        // Start of user code setterFinalize:carrying
        // End of user code
    }
    
    
    static public String performsToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:performsToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"performs\">performs: </LABEL>";
    
        // Start of user code "Mid:performsToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:performsToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String typeToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:typeToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"type\">type: </LABEL>";
    
        // Start of user code "Mid:typeToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"type\" type=\"text\" style=\"width: 400px\" id=\"type\" >";
        // Start of user code "Finalize:typeToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String batteryLevelToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:batteryLevelToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"batteryLevel\">batteryLevel: </LABEL>";
    
        // Start of user code "Mid:batteryLevelToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"batteryLevel\" type=\"text\" style=\"width: 400px\" id=\"batteryLevel\" >";
        // Start of user code "Finalize:batteryLevelToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String stateToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:stateToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"state\">state: </LABEL>";
    
        // Start of user code "Mid:stateToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"state\" type=\"text\" style=\"width: 400px\" id=\"state\" >";
        // Start of user code "Finalize:stateToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String isAtToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:isAtToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"isAt\">isAt: </LABEL>";
    
        // Start of user code "Mid:isAtToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:isAtToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String carryingToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:carryingToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"carrying\">carrying: </LABEL>";
    
        // Start of user code "Mid:carryingToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:carryingToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String performsToHtml()
    {
        String s = "";
    
        // Start of user code performstoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : performs) {
                s = s + "<li>";
                s = s + (new PerformedAction (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code performstoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String typeToHtml()
    {
        String s = "";
    
        // Start of user code typetoHtml_mid
        // End of user code
    
        try {
            if (type == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + type.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code typetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String batteryLevelToHtml()
    {
        String s = "";
    
        // Start of user code batteryLeveltoHtml_mid
        // End of user code
    
        try {
            if (batteryLevel == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + batteryLevel.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code batteryLeveltoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String stateToHtml()
    {
        String s = "";
    
        // Start of user code statetoHtml_mid
        // End of user code
    
        try {
            if (state == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + state.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code statetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String isAtToHtml()
    {
        String s = "";
    
        // Start of user code isAttoHtml_mid
        // End of user code
    
        try {
            if ((isAt == null) || (isAt.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new WayPoint (isAt.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code isAttoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String carryingToHtml()
    {
        String s = "";
    
        // Start of user code carryingtoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : carrying) {
                s = s + "<li>";
                s = s + (new Nsp1Object (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code carryingtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
