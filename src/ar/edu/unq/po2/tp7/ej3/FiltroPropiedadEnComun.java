package ar.edu.unq.po2.tp7.ej3;

public class FiltroPropiedadEnComun extends Filtro{

	@Override
	protected boolean areSimilar(WikipediaPage myPage, WikipediaPage aPage) {
		return myPage.getInfobox().keySet().stream().anyMatch(aPage.getInfobox().keySet()::contains);
	}

}
