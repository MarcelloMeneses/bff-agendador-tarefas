package com.meneses.bffagendadortarefas.business;


import com.meneses.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.meneses.bffagendadortarefas.infrasctructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }
}