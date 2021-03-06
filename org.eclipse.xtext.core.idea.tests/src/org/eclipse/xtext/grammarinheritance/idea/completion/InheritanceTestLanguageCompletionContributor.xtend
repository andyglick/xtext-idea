package org.eclipse.xtext.grammarinheritance.idea.completion

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage;
import org.eclipse.xtext.grammarinheritance.idea.lang.InheritanceTestLanguageLanguage;

class InheritanceTestLanguageCompletionContributor extends AbstractInheritanceTestLanguageCompletionContributor {
	new() {
		this(InheritanceTestLanguageLanguage.INSTANCE)
	}
	
	new(AbstractXtextLanguage lang) {
		super(lang)
		//custom rules here
	}
}
