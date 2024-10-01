package ar.edu.unq.po2.tp7.ej3;

import java.util.List;

public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		return wikipedia.stream().filter(p -> this.areSimilar(page, p)).toList();
	}

	protected abstract boolean areSimilar(WikipediaPage myPage, WikipediaPage aPage);
}
