package app;

public class MedicamentoConverter {
	
	
	
	public Medicamento converteCSVFuncionario(String linha) {
        String[] campos = linha.split(";");
        Medicamento f = new Medicamento(campos[0], campos[1]);
        return f;
	}
       
}
