package br.gov.sp.etec.estacionamento.controller;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import br.gov.sp.etec.estacionamento.model.Veiculo;
import br.gov.sp.etec.estacionamento.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService service;

    @GetMapping("registrar-entrada")
    public String registrarEntrada() {
        return "registrar-cadastro";   // antes: "registrar-entrada" (arquivo não existe)
    }

    @PostMapping("cadastrar")
    public String cadastrarVeiculo(Veiculo veiculo) {   // antes: void
        service.cadastrarVeiculo(veiculo);
        return "redirect:/painel";
    }

    @GetMapping("/painel")
    public String painel(Model model) {
        // 1. Busca a lista de veículos cadastrados/estacionados
        List<VeiculoEntity> veiculos = service.listaVeiculo();

        // 2. Define o total de vagas fixo do estacionamento (ex: 50 vagas)
        int totalVagas = 50;

        // 3. Calcula as vagas ocupadas e disponíveis
        int vagasOcupadas = veiculos.size();
        int vagasDisponiveis = totalVagas - vagasOcupadas;

        // 4. Adiciona os atributos para o Thymeleaf usar no HTML do painel
        model.addAttribute("veiculos", veiculos);
        model.addAttribute("vagasOcupadas", vagasOcupadas);
        model.addAttribute("vagasDisponiveis", vagasDisponiveis);
        model.addAttribute("totalVagas", totalVagas);

        return "painel"; // Renderiza o arquivo painel.html
    }

        @GetMapping("registrar-saida")
        public String registrarSaida(Model model) {
            var veiculos = service.listaVeiculo();
            model.addAttribute("veiculos", veiculos);
            return "registrar-saida";
        }
        @GetMapping("saida/{id}")
        public String getVeiculo(Model model, @PathVariable Long id){
        service.registrarSaida(id);
        List<VeiculoEntity> veiculos = service.listaVeiculo();
        model.addAttribute("veiculos", veiculos);
        return "registrar-saida";
            }

    @PostMapping("saida/{id}")
    public String confirmarSaida(@PathVariable Long id) {
        service.daletarVeiculo(id);
        List<VeiculoEntity> veiculos = service.listaVeiculo();
        return "redirect:/veiculo/registrar-saida";
    }
    }
