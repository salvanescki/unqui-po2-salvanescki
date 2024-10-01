package ar.edu.unq.po2.tp7.ej3;

public class FiltroMismaLetraInicial extends Filtro{

	@Override
	protected boolean areSimilar(WikipediaPage myPage, WikipediaPage aPage) {
		return myPage.getTitle().charAt(0) == aPage.getTitle().charAt(0);
	}

}
