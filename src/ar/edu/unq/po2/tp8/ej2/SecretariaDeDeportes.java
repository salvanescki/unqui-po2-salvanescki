package ar.edu.unq.po2.tp8.ej2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecretariaDeDeportes {
	
	List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public void agregarActividadSemanal(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	private List<ActividadSemanal> getActividadesDeDeporte(Deporte deporte){
		return actividades.stream()
				  .filter(a -> a.getDeporte() == deporte)
				  .toList();
	}
	
	public List<ActividadSemanal> getActividadesDeFutbol(){
		return this.getActividadesDeDeporte(Deporte.FUTBOL);
	}
	
	public List<ActividadSemanal> getActividadesDeComplejidad(int complejidad){
		return actividades.stream()
				  		  .filter(a -> a.getDeporte().getComplejidad() == complejidad)
				  		  .toList();
	}
	
	public int totalHorasEnActividadesSemanales() {
		return actividades.stream()
						  .mapToInt(a -> a.getDuracion())
						  .sum();
	}
	
	/**
	 * actividadConMenorCostoDeDeporte devuelve la actividad de menor costo ofrecida por la Secretaría de Deportes de un deporte en específico.
	 * @param deporte.
	 * @return ActividadSemanal de costo mínimo. Si la lista está vacía devuelve null.
	 */
	public ActividadSemanal actividadConMenorCostoDeDeporte(Deporte deporte) {
		return this.getActividadesDeDeporte(deporte).stream()
													.min(Comparator.comparingInt(ActividadSemanal::getCosto))
													.orElse(null);
	}
	
	public Map<Deporte, ActividadSemanal> getListaDeDeportesYSuActividadDeMenorCosto(){
		return actividades.stream()
                .collect(Collectors.groupingBy(
                        ActividadSemanal::getDeporte,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingInt(ActividadSemanal::getCosto)),
                                optional -> optional.orElse(null)
                        )
                ));
	}
	
	public void imprimirTodasLasActividades() {
		actividades.forEach(a -> System.out.println(a.toString()));
	}
}
