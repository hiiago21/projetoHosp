package repository;

import model.DadosModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DadosRepository {
    // método para listar na tela todos os dados do arquivo csv
    public List<DadosModel> listarDados(){
        String path = "src/dados_clinicos.csv";

        //insere os dados na lista
        List<DadosModel> list = new ArrayList<>();

        //abre o arquivo
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            //lê o cabeçalho
            String line = br.readLine();

            //sabendo que tem um cabeçalho, lê a segunda linha com os dados
            line = br.readLine();

            //enquanto a linha for diferente de null, continua lendo
            while (Objects.nonNull(line)){
                //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                //recorta as Strings baseadas nas virgulas
                String[] vect = line.split(";");
                LocalDateTime data_extracao = LocalDateTime.parse(vect[0], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
                String id_usuario = vect[1];
                String situacao = vect[2];
                String central_regulacao_origem = vect[3];
                LocalDate data_solicitacao = LocalDate.parse(vect[4]);
                String sexo = vect[5];
                Double idade = vect[6].isEmpty() ? null : Double.parseDouble(vect[6]);
                String municipio_residencia = vect[7];
                String solicitante = vect[8];
                String municipio_solicitante = vect[9];
                String codigo_cid = vect[10];
                String carater = vect[11];
                String tipo_internacao = vect[12];
                String tipo_leito = vect[13];
                LocalDateTime data_autorizacao = LocalDateTime.parse(vect[14], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
                LocalDateTime data_internacao = LocalDateTime.parse(vect[15], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
                LocalDateTime data_alta = vect[16].isEmpty() ? null : LocalDateTime.parse(vect[16], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
                String executante = vect[17];
                Long horas_na_fila = Long.parseLong(vect[18]);

                /*
                this.data_extracao = LocalDateTime.parse(vect[0]);
                this.id_usuario = vect[1];
                this.situacao = vect[2];
                this.central_regulacao_origem = vect[3];
                this.data_solicitacao = LocalDate.parse(vect[4]);
                this.sexo = vect[5];
                this.idade = Double.parseDouble(vect[6]);
                this.municipio_residencia = vect[7];
                this.solicitante = vect[8];
                this.municipio_solicitante = vect[9];
                this.codigo_cid = vect[10];
                this.carater = vect[11];
                this.tipo_internacao = vect[12];
                this.tipo_leito = vect[13];
                this.data_autorizacao = LocalDateTime.parse(vect[14]);
                this.data_internacao = LocalDateTime.parse(vect[15]);
                this.data_alta = LocalDateTime.parse(vect[16]);
                this.executante = vect[17];
                this.horas_na_fila = Long.parseLong(vect[18]);
                */

                DadosModel change = new DadosModel(data_extracao, id_usuario, situacao, central_regulacao_origem, data_solicitacao,
                        sexo, idade, municipio_residencia, solicitante, municipio_solicitante, codigo_cid, carater,
                        tipo_internacao, tipo_leito, data_autorizacao, data_internacao, data_alta, executante, horas_na_fila);
                System.out.println(change);

                list.add(change);

                line = br.readLine();
            }
            System.out.println("DADOS CLÍNICOS");
            for (DadosModel c : list){
                System.out.println(c);
            }//adicionar metodo toString na outra classe que criar

            return list;
        }catch (IOException e){
            System.err.println("Error: "+e.getMessage());
        }

        return list;
    }
}
