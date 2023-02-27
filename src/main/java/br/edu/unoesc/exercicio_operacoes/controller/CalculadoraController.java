package br.edu.unoesc.exercicio_operacoes.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.edu.unoesc.exercicio_operacoes.converter.conversorNumerico;

@RestController
public class CalculadoraController {
  

  @GetMapping("/soma")
  public Double soma(@RequestParam String numero1, @RequestParam String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.soma(num1, num2);
  }

  @GetMapping("/soma/{numero1}/{numero2}")
  public Double somaPath(@PathVariable String numero1, @PathVariable String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.soma(num1, num2);
  }

  @GetMapping("/subtracao")
  public Double subtracao(@RequestParam String numero1, @RequestParam String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.subtracao(num1, num2);
  }

  @GetMapping("/subtracao/{numero1}/{numero2}")
  public Double subtracaoPath(@PathVariable String numero1, @PathVariable String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.subtracao(num1, num2);
  }

  @GetMapping("/multiplicacao")
  public Double multiplicacao(@RequestParam String numero1, @RequestParam String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.multiplicacao(num1, num2);
  }

  @GetMapping("/multiplicacao/{numero1}/{numero2}")
  public Double multiplicacaoPath(@PathVariable String numero1, @PathVariable String numero2) {
      Double num1 = conversorNumerico.converteParaDouble(numero1);
      Double num2 = conversorNumerico.converteParaDouble(numero2);
      return Calculadora.multiplicacao(num1, num2);
  }

  @GetMapping("/divisao")
  public Double divisao(@RequestParam String numero1, @RequestParam String numero2) {
      try {
          Double num1 = conversorNumerico.converteParaDouble(numero1);
          Double num2 = conversorNumerico.converteParaDouble(numero2);
          return Calculadora.divisao(num1, num2);
      } catch (IllegalArgumentException e) {
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
      }
  }

  @GetMapping("/divisao/{numero1}/{numero2}")
  public Double divisaoPath(@PathVariable String numero1, @PathVariable String numero2) {
      try {
          Double num1 = conversorNumerico.converteParaDouble(numero1);
          Double num2 = conversorNumerico.converteParaDouble(numero2);
          return Calculadora.divisao(num1, num2);
      } catch (IllegalArgumentException e) {
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
      }
      
  }
  
  @GetMapping("/media/{numero1}/{numero2}")
  public double media(@PathVariable double numero1, @PathVariable double numero2) {
    return (numero1 + numero2) / 2;
  }

  @PostMapping("/potenciacao")
  public double potenciacao(@RequestParam double base, @RequestParam double expoente) {
    return Math.pow(base, expoente);
  }
  


  @PostMapping("/raizquadrada")
  public double raizQuadrada(@RequestParam double numero1) {
    return Math.sqrt(numero1);
  }
  
} 
