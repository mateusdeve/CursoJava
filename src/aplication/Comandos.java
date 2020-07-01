package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Comandos {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		List<Integer> listaInteger = new ArrayList<>();

//		Tamanho da Lista : list.size()
		System.out.println( lista.size() );
		
//		Inserir Elemento na lista : list.add( obj ), list.add( int index, obj )
		lista.add("Guilherme");
		lista.add("Guilherme");
		lista.add( 0, "Gabriella" );
		
//		Remover Elementos da Lista : list.remove( obj ), list.remove ( int ), list.removeIf( Predicate )
		lista.remove( "Guilherme" ); // Remove a primeira aparição do elemento especificado
		lista.remove( 1 ); // Remove o elemento presente no index especificado
		lista.removeIf( x -> x.charAt(0) == 'G' ); // " Remova toda String x, tal que x comece com o caractere 'G' "
		
//		Encontrar posição de Elemento : list.indexOf( obj ), lastIndexOf( obj )
		lista.indexOf( "Guilherme" ); // Retorne a posição do Primeiro elemento que for encontrado 
		lista.lastIndexOf( "Guilherme" ); // Retorne a posição do Último elemento que for encontrado
		
//		Filtrar lista com base em Predicado List<Integer> result = list.stream().filter( x -> x > 4 ).collect(Collectors.toList());
		List<Integer> result = listaInteger.stream().filter(x -> x > 4).collect(Collectors.toList());
		System.out.println( result );
		List<String> resultado = lista.stream().filter( x -> x == "Guilherme" ).collect(Collectors.toList());
		System.out.println( resultado );
		
//		Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter( x -> x > 3 ).findFirst().orElse(null);
		Integer firstResult = listaInteger.stream().filter( x -> x > 3 ).findFirst().orElse(null);
		System.out.println( firstResult );
	}
}