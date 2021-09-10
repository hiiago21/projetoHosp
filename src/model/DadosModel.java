package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DadosModel implements Comparable<DadosModel>{

    private LocalDateTime data_extracao; // Data e hora de realização da extração de dados do sistema
    private String id_usuario; //ID do paciente private UUID id_usuario;
    private String situacao; // Situação da solicitação (status)
    private String central_regulacao_origem; // Nome da central de regulação responsável
    private LocalDate data_solicitacao; // Data e hora da solicitação
    private String sexo; // Sexo do Paciente
    private Double idade; // Idade do paciente
    private String municipio_residencia; // Município do Paciente
    private String solicitante; //Nome do Estabelecimento de Saúde referente ao local de trabalho do profissional solicitante
    private String municipio_solicitante; // Município do Estabelecimento de Saúde referente ao local de trabalho do profissional solicitante
    private String codigo_cid; //Código Internacional das Doenças
    private String carater; // Solicitação de Internação de Urgência, Eletiva ou Transferência
    private String tipo_internacao; // Estabelecimento que originou solicitação: Própria ou Não Própria
    private String tipo_leito; // Tipo de Leito Solicitado: Enfermagem Adulto, Enfermagem Pediátrica, Hospital Dia, Obstétrico, Psiquiátrico, UTI Adulto, UTI Neonatal, UTI Pediátrica
    private LocalDateTime data_autorizacao; // Data e hora da autorização
    private LocalDateTime data_internacao; // Data da realização da internação
    private LocalDateTime data_alta; // Data da alta
    private String executante; // Nome do Estabelecimento de saúde que realizou internação
    private Long horas_na_fila;// Número de horas em que solicitação permaneceu em fila ->>> VER SE REALMENTE É ESSE TIPO DE ATRIBUTO

    public DadosModel(LocalDateTime data_extracao, String id_usuario, String situacao, String central_regulacao_origem,
                      LocalDate data_solicitacao, String sexo, Double idade, String municipio_residencia, String solicitante,
                      String municipio_solicitante, String codigo_cid, String carater, String tipo_internacao,
                      String tipo_leito, LocalDateTime data_autorizacao, LocalDateTime data_internacao,
                      LocalDateTime data_alta, String executante, Long horas_na_fila) {
        this.data_extracao = data_extracao;
        this.id_usuario = id_usuario;
        this.situacao = situacao;
        this.central_regulacao_origem = central_regulacao_origem;
        this.data_solicitacao = data_solicitacao;
        this.sexo = sexo;
        this.idade = idade;
        this.municipio_residencia = municipio_residencia;
        this.solicitante = solicitante;
        this.municipio_solicitante = municipio_solicitante;
        this.codigo_cid = codigo_cid;
        this.carater = carater;
        this.tipo_internacao = tipo_internacao;
        this.tipo_leito = tipo_leito;
        this.data_autorizacao = data_autorizacao;
        this.data_internacao = data_internacao;
        this.data_alta = data_alta;
        this.executante = executante;
        this.horas_na_fila = horas_na_fila;
    }

    public LocalDateTime getData_extracao() {
        return data_extracao;
    }

    public void setData_extracao(LocalDateTime data_extracao) {
        this.data_extracao = data_extracao;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCentral_regulacao_origem() {
        return central_regulacao_origem;
    }

    public void setCentral_regulacao_origem(String central_regulacao_origem) {
        this.central_regulacao_origem = central_regulacao_origem;
    }

    public LocalDate getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(LocalDate data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getMunicipio_solicitante() {
        return municipio_solicitante;
    }

    public void setMunicipio_solicitante(String municipio_solicitante) {
        this.municipio_solicitante = municipio_solicitante;
    }

    public String getCodigo_cid() {
        return codigo_cid;
    }

    public void setCodigo_cid(String codigo_cid) {
        this.codigo_cid = codigo_cid;
    }

    public String getCarater() {
        return carater;
    }

    public void setCarater(String carater) {
        this.carater = carater;
    }

    public String getTipo_internacao() {
        return tipo_internacao;
    }

    public void setTipo_internacao(String tipo_internacao) {
        this.tipo_internacao = tipo_internacao;
    }

    public String getTipo_leito() {
        return tipo_leito;
    }

    public void setTipo_leito(String tipo_leito) {
        this.tipo_leito = tipo_leito;
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

    public Long getHoras_na_fila() {
        return horas_na_fila;
    }

    public void setHoras_na_fila(Long horas_na_fila) {
        this.horas_na_fila = horas_na_fila;
    }

    @Override
    public String toString() {
        return "DadosModel{" +
                "data_extracao=" + data_extracao +
                ", id_usuario='" + id_usuario + '\'' +
                ", situacao='" + situacao + '\'' +
                ", central_regulacao_origem='" + central_regulacao_origem + '\'' +
                ", data_solicitacao=" + data_solicitacao +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", municipio_residencia='" + municipio_residencia + '\'' +
                ", solicitante='" + solicitante + '\'' +
                ", municipio_solicitante='" + municipio_solicitante + '\'' +
                ", codigo_cid='" + codigo_cid + '\'' +
                ", carater='" + carater + '\'' +
                ", tipo_internacao='" + tipo_internacao + '\'' +
                ", tipo_leito='" + tipo_leito + '\'' +
                ", data_autorizacao=" + data_autorizacao +
                ", data_internacao=" + data_internacao +
                ", data_alta=" + data_alta +
                ", executante='" + executante + '\'' +
                ", horas_na_fila=" + horas_na_fila +
                '}';
    }

    @Override
    public int compareTo(DadosModel dadosModel) {
        if (this.horas_na_fila > dadosModel.getHoras_na_fila()) {
            return -1;
        } if (this.horas_na_fila < dadosModel.getHoras_na_fila()) {
            return 1;
        }
        return 0;
    }
}
