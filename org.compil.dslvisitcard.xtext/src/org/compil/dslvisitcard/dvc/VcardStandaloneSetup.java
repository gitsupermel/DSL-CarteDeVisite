/*
 * generated by Xtext 2.30.0
 */
package org.compil.dslvisitcard.dvc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VcardStandaloneSetup extends VcardStandaloneSetupGenerated {

	public static void doSetup() {
		new VcardStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
