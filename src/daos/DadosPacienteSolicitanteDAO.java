package daos;

import model.DadosModel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DadosPacienteSolicitanteDAO {

    private Double idade;
    private String municipio_residencia;
    private String executante;
    private LocalDateTime data_autorizacao;
    private LocalDateTime data_internacao;
    private LocalDateTime data_alta;
    private String diasInternado;

    public DadosPacienteSolicitanteDAO(DadosModel dadosModel){
        this.idade = dadosModel.getIdade();
        this.municipio_residencia = dadosModel.getMunicipio_residencia();
        this.executante = dadosModel.getExecutante();
        this.data_autorizacao = dadosModel.getData_autorizacao();
        this.data_internacao = dadosModel.getData_internacao();
        this.data_alta = dadosModel.getData_alta();
        this.diasInternado = dadosModel.getSituacao().equals("INTERNADA") ? "INTERNADA : " + calculaDiasInternados(dadosModel.getData_internacao(), LocalDateTime.now()) : calculaDiasInternados(dadosModel.getData_internacao(), dadosModel.getData_alta()).toString();
    }

    private Long calculaDiasInternados(LocalDateTime data_internacao, LocalDateTime data_alta) {

        return ChronoUnit.DAYS.between(data_internacao, data_alta);
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public String getMunicipio_residencia() {
        return municipio_residencia;
    }

    public void setMunicipio_residencia(String municipio_residencia) {
        this.municipio_residencia = municipio_residencia;
    }

    public String getSolicitante() {
        return executante;
    }

    public void setSolicitante(String executante) {
        this.executante = executante;
    }

    public LocalDateTime getData_autorizacao() {
        return data_autorizacao;
    }

    public void setData_autorizacao(LocalDateTime data_autorizacao) {
        this.data_autorizacao = data_autorizacao;
    }

    public LocalDateTime getData_internacao() {
        return data_internacao;
    }

    public void setData_internacao(LocalDateTime data_internacao) {
        this.data_internacao = data_internacao;
    }

    public LocalDateTime getData_alta() {
        return data_alta;
    }

    public void setData_alta(LocalDateTime data_alta) {
        this.data_alta = data_alta;
    }

    public String getExecutante() {
        return executante;
    }

    public void setExecutante(String executante) {
        this.executante = executante;
    }

    public String getDiasInternado() {
        return diasInternado;
    }

    public void setDiasInternado(String diasInternado) {
        this.diasInternado = diasInternado;
    }

    @Override
    public String toString() {
        return "DadosPacienteSolicitanteDAO{" +
                "idade=" + idade +
                ", municipio_residencia='" + municipio_residencia + '\'' +
                ", executante='" + executante + '\'' +
                ", data_autorizacao=" + data_autorizacao +
                ", data_internacao=" + data_internacao +
                ", data_alta=" + data_alta +
                ", diasInternado='" + diasInternado + '\'' +
                '}';
    }
}
