package br.com.impact.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

        void valorAlterado (String novoValor);
}
