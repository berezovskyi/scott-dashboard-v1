<!DOCTYPE html>
<%--
 Copyright (c) 2011, 2012, 2017 IBM Corporation and others.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:

  Sam Padgett     - initial API and implementation
  Michael Fiedler - adapted for OSLC4J
  Jad El-khoury   - initial implementation of code generator (422448)
  Frédéric Loiret - Switch the template to Bootstrap (519699)

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%--
Start of user code imports
--%>
<%--
End of user code
--%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
ServiceProviderCatalog catalog = (ServiceProviderCatalog)request.getAttribute("catalog");
%>
<%--
Start of user code getRequestAttributes
--%>
<%--
End of user code
--%>


<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Service Provider Catalog - Robot1 OSLC Adapter</title>

    <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

    <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value="/static/js/popper-1.11.0.min.js"/>"></script>
    <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>

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
      <a class="navbar-brand" href="<c:url value="/services/catalog/singleton"/>">Robot1</a>
    </div>
  </nav>

  <div class="container">
    <div class="page-header">
      <h1>Robot1 Service Provider Catalogue</h1>
    </div>
    <%--
Start of user code (RECOMMENDED) bodyStuff
    --%>
    <%--
End of user code
    --%>

  	<h2>Service Providers</h2>
    <% for (ServiceProvider s : catalog.getServiceProviders()) { %>
      <div>
      <p class="lead">
      <a href=" <%= s.getAbout() %>">
        <%= s.getTitle() %>
      </a>
      <br>
      <em>
        <small><%= s.getDescription() %></small>
      </em>
      </p>
      </div>
    <% } %>
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

