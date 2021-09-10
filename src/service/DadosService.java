package service;

import daos.DadosPacienteDAO;
import daos.DadosPacienteSolicitanteDAO;
import model.DadosModel;
import repository.DadosRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DadosService {

    private DadosRepository dadosRepository;
    List<DadosModel> listDadosPacientes = new ArrayList<>();

    public DadosService() {
        this.dadosRepository = new DadosRepository();

        this.listDadosPacientes = dadosRepository.listarDados();
    }


    public Integer totalDePacientesPorMunicio(){

        List<DadosModel> listPacientesPorMuniciopio = listDadosPacientes
                                                            .stream()
                                                            .filter(dadosModel -> dadosModel.getMunicipio_residencia().equals("porto alegre".toUpperCase()))
                                                            .collect(Collectors.toList());

        return listPacientesPorMuniciopio.size();
    }

    public Map<String, Integer> mediaDeIdadeDosPacientePorGenero(){

        List<DadosModel> listPacientesPorMuniciopio = listDadosPacientes
                                                            .stream()
                                                            .filter(dadosModel -> dadosModel.getMunicipio_residencia().equals("porto alegre".toUpperCase()))
                                                            .collect(Collectors.toList());

        Map<String, Integer> mediaIdadeGenero = new HashMap<>();

        int quantidadeMasculino = listPacientesPorMuniciopio
                                        .stream()
                                        .filter(dadosModel -> dadosModel.getSexo().equals("masculino".toUpperCase()))
                                        .collect(Collectors.toList()).size();

        int quantidadeFemino = listPacientesPorMuniciopio.size() - quantidadeMasculino;

        mediaIdadeGenero.put("MASCULINO",quantidadeMasculino);
        mediaIdadeGenero.put("FEMININO",quantidadeFemino);

        return mediaIdadeGenero;
    }

    public Double mediaIdadePacientes(){

        Integer quantidadePacientes = listDadosPacientes
                                            .stream()
                                            .filter(dadosModel -> dadosModel.getMunicipio_residencia().equals("porto alegre".toUpperCase()))
                                            .collect(Collectors.toList()).size();

        Double idadesPacientes = listDadosPacientes
                                            .stream()
                                            .filter(dadosModel -> dadosModel.getMunicipio_residencia().equals("porto alegre".toUpperCase()))
                                            .map(dadoPaciente ->{
                                                if(Objects.nonNull(dadoPaciente.getIdade())){
                                                    return dadoPaciente.getIdade();
                                                }
                                                return 0;
                                            })
                                            .mapToDouble(idade -> idade.doubleValue())
                                            .sum();

        return idadesPacientes/quantidadePacientes;
    }

        /*
        *2. [Consultar internações por ano] Permitir que o usuário informe o nome do município residencial e como resultado
        *  o programa deverá exibir uma lista com os anos de 2018 a 2021 e a quantidade de pacientes que foram internados por ano;
        * */

        public Map<Integer, Integer> dadosPorMunicipioResidencial(){

            Map<Integer, Integer> dadosPorAnos = new HashMap<>();

            int ano2018 =  listDadosPacientes
                                .stream()
                                .filter(dadosModel -> Integer.valueOf(dadosModel.getData_internacao().getYear()).equals(2018))
                                .collect(Collectors.toList()).size();

            int ano2019 = listDadosPacientes
                                .stream()
                                .filter(dadosModel -> Integer.valueOf(dadosModel.getData_internacao().getYear()).equals(2019))
                                .collect(Collectors.toList()).size();

            int ano2020 = listDadosPacientes
                                .stream()
                                .filter(dadosModel -> Integer.valueOf(dadosModel.getData_internacao().getYear()).equals(2020))
                                .collect(Collectors.toList()).size();

            int ano2021 = listDadosPacientes
                                .stream()
                                .filter(dadosModel -> Integer.valueOf(dadosModel.getData_internacao().getYear()).equals(2021))
                                .collect(Collectors.toList()).size();

            dadosPorAnos.put(2018, ano2018);
            dadosPorAnos.put(2019, ano2019);
            dadosPorAnos.put(2020, ano2020);
            dadosPorAnos.put(2021, ano2021);

            return dadosPorAnos;
        }


    /*
        3- [Consultar hospitais] Permitir que o usuário digite o nome do executante e como
        resultado o programa deverá exibir todos os pacientes que foram internados, sua
        idade, o município residencial e solicitante de cada um deles, as datas de
        autorização, de internação e alta e o executante;
         */

    public Integer dadosPorExecutante(){

        List<DadosPacienteDAO> listPacientesPorMuniciopio = listDadosPacientes
                                                                .stream()
                                                                .filter(dadosModel -> dadosModel.getExecutante().equals("HOSPITAL SAO LUCAS DA PUCRS".toUpperCase()))
                                                                .map(DadosPacienteDAO::new)
                                                                .collect(Collectors.toList());

        return listPacientesPorMuniciopio.size();
    }


    /*
        [Calcular tempo de internação] Permitir que o usuário digite o nome do solicitante e
        como resultado o programa deverá exibir:
        a. Uma lista com todos os pacientes;
        b. O nome dos hospitais executantes;
        c. O número de dias que os pacientes permaneceram internados desde a
        solicitação até a alta deste paciente;
         */

    public List<DadosPacienteSolicitanteDAO> filtroPacientePorNomeSolicitante(){

        List<DadosPacienteSolicitanteDAO> listaPacientesPorSolicitante = listDadosPacientes
                                                                                .stream()
                                                                                .filter(dadosModel -> dadosModel.getSolicitante().equals("HOSPITAL BOM PASTOR".toUpperCase()))
                                                                                .map(DadosPacienteSolicitanteDAO::new)
                                                                                .collect(Collectors.toList());

        return listaPacientesPorSolicitante;
    }

    /*
        [Determinar tempos de espera na fila] O programa deverá determinar e exibir os
        cinco casos com maior tempo de espera na fila;
         */

    public List<Long> cincoMaioresTemposDeEspera(){

        List<Long> maioresTempos = listDadosPacientes
                .stream()
                .sorted()
                .map(dados -> dados.getHoras_na_fila())
                .collect(Collectors.toList());

        return maioresTempos;
    }

}
