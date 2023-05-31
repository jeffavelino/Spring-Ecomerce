package com.ecomerceweb.ecomerce.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idPedido;
	private Long idUsuario;
	private Date Abertura;
	private Date Emissao;
	private float Desconto;
	private float ValorTotal;
	

	public Request() {
		
	}


	public Request(Long idPedido, Long idUsuario, Date abertura, Date emissao, float desconto, float valorTotal) {
		super();
		this.idPedido = idPedido;
		this.idUsuario = idUsuario;
		Abertura = abertura;
		Emissao = emissao;
		Desconto = desconto;
		ValorTotal = valorTotal;
	}


	public Long getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getAbertura() {
		return Abertura;
	}


	public void setAbertura(Date abertura) {
		Abertura = abertura;
	}


	public Date getEmissao() {
		return Emissao;
	}


	public void setEmissao(Date emissao) {
		Emissao = emissao;
	}


	public float getDesconto() {
		return Desconto;
	}


	public void setDesconto(float desconto) {
		Desconto = desconto;
	}


	public float getValorTotal() {
		return ValorTotal;
	}


	public void setValorTotal(float valorTotal) {
		ValorTotal = valorTotal;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(idPedido, other.idPedido);
	}
	
	

}
