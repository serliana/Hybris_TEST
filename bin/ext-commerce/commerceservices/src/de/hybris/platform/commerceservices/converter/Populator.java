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
package de.hybris.platform.commerceservices.converter;



/**
 * @deprecated please use {@link de.hybris.platform.converters.Populator}
 * 
 *             Interface for a populator. A populator sets values in a target instance based on values in the source
 *             instance. Populators are similar to converters except that unlike converters the target instance must
 *             already exist.
 * 
 * @param <SOURCE>
 *           the type of the source object
 * @param <TARGET>
 *           the type of the destination object
 */
@Deprecated
public interface Populator<SOURCE, TARGET> extends de.hybris.platform.converters.Populator<SOURCE, TARGET>
{
	//
}
