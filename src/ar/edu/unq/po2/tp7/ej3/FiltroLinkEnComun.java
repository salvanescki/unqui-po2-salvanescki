package ar.edu.unq.po2.tp7.ej3;

public class FiltroLinkEnComun extends Filtro{

	@Override
	protected boolean areSimilar(WikipediaPage myPage, WikipediaPage aPage) {
		return myPage.getLinks().stream().anyMatch(aPage.getLinks()::contains);
	}

}
