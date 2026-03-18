package br.itb.projeto.pizzaria.model;

import java.time.LocalDateTime;

import javax.swing.Spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mensagem")
public class Mensagem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dataMensagem")
    private LocalDateTime dataMensagem;

    @Column(name = "emissor")
    private Spring emissor;

    @Column(name = "username")
    private Spring username;

    @Column(name = "telefone")
    private Spring telefone;

    @Column(name = "texto")
    private Spring texto;

    @Column(name = "statusMensagem")
    private Spring statusMesagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataMensagem() {
        return dataMensagem;
    }

    public void setDataMensagem(LocalDateTime dataMensagem) {
        this.dataMensagem = dataMensagem;
    }

    public Spring getEmissor() {
        return emissor;
    }

    public void setEmissor(Spring emissor) {
        this.emissor = emissor;
    }

    public Spring getUsername() {
        return username;
    }

    public void setUsername(Spring username) {
        this.username = username;
    }

    public Spring getTelefone() {
        return telefone;
    }

    public void setTelefone(Spring telefone) {
        this.telefone = telefone;
    }

    public Spring getTexto() {
        return texto;
    }

    public void setTexto(Spring texto) {
        this.texto = texto;
    }

    public Spring getStatusMesagem() {
        return statusMesagem;
    }

    public void setStatusMesagem(Spring statusMesagem) {
        this.statusMesagem = statusMesagem;
    }


}

