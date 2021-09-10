package daos;

import model.DadosModel;

import java.time.LocalDateTime;

public class DadosPacienteDAO {

    private Double idade;
    private String municipio_residencia;
    private String solicitante;
    private LocalDateTime data_autorizacao;
    private LocalDateTime data_internacao;
    private LocalDateTime data_alta;

    public DadosPacienteDAO(DadosModel dadosModel){
        this.idade = dadosModel.getIdade();
        this.municipio_residencia = dadosModel.getMunicipio_residencia();
        this.solicitante = dadosModel.getSolicitante();
        this.data_autorizacao = dadosModel.getData_autorizacao();
        this.data_internacao = dadosModel.getData_internacao();
        this.data_alta = dadosModel.getData_alta();
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
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
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
}
