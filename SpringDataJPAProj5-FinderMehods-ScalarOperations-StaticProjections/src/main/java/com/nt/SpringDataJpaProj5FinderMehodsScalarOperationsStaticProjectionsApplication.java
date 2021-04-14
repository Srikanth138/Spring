package com.nt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.repository.IEmployeeRepo;

@SpringBootApplication
public class SpringDataJpaProj5FinderMehodsScalarOperationsStaticProjectionsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				SpringDataJpaProj5FinderMehodsScalarOperationsStaticProjectionsApplication.class,
				args);
		IEmployeeRepo repo = ctx.getBean(IEmployeeRepo.class);

		System.out.println("Class ::" + repo.getClass().getName());

		// invoke methods

		/*
		 * List<ResultView>
		 * list=repo.findByEaddIn(List.of("hyd","vizag","mumbai"));
		 * //List<ResultView> list=repo.findByEaddIn("hyd");
		 * //List.of("hyd","vizag","mumbai") list.forEach(view->{
		 * System.out.println(view.getEno()+"   "+view.getEadd()); });
		 */

		// repo.findByEaddIn(List.of("hyd", "vizag", "mumbai")).forEach(view ->
		// System.out.println(view.getEno() + " " + view.getEadd()));

	}

}
