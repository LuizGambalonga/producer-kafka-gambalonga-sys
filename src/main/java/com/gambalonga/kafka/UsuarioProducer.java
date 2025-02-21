package com.gambalonga.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UsuarioProducer {

    @KafkaListener(topics = "usuario-cadastrado", groupId = "grupo-produtor")
    public void enviarEmailConfirmacao(String email) {
        String linkConfirmacao = "http://localhost:8080/usuarios/confirmar?email=" + email;
        montarMensagemEmail(email, "Confirme seu Cadastro", "Clique aqui: " + linkConfirmacao);
    }

    private void montarMensagemEmail(String destinatario, String assunto, String conteudo) {
        System.out.println("E-MAIL ENVIADO: " + destinatario + assunto +  conteudo);
    }
}