package br.fbv.cryptosvault.model.objects;

import java.io.Serializable;
import java.util.Date;

/**
 * Project: Cryptos Vault
 * Class: Message
 * 
 * REVISION HISTORY
 * 
 * Date          Developer       							  Comment
 * ----------    -------------------------------------------- ----------------------------------------------
 * ##/##/####    "Erivan Nogueira" <erivan.spe@gmail.com>     Initial draft
 * ----------    -------------------------------------------- ----------------------------------------------
 */
public class Message implements Serializable {
	
	private static final long serialVersionUID = -7588891347385504377L;

	/**
	 * Nomes das colunas
	 */
	public static final String ID = "msg_id";
	
	public static final String USER_ID= "usr_id";
	
	public static final String MESSAGE_TYPE= "msg_type";
	
	public static final String MESSAGE_DATE_RECEIVED= "msg_date";
	
	public static final String MESSAGE_FROM= "msg_from";
	
	public static final String INDICATOR_READ= "msg_indlida";
	
	public static final String CONTENT= "msg_content";
	
	/**
	 * Atributos
	 */
	private long id;
	
	private long userId;
	
	private long type;
	
	private Date receivedDate;
	
	private String from;
	
	private long icRead;
	
	private String content;
	
	/**
	 * Construtor vazio
	 */
	public Message(){
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public long getType() {
		return type;
	}


	public void setType(long type) {
		this.type = type;
	}


	public Date getReceivedDate() {
		return receivedDate;
	}


	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public long getIcRead() {
		return icRead;
	}


	public void setIcRead(long icRead) {
		this.icRead = icRead;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

}
