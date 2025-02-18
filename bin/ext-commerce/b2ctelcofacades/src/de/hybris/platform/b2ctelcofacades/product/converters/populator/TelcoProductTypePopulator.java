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
package de.hybris.platform.b2ctelcofacades.product.converters.populator;

import de.hybris.platform.b2ctelcoservices.model.AccessoryModel;
import de.hybris.platform.b2ctelcoservices.model.DeviceModel;
import de.hybris.platform.b2ctelcoservices.model.ServiceAddOnModel;
import de.hybris.platform.b2ctelcoservices.model.ServicePlanModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.subscriptionservices.model.SubscriptionProductModel;

import org.apache.commons.lang.StringUtils;


/**
 * Populate the attribute {@link ProductData}.itemType depending on the type of the given SOURCE parameter.
 *
 * @param <SOURCE>
 * @param <TARGET>
 */
public class TelcoProductTypePopulator<SOURCE extends ProductModel, TARGET extends ProductData> implements
		Populator<SOURCE, TARGET>
{

	@Override
	public void populate(final SOURCE source, final TARGET target) throws ConversionException
	{
		if (source instanceof DeviceModel)
		{
			target.setItemType(DeviceModel._TYPECODE);
		}
		else if (source instanceof AccessoryModel)
		{
			target.setItemType(AccessoryModel._TYPECODE);
		}
		else if (source instanceof ServicePlanModel)
		{
			target.setItemType(ServicePlanModel._TYPECODE);
		}
		else if (source instanceof ServiceAddOnModel)
		{
			target.setItemType(ServiceAddOnModel._TYPECODE);
		}
		else if (source instanceof SubscriptionProductModel)
		{
			target.setItemType(SubscriptionProductModel._TYPECODE);
		}
		else if (StringUtils.isEmpty(target.getItemType()))
		{
			target.setItemType(ProductModel._TYPECODE);
		}
	}
}
