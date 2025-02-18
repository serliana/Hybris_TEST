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
package de.hybris.platform.b2bacceleratorservices.dao;

import de.hybris.platform.b2b.model.B2BUserGroupModel;
import de.hybris.platform.commerceservices.search.dao.PagedGenericDao;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;


public interface PagedB2BUserGroupDao<M> extends PagedGenericDao<M>
{
	/**
	 * Finds all visible {@link B2BUserGroupModel} within a sessions branch 2 sorts are available by default, sortCode
	 * "byName" and "byDate"
	 * 
	 * @param sortCode
	 * @param pageableData
	 * @return A paged result of customers
	 */
	SearchPageData<B2BUserGroupModel> findPagedB2BUserGroup(String sortCode, PageableData pageableData);
}
