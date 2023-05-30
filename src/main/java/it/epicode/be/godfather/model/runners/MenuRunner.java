package it.epicode.be.godfather.model.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import it.epicode.be.godfather.GestioneMenu;

@Component
@Order(0)
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		GestioneMenu stampa = new GestioneMenu();
		stampa.stampaMenu();
		stampa.testTopping();

	}

}
