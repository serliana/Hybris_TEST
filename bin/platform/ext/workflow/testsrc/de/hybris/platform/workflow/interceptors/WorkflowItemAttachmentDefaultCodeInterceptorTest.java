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
package de.hybris.platform.workflow.interceptors;

import static org.fest.assertions.Assertions.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.model.WorkflowItemAttachmentModel;
import de.hybris.platform.workflow.model.WorkflowModel;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class WorkflowItemAttachmentDefaultCodeInterceptorTest extends ServicelayerTest
{
	@Resource
	ModelService modelService;

	@Resource
	WorkflowService newestWorkflowService;

	@Before
	public void setUp() throws Exception
	{
		//given
		createCoreData();
		createDefaultCatalog();
		importCsv("/workflow/testdata/workflow_test_data.csv", "windows-1252");
	}

	@Test
	public void testIfCodeIsNotNull()
	{
		final WorkflowItemAttachmentModel itemAttachment = modelService.create(WorkflowItemAttachmentModel.class);
		final WorkflowModel workflow = newestWorkflowService.getWorkflowForCode("workflow1");
		itemAttachment.setWorkflow(workflow);
		itemAttachment.setItem(workflow);
		modelService.save(itemAttachment);

		assertThat(itemAttachment.getCode()).isNotNull();
		assertThat(itemAttachment.getCode()).hasSize(6);
	}
}
