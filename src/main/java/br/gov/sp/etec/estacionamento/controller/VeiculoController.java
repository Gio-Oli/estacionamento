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

        @GetMapping("registrar-saida")
        public String registrarSaida(Model model) {
            var veiculos = service.listaVeiculo();
            model.addAttribute("veiculos", veiculos);
            return "registrar-saida";
        }
        @GetMapping("saida/{id}")
        public String getVeiculo(Model model, @PathVariable Long id){
        List<VeiculoEntity> veiculos = service.listaVeiculo();
        model.addAttribute("veiculos", veiculos);
        VeiculoEntity veiculo = service.buscaVeiculoPorId(id);
        model.addAttribute("veiculo", veiculo);
        return "registrar-saida";
            }

    @PostMapping("saida/{id}")
    public String confirmarSaida(@PathVariable Long id) {
        service.daletarVeiculo(id);
        return "redirect:/veiculo/registrar-saida";
    }
    }
