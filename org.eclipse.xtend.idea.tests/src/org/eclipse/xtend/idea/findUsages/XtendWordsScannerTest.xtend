/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.idea.findUsages

import org.eclipse.xtend.core.idea.lang.XtendFileType
import org.eclipse.xtext.xbase.idea.findusages.AbstractXbaseWordsScannerTest

/**
 * @author kosyakov - Initial contribution and API
 */
class XtendWordsScannerTest extends AbstractXbaseWordsScannerTest {
	
	new() {
		super(XtendFileType.INSTANCE)
	}

}