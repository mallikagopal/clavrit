/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.clavrit.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.clavrit.fulfilmentprocess.constants.ClavritFulfilmentProcessConstants;

public class ClavritFulfilmentProcessManager extends GeneratedClavritFulfilmentProcessManager
{
	public static final ClavritFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClavritFulfilmentProcessManager) em.getExtension(ClavritFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
