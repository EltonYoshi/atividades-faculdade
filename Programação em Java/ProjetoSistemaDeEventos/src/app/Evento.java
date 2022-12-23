package app;

import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Evento {
	private String nome;
	private String endereco;
	private String categoria;
	private Date horarioInicio;
	private Date horarioTermino;
	private Date data;
	private String descricao;
	private SimpleDateFormat formatarHorario;
	private SimpleDateFormat formatarData;
	private ArrayList<Usuario> eventoUsuario;
	
	
	//Método Construtor
	public Evento(String categoria) {
		this.eventoUsuario = new ArrayList<>();
		this.formatarHorario = new SimpleDateFormat("HH:mm");
		this.formatarData = new SimpleDateFormat("dd/MM/yyyy");
		this.categoria = categoria;
	}
	

	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	//Método que adiciona usuários dentro da lista
	public void adicionarUsuarioEvento(Usuario usuario) {
		eventoUsuario.add(usuario);
	}
	
	//Método que retorna a lista de usuários que estão participando do evento
	public ArrayList<Usuario> getEventoUsuario() {
		return eventoUsuario;
	}


	
	//Método que adiciona o horário de INÍCIO do evento
	public void setHorarioInicio(String horaInicio) throws ParseException {
		this.horarioInicio = formatarHorario.parse(horaInicio);
	}
	
	//Método que retorna o horário de INÍCIO formatado
	public String getHorarioInicioFormatado() {
		String horarioInicioFormatado = formatarHorario.format(this.horarioInicio);
		return  horarioInicioFormatado;
	}
	
	//Método que retorna o horário de INÍCIO não formatado
	public Date getHorarioInicio() {
		return horarioInicio;
	}
	
	
	
	//Método que adiciona o horário de TÉRMINO do evento
	public void setHorarioTermino(String horaTermino) throws ParseException  {
		this.horarioTermino = formatarHorario.parse(horaTermino);
	}
	
	//Método que retorna o horário de TÉRMINO formatado
	public String getHorarioTerminoFormatado() {
		String horarioTerminoFormatado = formatarHorario.format(this.horarioTermino);
		return  horarioTerminoFormatado;
	}
	
	//Método que retorna o horário de TÉRMINO não formatado
	public Date getHorarioTermino() {
		return horarioTermino;
	}
	
	
	
	//Método que adiciona uma data ao evento
	public void setData(String data) throws ParseException {
		this.data = formatarData.parse(data);
	}
	
	//Método que retorna a data formatada do evento 
	public String getDataFormatada() {
		String dataFormatada = formatarData.format(this.data);
		return dataFormatada;
	}
	
	//Método que retorna a data não formatada do evento
	public Date getData() {
		return data;
	}

	//Método que junta a data do evento com sua hora de INÍCIO
	public Date DataCompletaInicio() {
		Date dataCompleta = new Date();
		dataCompleta.setDate(this.data.getDate());
		dataCompleta.setMonth(this.data.getMonth());
		dataCompleta.setYear(this.data.getYear());
		dataCompleta.setHours(this.horarioInicio.getHours());
		dataCompleta.setMinutes(this.horarioInicio.getMinutes());
		return dataCompleta;
	}
	
	//Método que junta a data do evento com sua hora de TÉRMINO
	public Date DataCompletaTermino() {
		Date dataCompleta = new Date();
		dataCompleta.setDate(this.data.getDate());
		dataCompleta.setMonth(this.data.getMonth());
		dataCompleta.setYear(this.data.getYear());
		dataCompleta.setHours(horarioTermino.getHours());
		dataCompleta.setMinutes(horarioTermino.getMinutes());
		return dataCompleta;
	}
	

	
}
