/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.idea.common.types.idea.lang;

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage;

public final class RefactoringTestLanguageLanguage extends AbstractXtextLanguage {

	public static final RefactoringTestLanguageLanguage INSTANCE = new RefactoringTestLanguageLanguage();

	private RefactoringTestLanguageLanguage() {
		super("org.eclipse.xtext.idea.common.types.RefactoringTestLanguage");
	}

}
