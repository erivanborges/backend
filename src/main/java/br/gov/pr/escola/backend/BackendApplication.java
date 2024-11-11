package br.gov.pr.escola.backend;


import br.gov.pr.escola.backend.entity.CidadeEntity;
import br.gov.pr.escola.backend.entity.ConsultaEntity;
import br.gov.pr.escola.backend.entity.FuncionarioEntity;
import br.gov.pr.escola.backend.service.CidadeService;
import br.gov.pr.escola.backend.service.ConsultaService;
import br.gov.pr.escola.backend.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {
    
        private static final Logger log = LoggerFactory.getLogger(BackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner logger(ConsultaService servicoConsulta, FuncionarioService servicoFuncionario, CidadeService servicoCidade) {
            return (args) -> {
                
                /*
                    
                    Consultar registros no banco de dados 
                    
                log.info("");
                log.info("======== Listando Consultas ==========");
                for (ConsultaEntity consulta : servicoConsulta.findAll()) {
                    log.info("");
                    log.info("Chave Primaria: " + consulta.getId());
                    log.info("Data da consulta: " + consulta.getData());
                    log.info("Hora da consulta: " + consulta.getHora());
                }
                
                log.info("");
                log.info("======== Listando Funcionarios ==========");
                for (FuncionarioEntity funcionario : servicoFuncionario.findAll()) {
                    log.info("");
                    log.info("Nome Funcionario: " + funcionario.getNome());
                }
                
                FuncionarioEntity funcionario1 = servicoFuncionario.getById(4l);

                log.info("Codigo do funcionario: " + funcionario1.getId());
                log.info("Nome do funcionario: " + funcionario1.getNome());
                log.info("Idade do funcionario: " + funcionario1.getIdade());*/
                
                
                /*
                    Inserir registro no banco de dados
                
                FuncionarioEntity funcionario = new FuncionarioEntity();
                
                funcionario.setNome("Kesley");
                funcionario.setCpf("08973456212");
                funcionario.setIdade(18);
                funcionario.setSalario(15000.0);
                
                CidadeEntity cidade = servicoCidade.getById(3l);
                
                funcionario.setCidade(cidade);
                
                funcionario = servicoFuncionario.save(funcionario);
                
                log.info("Funcionario " + funcionario.getNome() + " foi salvo com sucesso no banco de dados.");*/
                
                
                /*
    
                    Deletar registro no banco de dados
                
                servicoFuncionario.deleteById(6l);
                
                log.info("O funcionario foi excluido com sucesso!");*/
                
            };
        }

}
