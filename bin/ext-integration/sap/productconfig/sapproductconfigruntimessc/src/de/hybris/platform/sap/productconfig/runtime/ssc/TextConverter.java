/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.sap.productconfig.runtime.ssc;

public interface TextConverter
{
	/**
	 * Remove all meta text elements (bold, underline, etc.) out of the long text value, provided by the knowledge base.
	 *
	 * @param formattedText
	 *           The text to be cleansed
	 * @return The converted text, which will be shown in the web frontend
	 */
	public String convertLongText(String formattedText);

}
