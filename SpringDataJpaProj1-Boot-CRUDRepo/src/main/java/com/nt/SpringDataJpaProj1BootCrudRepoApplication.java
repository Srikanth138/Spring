package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj1BootCrudRepoApplication {

	public static void main(String[] args) {

		// get IOC container
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaProj1BootCrudRepoApplication.class, args);
		
		// get Service class obj
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		
		// invoke method
//		EmployeeDTO dto = new EmployeeDTO(2, "raja", "hyd", 67890.0f);
//		System.out.println("Employee registered with Id::" + service.registerEmployee(dto));
		
			//Sequance is generate Automatically
//		    EmployeeDTO dto=new EmployeeDTO("suresh","vizag",67890.0f);
//		    System.out.println("Employee registered with Id::"+service.registerEmployee(dto));//#1
				
//			  EmployeeDTO dto=new EmployeeDTO(21,"mahesh","mumbai",6757.0f);
//			  System.out.println("Updating record ::"+service.registerEmployee(dto));  //#1
			
			//Lis.of() is JAVA 9 
//			int ids[]=service.registerEmployeesGroup(List.of(new EmployeeDTO("rama","hyd",9000.0f), new  EmployeeDTO("jani","vizag",80000.0f),
//						                                      new EmployeeDTO("albert","delhi",70000.0f) ));
//			System.out.println("batch of saved objs  ids are ::"+Arrays.toString(ids)); //#2
		
//				System.out.println("Employees count::"+service.getEmployeesCount());//#3
		
//				System.out.println(service.removeEmployeeById(21)); //#4
		
//				Optional<EmployeeDTO>  optDTO=service.getEmployeeById(1); //#5
//				 if(optDTO.isPresent())
//				  System.out.println("1 employee details "+optDTO.get());
//				 else
//					 System.out.println("employee not found" );
				  
//				System.out.println(service.removeEmployeeById1(5)); //#6
				
				service.getAllEmployees().forEach(System.out::println);  //#7 
//				service.getAllEmployees().forEach(dto-> System.out.println(dto)); //#7
				
				//Lis.of() is JAVA 9	
				/*try {  
				 System.out.println(service.removeEmployeesByGivenEntities(List.of(new EmployeeDTO(26),
		                                                           new EmployeeDTO(27))));
				}
				catch(Exception e) {
				 System.out.println("Problem in bulk deletion");
				 e.printStackTrace();
				}*/
				
//				@Override  //Lis.of() is JAVA 9
//				service.getEmployeesByIds(List.of(25,26,24)).forEach(System.out::println);

		// close container
		((ConfigurableApplicationContext) ctx).close();

	}// main
}// calss
