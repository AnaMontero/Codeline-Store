package montero.ana.codelinestore;

import montero.ana.codelinestore.presentation.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodelineStoreApplication implements CommandLineRunner {

//	    OutputFormatter outputFormatter = new OutputFormatter();
//        Catalogue catalogue = new Catalogue();
//        DataImport dataImport = new DataImport(catalogue);

	@Autowired
	Menu app;

	public static void main(String[] args) {
		SpringApplication.run(CodelineStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		app.start();
	}

}
