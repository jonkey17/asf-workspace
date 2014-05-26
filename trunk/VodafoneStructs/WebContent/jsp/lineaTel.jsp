<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<div class="titleDiv"><s:text name="application.facturaTel.title"/></div>
		<h1><s:text name="label.facturaTel.subject1"/></h1>
		<br/>
		<s:form action="doLogin" method="POST">
			<tr>
				<td colspan="2">Login</td>
			</tr>
			<tr>
				<td colspan="2">
					<s:actionerror />
					<!--<s:fielderror />-->
				</td>
			</tr>
			<s:textfield name="username" label="%{getText('label.telefono')}"/>
			<s:password name="password" label="%{getText('label.antiguedad')}"/>
			<s:submit value="%{getText('label.login.button')}" align="center"/>
		</s:form>
		
	</body>
</html>
