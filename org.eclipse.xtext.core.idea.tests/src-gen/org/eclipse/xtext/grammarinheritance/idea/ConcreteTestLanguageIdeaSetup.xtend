package org.eclipse.xtext.grammarinheritance.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class ConcreteTestLanguageIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new ConcreteTestLanguageStandaloneSetupIdea().createInjector
	}

}
