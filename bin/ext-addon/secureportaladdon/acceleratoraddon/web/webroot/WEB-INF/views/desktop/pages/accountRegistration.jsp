<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template"
	tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="spuser"
	tagdir="/WEB-INF/tags/addons/secureportaladdon/desktop/spuser"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb" %>

<template:page pageTitle="${pageTitle}">
	<jsp:body>
		<div id="globalMessages">
		<common:globalMessages />
		</div>
			
			<div data-role="content">
				<c:url value="/register" var="submitAction" />
				<spuser:register actionNameKey="register.submit"
				action="${submitAction}" />
			</div>
			<div class="item_container">
				<cms:pageSlot position="SideContent" var="feature" element="div" class="span-4 side-content-slot cms_disp-img_slot">
				<cms:component component="${feature}"/>
				</cms:pageSlot>
			</div>
	</jsp:body>
</template:page>
