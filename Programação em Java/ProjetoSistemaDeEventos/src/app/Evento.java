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
	
	
	//M�todo Construtor
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
	
	
	
	//M�todo que adiciona usu�rios dentro da lista
	public void adicionarUsuarioEvento(Usuario usuario) {
		eventoUsuario.add(usuario);
	}
	
	//M�todo que retorna a lista de usu�rios que est�o participando do evento
	public ArrayList<Usuario> getEventoUsuario() {
		return eventoUsuario;
	}


	
	//M�todo que adiciona o hor�rio de IN�CIO do evento
	public void setHorarioInicio(String horaInicio) throws ParseException {
		this.horarioInicio = formatarHorario.parse(horaInicio);
	}
	
	//M�todo que retorna o hor�rio de IN�CIO formatado
	public String getHorarioInicioFormatado() {
		String horarioInicioFormatado = formatarHorario.format(this.horarioInicio);
		return  horarioInicioFormatado;
	}
	
	//M�todo que retorna o hor�rio de IN�CIO n�o formatado
	public Date getHorarioInicio() {
		return horarioInicio;
	}
	
	
	
	//M�todo que adiciona o hor�rio de T�RMINO do evento
	public void setHorarioTermino(String horaTermino) throws ParseException  {
		this.horarioTermino = formatarHorario.parse(horaTermino);
	}
	
	//M�todo que retorna o hor�rio de T�RMINO formatado
	public String getHorarioTerminoFormatado() {
		String horarioTerminoFormatado = formatarHorario.format(this.horarioTermino);
		return  horarioTerminoFormatado;
	}
	
	//M�todo que retorna o hor�rio de T�RMINO n�o formatado
	public Date getHorarioTermino() {
		return horarioTermino;
	}
	
	
	
	//M�todo que adiciona uma data ao evento
	public void setData(String data) throws ParseException {
		this.data = formatarData.parse(data);
	}
	
	//M�todo que retorna a data formatada do evento 
	public String getDataFormatada() {
		String dataFormatada = formatarData.format(this.data);
		return dataFormatada;
	}
	
	//M�todo que retorna a data n�o formatada do evento
	public Date getData() {
		return data;
	}

	//M�todo que junta a data do evento com sua hora de IN�CIO
	public Date DataCompletaInicio() {
		Date dataCompleta = new Date();
		dataCompleta.setDate(this.data.getDate());
		dataCompleta.setMonth(this.data.getMonth());
		dataCompleta.setYear(this.data.getYear());
		dataCompleta.setHours(this.horarioInicio.getHours());
		dataCompleta.setMinutes(this.horarioInicio.getMinutes());
		return dataCompleta;
	}
	
	//M�todo que junta a data do evento com sua hora de T�RMINO
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
