package aplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); 
		
		System.out.println("Quantos funcionários vão ser registrados?");
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Funcionário #"+i+" :");
			System.out.print("id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("Entre com o id do funcionário que vai ter um almento de salário:");
		Integer id = sc.nextInt();

		List<Employee> result = list.stream().filter(x -> x.getId() ==  id).collect(Collectors.toList());
		
		if(result.size() == 0) {
			System.out.println("Error");
		}else {
			System.out.println("Insira a porcentagem: ");
			Double percentage = sc.nextDouble();
			
			for(Employee obj: result ) {
				obj.increaseSalary(percentage);
			}
			
		}
		
		System.out.println(list);
		System.out.println();
		
		sc.close();
	}

}
