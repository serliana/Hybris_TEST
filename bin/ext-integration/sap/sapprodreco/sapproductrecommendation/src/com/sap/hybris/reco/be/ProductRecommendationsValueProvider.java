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
package com.sap.hybris.reco.be;

import com.sap.hybris.reco.dao.ProductRecommendationData;

import java.util.List;

public interface ProductRecommendationsValueProvider {

    /**
     * @return the default result
     */
    public List<ProductRecommendationData> getDefaultResult();
}
