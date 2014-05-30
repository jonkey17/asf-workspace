<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<s:form action="searchClient" method="POST">
			<div class="titleDiv"><s:text name="application.idCliente.title"/></div>
			<h1><s:text name="label.idCliente.subject"/></h1>
			<br>
			<table class="borderAll">
				<tr>			      
			        <td><s:textfield name="dni" label="%{getText('label.dni')}"/></td>
			        <th><s:submit value="%{getText('label.button')}" align="right"/></th>
			    </tr>
			</table>
			<br>
			<s:actionerror />
		</s:form>
			
		<s:text name="%{getText('label.string.dni')}"></s:text>
		<s:text name="%{cliente.dni}"></s:text>
		<s:text name="%{getText('label.string.nombre')}"></s:text>
		<s:text name="%{nombre}"></s:text>
		
		<s:url id="modCliente" action="showModCliente.action">
			<s:param name="dni" value="%{cliente.dni}"/>
		</s:url>
		<s:a href="%{modCliente}"><s:text name="%{getText('label.string.modificar')}"></s:text></s:a>
		
		<br><br><br>
		<h1><s:text name="label.lineas.subject"/></h1>
				<table class="borderAll">
			<tr>
		        <th><s:text name="label.cliente"/></th>
		        <th><s:text name="label.telefono"/></th>
		        <th><s:text name="label.antiguedad"/></th>
		        <th><s:text name="label.activa"/></th>
		        <th><s:text name="label.cambiar"/></th>
		        <th><s:text name="label.promocion"/></th>
		        <th><s:text name="label.tarifaVoz"/></th>
		        <th><s:text name="label.tarifaDatos"/></th>
		        <th><s:text name="label.facturas"/></th>
		        <th></th>
		    </tr>
		    <s:iterator value="lineas" status="status">
		    	<s:url id="editLineas" action="showLineasTel.action">
					<s:param name="telefono" value="telefono"/>
					<s:param name="dni" value="dni"/>
				</s:url>
				<s:url id="viewFacturas" action="facturasTel.action">
					<s:param name="telefono" value="telefono"/>
					<s:param name="dni" value="dni"/>
				</s:url>
				<s:url id="changeStatus" action="filterLineas!doChangeStatus.action">
					<s:param name="dni" value="dni"/>
					<s:param name="telefono" value="telefono"/>
				</s:url>
		        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
		            <td class="nowrap"><s:property value="dni"/></td>
		            <td class="nowrap"><s:property value="telefono"/></td>
		            <td class="nowrap"><s:property value="antiguedad"/></td>
		            <td class="nowrap"><s:if test="%{activa}"><s:text name="label.si"></s:text></s:if>
		            	<s:else><s:text name="label.no"></s:text></s:else></td>
		            <td class="nowrap"><s:if test="%{activa}"><s:a href="%{changeStatus}"><s:text name="label.desactivar"></s:text></s:a></s:if>
		            	<s:else><s:a href="%{changeStatus}"><s:text name="label.activar"></s:text></s:a></s:else></td>
		            <td class="nowrap"><s:property value="promocion"/></td>
		            <td class="nowrap"><s:property value="tarifaVoz"/></td>
		            <td class="nowrap"><s:property value="tarifaDatos"/></td>
		            <td class="nowrap"><s:a href="%{viewFacturas}"><s:text name="%{numFacturas[telefono]}"/></s:a></td>
		            <td class="nowrap"><s:a href="%{editLineas}"><s:text name="label.modificar"/></s:a></td>
		        </tr>
		    </s:iterator>
		</table>
		<br>
		<s:url id="filterLineas" action="filterLineas!doFilter.action">
			<s:param name="dni" value="dni"/>
		</s:url>
		<s:a href="%{filterLineas}">
			<s:text name="label.modificarLineas"/>
		</s:a>
	</body>
</html>
