package com.meneses.bffagendadortarefas.business;


import com.meneses.bffagendadortarefas.business.dto.in.TarefasDTORequest;
import com.meneses.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.meneses.bffagendadortarefas.business.enums.StatusNotificacaoEnum;
import com.meneses.bffagendadortarefas.infrasctructure.client.TarefasClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasClient tarefasClient;

    public TarefasDTOResponse gravarTarefas(String token, TarefasDTORequest dto){
        return tarefasClient.gravarTarefas(dto, token);
    }

    public List<TarefasDTOResponse> buscaTarefasAgendadasPorPeriodo(LocalDateTime dataInicial,
                                                                    LocalDateTime dataFinal,
                                                                    String token) {
        return tarefasClient.buscaListaTarefasPeriodo(dataInicial, dataFinal, token);

    }

    public List<TarefasDTOResponse> buscaTarefasPorEmail(String token) {

        return tarefasClient.buscaTarefasPorEmail(token);
    }

    public void deletaTarefaPorId(String id, String token) {
        tarefasClient.deletaTarefaPorId(id, token);

    }

    public TarefasDTOResponse aletaStatus(StatusNotificacaoEnum status, String id, String token) {
        return tarefasClient.alteraStatusNotificacao(status, id, token);
    }

    public TarefasDTOResponse updateTarefas(TarefasDTORequest dto, String id, String token) {
        return tarefasClient.updateTarefas(dto, id, token);

}
}