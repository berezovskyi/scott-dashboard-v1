<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%--
 Copyright (c) 2017 KTH Royal Institute of Technology.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:
     Jad El-khoury        - initial implementation of ResourceShape HTML presentation
     Andrew Berezovskyi   - conversion into Bootstrap

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@page import="java.util.List" %>
<%@page import="java.net.URI" %>
<%@page import="org.eclipse.lyo.oslc4j.core.model.ResourceShape"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.Property"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.OslcConstants"%>

<%--
Start of user code imports
--%>
<%--
End of user code
--%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
  ResourceShape aResourceShape = (ResourceShape) request.getAttribute("aResourceShape");
%>
<%--
Start of user code getRequestAttributes
--%>
<%--
End of user code
--%>

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title><%= aResourceShape.getTitle() %></title>

        <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

        <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
        <script src="<c:url value="/static/js/popper-1.11.0.min.js"/>"></script>
        <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>
        <script src="<c:url value="/static/js/preview.js"/>"></script>

        <%--
      Start of user code (RECOMMENDED) headStuff
      --%>
        <%--
      End of user code
      --%>

    </head>
    <body>

    <nav class="navbar sticky-top navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="<c:url value="/services/catalog/singleton"/>">Planner</a>
        </div>
    </nav>


    <div class="container">
            <div class="row">
                <div class="col-md-12" id="page-index">
                    <h1>Shape "<%=aResourceShape.getTitle()%>"</h1>
                    
                    <p class="lead">
                      About URI:
                      <code><%=aResourceShape.getAbout()%></code>
                    </p>

                    <h2>Describes</h2>
                    <ul>
                        <%for(URI next : aResourceShape.getDescribes()) {%>
                            <li>
                                <a href="<%=next%>">
                                    <%= next.toString().split("#")[1]%></a>
                            </li>
                        <%}%>
                    </ul>
                    <h2>Properties</h2>
                    <table class="table">
                        <tr>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Prefixed Name</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Occurs</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Read-only</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Value-type</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Representation</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Range</font>
                                </a>
                            </th>
                            <th bgcolor="#687684" valign="top">
                                <a rel="nofollow">
                                    <font color="#ffffff">Description</font>
                                </a>
                            </th>
                        </tr>
                        <%for(Property property : aResourceShape.getProperties()) {%>
                            <tr>
                                <td bgcolor="#ffffff" valign="top">
                                    <code><%=property.getName()%></code>
                                </td>
                                <td bgcolor="#ffffff" valign="top">
                                    <a href="<%=property.getOccurs()%>">
                                        <%= property.getOccurs().toString().replaceFirst(OslcConstants.OSLC_CORE_NAMESPACE, "")%></a>
                                </td>
                                <td bgcolor="#ffffff" valign="top">
                                    <%=property.isReadOnly()%>
                                </td>
                                <td bgcolor="#ffffff" valign="top">
                                    <a href="<%=property.getValueType()%>">
                                        <%= property.getValueType().toString().split("#")[1]%></a>
                                </td>
                                <td bgcolor="#ffffff" valign="top">
                                    <%= (property.getRepresentation() == null) ? "n/a" : "<a href=\"" + property.getRepresentation() + "\"> " + property.getRepresentation().toString().split("#")[1] + "</a>"%></td>
                                <td bgcolor="#ffffff" valign="top">
                                    <%for(URI range : property.getRange()) {%>
                                        <a href="<%=range%>">
                                            <%= (range.toString().split("#").length < 2) ? range : range.toString().split("#")[1]%></a>
                                    <%}%>
                                </td>
                            </td>
                            <td bgcolor="#ffffff" valign="top">
                                <%=(property.getDescription() == null) ? "n/a" : property.getDescription() %>
                            </td>
                        </tr>
                    <%}%>
                </table>
            </div>
        </div>
    </div>
        <footer class="footer">
            <div class="container">
                <p class="text-muted">
                    OSLC Adaptor was generated using <a href="http://eclipse.org/lyo">Eclipse Lyo</a> 2.3.0-SNAPSHOT.
                </p>
            </div>
        </footer>
    </body>
</html>
