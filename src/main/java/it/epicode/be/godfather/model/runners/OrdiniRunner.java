package it.epicode.be.godfather.model.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.godfather.model.Ordine;
import it.epicode.be.godfather.model.OrdineStatus;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrdiniRunner implements CommandLineRunner {
	private static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Ordine.class);

	@Override
	public void run(String... args) throws Exception {
		Ordine ordine = createOrdine(ctx, 6, OrdineStatus.pronto);
		log.info(ordine.toString());
	}

	public static Ordine createOrdine(AnnotationConfigApplicationContext ctx, int coperti, OrdineStatus stato) {
		Ordine o1 = ctx.getBean(Ordine.class);
		o1.setNumeroCoperti(coperti);
		o1.setStato(stato);

		return o1;
	}

}
