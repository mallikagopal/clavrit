/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.clavrit.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.clavrit.core.constants.ClavritCoreConstants;
import com.hybris.clavrit.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ClavritCoreManager extends GeneratedClavritCoreManager
{
	public static final ClavritCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClavritCoreManager) em.getExtension(ClavritCoreConstants.EXTENSIONNAME);
	}
}
