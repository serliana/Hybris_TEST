/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.yacceleratorcore.event;

import de.hybris.platform.acceleratorservices.orderprocessing.model.OrderModificationProcessModel;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.event.AbstractSiteEventListener;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordEntryModel;
import de.hybris.platform.orderprocessing.events.SendOrderPartiallyRefundedMessageEvent;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import org.springframework.beans.factory.annotation.Required;


/**
 * Listener for SendOrderPartiallyRefundedMessageEvent events.
 */
public class SendOrderPartiallyRefundedMessageEventListener extends
		AbstractSiteEventListener<SendOrderPartiallyRefundedMessageEvent>
{
	private ModelService modelService;
	private BusinessProcessService businessProcessService;

	/**
	 * @return the businessProcessService
	 */
	protected BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	@Required
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	/**
	 * @return the modelService
	 */
	protected ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	protected void onSiteEvent(final SendOrderPartiallyRefundedMessageEvent sendOrderPartiallyRefundedMessageEvent)
	{
		final OrderModel order = sendOrderPartiallyRefundedMessageEvent.getProcess().getOrder();
		final OrderModificationRecordEntryModel modificationRecordEntry = sendOrderPartiallyRefundedMessageEvent.getProcess()
				.getOrderModificationRecordEntry();

		final OrderModificationProcessModel orderModificationProcessModel = getBusinessProcessService().createProcess(
				"sendOrderPartiallyRefundedEmailProcess-" + modificationRecordEntry.getCode() + "-" + System.currentTimeMillis(),
				"sendOrderPartiallyRefundedEmailProcess");
		orderModificationProcessModel.setOrder(order);
		orderModificationProcessModel.setOrderModificationRecordEntry(modificationRecordEntry);
		getModelService().save(orderModificationProcessModel);
		getBusinessProcessService().startProcess(orderModificationProcessModel);
	}

	@Override
	protected boolean shouldHandleEvent(final SendOrderPartiallyRefundedMessageEvent event)
	{
		final AbstractOrderModel order = event.getProcess().getOrder();
		ServicesUtil.validateParameterNotNullStandardMessage("event.order", order);
		final BaseSiteModel site = order.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.order.site", site);
		return SiteChannel.B2C.equals(site.getChannel());
	}
}
