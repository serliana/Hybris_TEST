/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package de.hybris.platform.catalog.job.sort;

import java.util.Collection;
import java.util.List;


/**
 * Orders an unsorted collection to ordered one.
 * 
 * @since 4.3
 * @spring.bean typesSorter
 */
public interface Sorter<T>
{
	List<T> sort(Collection<T> unordered);
}
