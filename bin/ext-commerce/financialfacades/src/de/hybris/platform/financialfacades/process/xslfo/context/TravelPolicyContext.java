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
package de.hybris.platform.financialfacades.process.xslfo.context;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.insurance.data.InsurancePolicyData;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;


/**
 * Travel Policy Context for populating Travel templates
 */
public class TravelPolicyContext extends AbstractPolicyContext
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(TravelPolicyContext.class);

	@Override
	public void init(final BaseSiteModel baseSite, final InsurancePolicyData policyData)
	{
		super.init(baseSite, policyData);

		put("endDate", StringEscapeUtils.escapeXml(policyData.getPolicyEndDate()));
		put("periodRetrievedFrom", StringEscapeUtils.escapeXml(policyData.getPeriodRetrievedFrom()));
		put("durationRetrievedFrom", StringEscapeUtils.escapeXml(policyData.getDurationRetrievedFrom()));
	}
}
