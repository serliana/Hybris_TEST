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
 */
package de.hybris.platform.printcockpit.pagemanagment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses(
{
//
		DefaultDynamicModePagePlannerTest.class, //
		DefaultFixedModePagePlannerTest.class, //
		DefaultPageAndGridModeTransitionsPagePlannerTest.class, //
		DefaultFixedModePagePlannerIntegrationTest.class //
})
public class AllTests
{
	//Test suite
}
