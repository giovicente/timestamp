package giovicente.com.timestamp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainframeTimestamp {

    private String dataHoraTransacao;

    public MainframeTimestamp() { }

    public MainframeTimestamp(String dataHoraTransacao) { this.dataHoraTransacao = dataHoraTransacao; }

    @JsonProperty("timestamp_operacao")
    public String getDataHoraTransacao() { return dataHoraTransacao; }

    public void setDataHoraTransacao(String dataHoraTransacao) { this.dataHoraTransacao = dataHoraTransacao; }
}
