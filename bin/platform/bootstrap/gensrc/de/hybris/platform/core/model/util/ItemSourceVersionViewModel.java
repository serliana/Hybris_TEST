/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28.04.2016 16:51:49                         ---
 * ----------------------------------------------------------------
 *  
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
 */
package de.hybris.platform.core.model.util;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ItemSourceVersionView first defined at extension catalog.
 */
@SuppressWarnings("all")
public class ItemSourceVersionViewModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ItemSourceVersionView";
	
	/** <i>Generated constant</i> - Attribute key of <code>ItemSourceVersionView.targetItem</code> attribute defined at extension <code>catalog</code>. */
	public static final String TARGETITEM = "targetItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>ItemSourceVersionView.sourceItem</code> attribute defined at extension <code>catalog</code>. */
	public static final String SOURCEITEM = "sourceItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>ItemSourceVersionView.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	public static final String SOURCEVERSION = "sourceVersion";
	
	
	/** <i>Generated variable</i> - Variable of <code>ItemSourceVersionView.targetItem</code> attribute defined at extension <code>catalog</code>. */
	private ItemModel _targetItem;
	
	/** <i>Generated variable</i> - Variable of <code>ItemSourceVersionView.sourceItem</code> attribute defined at extension <code>catalog</code>. */
	private ItemModel _sourceItem;
	
	/** <i>Generated variable</i> - Variable of <code>ItemSourceVersionView.sourceVersion</code> attribute defined at extension <code>catalog</code>. */
	private CatalogVersionModel _sourceVersion;
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ItemSourceVersionViewModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ItemSourceVersionViewModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ItemSourceVersionViewModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemSourceVersionView.sourceItem</code> attribute defined at extension <code>catalog</code>. 
	 * @return the sourceItem
	 */
	@Accessor(qualifier = "sourceItem", type = Accessor.Type.GETTER)
	public ItemModel getSourceItem()
	{
		if (this._sourceItem!=null)
		{
			return _sourceItem;
		}
		return _sourceItem = getPersistenceContext().getValue(SOURCEITEM, _sourceItem);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemSourceVersionView.sourceVersion</code> attribute defined at extension <code>catalog</code>. 
	 * @return the sourceVersion
	 */
	@Accessor(qualifier = "sourceVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getSourceVersion()
	{
		if (this._sourceVersion!=null)
		{
			return _sourceVersion;
		}
		return _sourceVersion = getPersistenceContext().getValue(SOURCEVERSION, _sourceVersion);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ItemSourceVersionView.targetItem</code> attribute defined at extension <code>catalog</code>. 
	 * @return the targetItem
	 */
	@Accessor(qualifier = "targetItem", type = Accessor.Type.GETTER)
	public ItemModel getTargetItem()
	{
		if (this._targetItem!=null)
		{
			return _targetItem;
		}
		return _targetItem = getPersistenceContext().getValue(TARGETITEM, _targetItem);
	}
	
}
