package com.algaworks.algalog.domain.exception;

public class EntidadeNaoEncontradaExeception extends NegocioException {

    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaExeception(String mensagem) {
        super(mensagem);
    }
}
