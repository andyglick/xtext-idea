/*
 * generated by Xtext 2.11
 */
package org.eclipse.xtext.idea

import com.google.inject.Guice
import org.eclipse.xtext.XtextRuntimeModule
import org.eclipse.xtext.XtextStandaloneSetupGenerated
import org.eclipse.xtext.util.Modules2

class XtextStandaloneSetupIdea extends XtextStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new XtextRuntimeModule()
		val ideaModule = new XtextIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}