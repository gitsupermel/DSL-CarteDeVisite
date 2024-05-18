/**
 * generated by Xtext 2.30.0
 */
package org.compil.dslvisitcard.dvc.generator;

import java.util.Iterator;

import org.compil.dslvisitcard.dvc.vcard.Card;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VcardGenerator extends AbstractGenerator {
	@Override
    public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        Iterator<EObject> iter = resource.getAllContents();
        while (iter.hasNext()) {
            EObject e = iter.next();
            if (e instanceof Card) {
                Card card = (Card) e;
                fsa.generateFile(card.getName() + ".txt", generateCard(card));
            }
        }
    }

    public String generateCard(Card card) {
        return "Name: " + card.getName() + "\n" +
               "Title: " + card.getTitle() + "\n" +
               "Company: " + card.getCompany() + "\n" +
               "Email: " + card.getEmail() + "\n" +
               "Phone: " + card.getPhone();
    }
  
}