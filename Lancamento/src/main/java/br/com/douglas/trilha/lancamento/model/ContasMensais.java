package br.com.douglas.trilha.lancamento.model;

import br.com.douglas.trilha.lancamento.model.enums.TipoLancamento;

/**
 *
 * @author douglas
 */
public class ContasMensais {

    Integer id;
    String data;
    Double valor;
    TipoLancamento tipoLancamento;

    public ContasMensais() {
    }

    public ContasMensais(Integer id, String data, Double valor, TipoLancamento tipoLancamento) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }
}
